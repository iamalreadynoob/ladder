package gui;

import fileReading.DataReading;
import fileReading.SavfReading;

import java.util.ArrayList;

public class AppText implements IScreen
{
    private ArrayList<String> script;
    protected AppText()
    {
        SavfReading reading = new SavfReading();
        reading.scan("data/settings.savf");

        DataReading data = new DataReading();
        data.scan("data/lang.csv");

        script = data.getColumn(data.getHeaders().get(Integer.parseInt(reading.getValue("lang"))));

        main();
        settings();
        savf();
        tinf();
        vitd();
        viewVitd();
    }

    @Override
    public void main()
    {
        Screen.appHeader.setText("LADDER");
        Screen.createFile.setText(script.get(0));
        Screen.openFile.setText(script.get(1));
        Screen.goSettings.setText(script.get(2));
    }

    @Override
    public void settings()
    {
        Screen.settingsHeader.setText(script.get(2));
        Screen.langPrompt.setText(script.get(4));
        Screen.themePrompt.setText(script.get(5));
        Screen.langSection.addItem(script.get(7));
        Screen.langSection.addItem(script.get(8));
        Screen.themeSection.addItem(script.get(17));
        Screen.themeSection.addItem(script.get(18));
        Screen.exitSettings.setText(script.get(3));
        Screen.saveChanges.setText(script.get(6));
    }

    @Override
    public void savf()
    {
        Screen.changePara.setText(script.get(10));
        Screen.changeVal.setText(script.get(11));
        Screen.addSave.setText(script.get(12));
        Screen.deleteSave.setText(script.get(13));
        Screen.saveSavf.setText(script.get(6));
        Screen.exitSavf.setText(script.get(9));
        Screen.okSavf.setText(script.get(14));
    }

    @Override
    public void tinf()
    {
        Screen.addTinf.setText(script.get(12));
        Screen.deleteTinf.setText(script.get(13));
        Screen.saveTinf.setText(script.get(6));
        Screen.exitTinf.setText(script.get(9));
        Screen.okTinf.setText(script.get(14));
    }

    @Override
    public void vitd()
    {
        Screen.addVitd.setText(script.get(12));
        Screen.deleteVitd.setText(script.get(13));
        Screen.saveVitd.setText(script.get(6));
        Screen.exitVitd.setText(script.get(9));
        Screen.okVitd.setText(script.get(14));
        Screen.prewVitd.setText(script.get(15));
    }

    @Override
    public void viewVitd()
    {
        Screen.exitViewVitd.setText(script.get(9));
        Screen.editVitd.setText(script.get(16));
        Screen.prevSlide.setText("<=");
        Screen.nextSlide.setText("=>");
    }
}
