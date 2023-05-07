package functionality;

import fileReading.TinfReading;
import fileWriting.TinfWriting;

import javax.swing.*;
import java.util.ArrayList;

public class TinfFunctions
{

    private String path;
    private ArrayList<String> titles, texts;
    private boolean addPushed;

    public TinfFunctions()
    {
        titles = new ArrayList<>();
        texts = new ArrayList<>();
        addPushed = false;
    }

    public boolean isAddPushed() {return addPushed;}
    public void setAddPushed(boolean addPushed){this.addPushed = addPushed;}

    public void initial(String path)
    {
        this.path = path;

        TinfReading reading = new TinfReading();
        reading.scan(path);
        titles = reading.getTitles();
        texts = reading.getTexts();
    }

    public void exit()
    {
        titles.clear();
        texts.clear();
    }

    public void updateList(JComboBox<String> list)
    {
        list.removeAllItems();
        for (String title: titles) list.addItem(title);
    }

    public void fillPage(int index, JTextField infID, JTextArea infText, JTextField infHeader)
    {
        infID.setText(Integer.toString(index));
        infText.setText(texts.get(index));
        infHeader.setText(titles.get(index));
    }

    public void add(String title, String id, String text, JComboBox<String> list)
    {
        int index;
        try
        {
            index = Integer.parseInt(id);
        }catch (Exception e)
        {
            index = titles.size();
        }

        if (index == titles.size())
        {
            titles.add(title);
            texts.add(text);
        }
        else
        {
            ArrayList<String> tempTitles = new ArrayList<>();
            ArrayList<String> tempTexts = new ArrayList<>();

            for (int i = 0; i < index; i++)
            {
                tempTitles.add(titles.get(i));
                tempTexts.add(texts.get(i));
            }
            tempTitles.add(title);
            tempTexts.add(text);
            for (int i = index; i < titles.size(); i++)
            {
                tempTitles.add(titles.get(i));
                tempTexts.add(texts.get(i));
            }

            titles.clear();
            texts.clear();

            titles = tempTitles;
            texts = tempTexts;
        }

        updateList(list);
        list.setSelectedIndex(index);
    }

    public void edit(String title, String id, String text, JComboBox<String> list)
    {
        int newIndex;
        try{newIndex = Integer.parseInt(id);}
        catch (Exception e){newIndex = list.getItemCount();}

        if (newIndex == titles.size())
        {
            titles.set(newIndex, title);
            texts.set(newIndex, text);
        }
        else
        {
            ArrayList<String> tempTitles = new ArrayList<>();
            ArrayList<String> tempTexts = new ArrayList<>();

            int oldIndex = list.getSelectedIndex();
            titles.remove(oldIndex);
            texts.remove(oldIndex);

            for (int i = 0; i < newIndex; i++)
            {
                tempTitles.add(titles.get(i));
                tempTexts.add(texts.get(i));
            }
            tempTitles.add(title);
            tempTexts.add(text);
            for (int i = newIndex; i < titles.size(); i++)
            {
                tempTitles.add(titles.get(i));
                tempTexts.add(texts.get(i));
            }

            titles.clear();
            texts.clear();

            titles = tempTitles;
            texts = tempTexts;
        }

        updateList(list);
        list.setSelectedIndex(newIndex);
    }

    public void delete(int index, JComboBox<String> list)
    {
        titles.remove(index);
        texts.remove(index);
        updateList(list);
    }

    public void save()
    {
        TinfWriting writing = new TinfWriting();
        writing.write(path, titles, texts);
    }

}
