package gui;

import fileReading.SavfReading;

import javax.swing.*;
import java.awt.*;

public class Theme implements IScreen
{

    private Color bgC, fgC, objC;

    protected Theme(JFrame frame)
    {
        detect();

        frame.getContentPane().setBackground(bgC);
        main();
        settings();
        savf();
        tinf();
        vitd();
        viewVitd();
    }

    private void detect()
    {
        SavfReading reading = new SavfReading();
        reading.scan("data/settings.savf");
        String id = reading.getValue("theme");

        if (id.equals("0"))
        {
            bgC = Color.BLACK;
            fgC = Color.BLACK;
            objC = Color.WHITE;
        }

        else if (id.equals("1"))
        {
            bgC = Color.WHITE;
            fgC = Color.WHITE;
            objC = Color.BLACK;
        }
    }

    @Override
    public void main()
    {
        Screen.appLogo.setBackground(objC);
        Screen.appLogo.setOpaque(true);
        Screen.appHeader.setBackground(null);
        Screen.appHeader.setForeground(objC);
        Screen.fileNameSection.setBackground(objC);
        Screen.fileNameSection.setForeground(fgC);
        Screen.createFile.setBackground(objC);
        Screen.createFile.setForeground(fgC);
        Screen.openFile.setBackground(objC);
        Screen.openFile.setForeground(fgC);
        Screen.goSettings.setBackground(objC);
        Screen.goSettings.setForeground(fgC);
    }

    @Override
    public void settings()
    {
        Screen.settingsHeader.setBackground(null);
        Screen.settingsHeader.setForeground(objC);
        Screen.langPrompt.setBackground(objC);
        Screen.langPrompt.setForeground(fgC);
        Screen.themePrompt.setBackground(objC);
        Screen.themePrompt.setForeground(fgC);
        Screen.langSection.setBackground(objC);
        Screen.langSection.setForeground(fgC);
        Screen.themeSection.setBackground(objC);
        Screen.themeSection.setForeground(fgC);
        Screen.exitSettings.setBackground(objC);
        Screen.exitSettings.setForeground(fgC);
        Screen.saveChanges.setBackground(objC);
        Screen.saveChanges.setForeground(fgC);
    }

    @Override
    public void savf()
    {
        Screen.savfName.setBackground(objC);
        Screen.savfName.setForeground(fgC);
        Screen.paraSection.setBackground(objC);
        Screen.paraSection.setForeground(fgC);
        Screen.valSection.setBackground(objC);
        Screen.valSection.setForeground(fgC);
        Screen.changePara.setBackground(objC);
        Screen.changePara.setForeground(fgC);
        Screen.changeVal.setBackground(objC);
        Screen.changeVal.setForeground(fgC);
        Screen.addSave.setBackground(objC);
        Screen.addSave.setForeground(fgC);
        Screen.deleteSave.setBackground(objC);
        Screen.deleteSave.setForeground(fgC);
        Screen.exitSavf.setBackground(objC);
        Screen.exitSavf.setForeground(fgC);
        Screen.saveSavf.setBackground(objC);
        Screen.saveSavf.setForeground(fgC);
        Screen.okSavf.setBackground(objC);
        Screen.okSavf.setForeground(fgC);
        Screen.paraList.setBackground(objC);
        Screen.paraList.setForeground(fgC);
        Screen.valList.setBackground(objC);
        Screen.valList.setForeground(fgC);
    }

    @Override
    public void tinf()
    {
        Screen.tinfName.setBackground(objC);
        Screen.tinfName.setForeground(fgC);
        Screen.infHeader.setBackground(objC);
        Screen.infHeader.setForeground(fgC);
        Screen.infID.setBackground(objC);
        Screen.infID.setForeground(fgC);
        Screen.infText.setBackground(objC);
        Screen.infText.setForeground(fgC);
        Screen.infList.setBackground(objC);
        Screen.infList.setForeground(fgC);
        Screen.saveTinf.setBackground(objC);
        Screen.saveTinf.setForeground(fgC);
        Screen.exitTinf.setBackground(objC);
        Screen.exitTinf.setForeground(fgC);
        Screen.addTinf.setBackground(objC);
        Screen.addTinf.setForeground(fgC);
        Screen.deleteTinf.setBackground(objC);
        Screen.deleteTinf.setForeground(fgC);
        Screen.okTinf.setBackground(objC);
        Screen.okTinf.setForeground(fgC);
    }

    @Override
    public void vitd()
    {
        Screen.vitdName.setBackground(objC);
        Screen.vitdName.setForeground(fgC);
        Screen.vitdHeader.setBackground(objC);
        Screen.vitdHeader.setForeground(fgC);
        Screen.vitdID.setBackground(objC);
        Screen.vitdID.setForeground(fgC);
        Screen.vitdText.setBackground(objC);
        Screen.vitdText.setForeground(fgC);
        Screen.vitdList.setBackground(objC);
        Screen.vitdList.setForeground(fgC);
        Screen.saveVitd.setBackground(objC);
        Screen.saveVitd.setForeground(fgC);
        Screen.exitVitd.setBackground(objC);
        Screen.exitVitd.setForeground(fgC);
        Screen.addVitd.setBackground(objC);
        Screen.addVitd.setForeground(fgC);
        Screen.deleteVitd.setBackground(objC);
        Screen.deleteVitd.setForeground(fgC);
        Screen.okVitd.setBackground(objC);
        Screen.okVitd.setForeground(fgC);
        Screen.prewVitd.setBackground(objC);
        Screen.prewVitd.setForeground(fgC);
    }

    @Override
    public void viewVitd()
    {
        Screen.slideVitd.setBackground(objC);
        Screen.slideVitd.setForeground(fgC);
        Screen.exitViewVitd.setBackground(objC);
        Screen.exitViewVitd.setForeground(fgC);
        Screen.viewVitdName.setBackground(objC);
        Screen.viewVitdName.setForeground(fgC);
        Screen.editVitd.setBackground(objC);
        Screen.editVitd.setForeground(fgC);
        Screen.prevSlide.setBackground(objC);
        Screen.prevSlide.setForeground(fgC);
        Screen.nextSlide.setBackground(objC);
        Screen.nextSlide.setForeground(fgC);
    }
}
