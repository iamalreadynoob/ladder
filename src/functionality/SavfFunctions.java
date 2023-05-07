package functionality;

import fileReading.SavfReading;
import fileWriting.SavfWriting;

import javax.swing.*;
import java.util.ArrayList;

public class SavfFunctions
{
    private ArrayList<String> values, params;
    private String path;
    public SavfFunctions()
    {
        values = new ArrayList<>();
        params = new ArrayList<>();
    }

    public void initialize(String path)
    {
        this.path = path;
        SavfReading reading = new SavfReading();
        reading.scan(path);
        params = reading.getParams();
        values = reading.getValues();
    }

    public void updateParamList(JComboBox<String> list)
    {
        list.removeAllItems();
        for (String para: params) list.addItem(para);
        list.setSelectedItem(0);
    }

    public void updateValList(JComboBox<String> list)
    {
        list.removeAllItems();
        for (String val: values) list.addItem(val);
        list.setSelectedItem(0);
    }

    public void changeVal(String newVal, int index, JComboBox<String> list)
    {
        values.set(index, newVal);
        updateValList(list);
        list.setSelectedIndex(index);
    }

    public void changePara(String newPara, int index, JComboBox<String> list)
    {
        params.set(index, newPara);
        updateParamList(list);
        list.setSelectedIndex(index);
    }

    public void addLine(String newPara, String newVal, JComboBox<String> paraList, JComboBox<String> valList)
    {
        values.add(newVal);
        params.add(newPara);

        updateParamList(paraList);
        updateValList(valList);

        paraList.setSelectedIndex(paraList.getItemCount() - 1);
        valList.setSelectedIndex(valList.getItemCount() - 1);
    }

    public void delete(int index, JComboBox<String> val, JComboBox<String> para)
    {
        values.remove(index);
        params.remove(index);

        updateValList(val);
        updateParamList(para);
    }

    public void save()
    {
        SavfWriting.write(path, params, values);
    }

    public void exit()
    {
        params.clear();
        values.clear();
    }
}
