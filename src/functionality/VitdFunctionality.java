package functionality;

import fileReading.TinfReading;
import fileWriting.TinfWriting;

import javax.swing.*;
import java.util.ArrayList;

public class VitdFunctionality
{

    private String path;
    private ArrayList<String> texts, headers;
    private boolean addPushed;

    public VitdFunctionality()
    {
        texts = new ArrayList<>();
        headers = new ArrayList<>();
    }

    public void initialize(String path)
    {
        TinfReading reading = new TinfReading();
        reading.scan(path);
        this.path = path;
        texts = reading.getTexts();
        headers = reading.getTitles();
    }

    public void exit()
    {
        texts.clear();
        headers.clear();
    }

    public boolean isAddPushed() {return addPushed;}
    public void setAddPushed(boolean addPushed) {this.addPushed = addPushed;}

    public void update(JComboBox<String> list)
    {
        list.removeAllItems();
        for (String h: headers) list.addItem(h);
    }

    public void fill(int index, JTextField vitdHeader, JTextField vitdID, JTextArea vitdText)
    {
        vitdHeader.setText(headers.get(index));
        vitdID.setText(Integer.toString(index));
        vitdText.setText(texts.get(index));
    }

    public void add(String title, String id, String text, JComboBox<String> list)
    {
        int index;
        try
        {
            index = Integer.parseInt(id);
        }catch (Exception e)
        {
            index = headers.size();
        }

        if (index == headers.size())
        {
            headers.add(title);
            texts.add(text);
        }
        else
        {
            ArrayList<String> tempTitles = new ArrayList<>();
            ArrayList<String> tempTexts = new ArrayList<>();

            for (int i = 0; i < index; i++)
            {
                tempTitles.add(headers.get(i));
                tempTexts.add(texts.get(i));
            }
            tempTitles.add(title);
            tempTexts.add(text);
            for (int i = index; i < headers.size(); i++)
            {
                tempTitles.add(headers.get(i));
                tempTexts.add(texts.get(i));
            }

            headers.clear();
            texts.clear();

            headers = tempTitles;
            texts = tempTexts;
        }

        update(list);
        list.setSelectedIndex(index);
    }

    public void edit(String title, String id, String text, JComboBox<String> list)
    {
        int newIndex;
        try{newIndex = Integer.parseInt(id);}
        catch (Exception e){newIndex = list.getItemCount();}

        if (newIndex == headers.size())
        {
            headers.set(newIndex, title);
            texts.set(newIndex, text);
        }
        else
        {
            ArrayList<String> tempTitles = new ArrayList<>();
            ArrayList<String> tempTexts = new ArrayList<>();

            int oldIndex = list.getSelectedIndex();
            headers.remove(oldIndex);
            texts.remove(oldIndex);

            for (int i = 0; i < newIndex; i++)
            {
                tempTitles.add(headers.get(i));
                tempTexts.add(texts.get(i));
            }
            tempTitles.add(title);
            tempTexts.add(text);
            for (int i = newIndex; i < headers.size(); i++)
            {
                tempTitles.add(headers.get(i));
                tempTexts.add(texts.get(i));
            }

            headers.clear();
            texts.clear();

            headers = tempTitles;
            texts = tempTexts;
        }

        update(list);
        list.setSelectedIndex(newIndex);
    }

    public void delete(int index, JComboBox<String> list)
    {
        headers.remove(index);
        texts.remove(index);
        update(list);
    }

    public void save()
    {
        TinfWriting writing = new TinfWriting();
        writing.write(path, headers, texts);
    }
}
