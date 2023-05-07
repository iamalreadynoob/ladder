package gui;

import javax.swing.*;
import java.awt.*;

public class Positions implements IScreen
{

    protected Positions()
    {
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
        Screen.appLogo.setBounds(110, 100, 200, 200);
        Screen.appLogo.setBorder(null);

        Screen.appHeader.setBounds(400, 100, 700, 200);
        Screen.appHeader.setBorder(null);
        Screen.appHeader.setFont(new Font("Arial", Font.BOLD, 150));
        Screen.appHeader.setEditable(false);

        Screen.createFile.setBounds(50, 450, 300, 100);
        Screen.createFile.setBorder(null);
        Screen.createFile.setFont(new Font("Arial", Font.BOLD, 50));

        Screen.openFile.setBounds(450, 450, 300, 100);
        Screen.openFile.setBorder(null);
        Screen.openFile.setFont(new Font("Arial", Font.BOLD, 50));

        Screen.goSettings.setBounds(850, 450, 300, 100);
        Screen.goSettings.setBorder(null);
        Screen.goSettings.setFont(new Font("Arial", Font.BOLD, 50));

        Screen.fileNameSection.setBounds(50, 450, 300, 100);
        Screen.fileNameSection.setBorder(null);
        Screen.fileNameSection.setFont(new Font("Arial", Font.BOLD, 50));
    }

    @Override
    public void settings()
    {
        Screen.settingsHeader.setBounds(30, 30, 300, 100);
        Screen.settingsHeader.setFont(new Font("Arial", Font.BOLD, 50));
        Screen.settingsHeader.setBorder(null);
        Screen.settingsHeader.setEditable(false);

        Screen.exitSettings.setBounds(1000, 30, 170, 100);
        Screen.exitSettings.setFont(new Font("Arial", Font.BOLD, 50));
        Screen.exitSettings.setBorder(null);

        Screen.langPrompt.setBounds(30, 200, 400, 150);
        Screen.langPrompt.setFont(new Font("Arial", Font.BOLD, 75));
        Screen.langPrompt.setBorder(null);
        Screen.langPrompt.setEditable(false);
        Screen.langPrompt.setHorizontalAlignment(SwingConstants.CENTER);

        Screen.themePrompt.setBounds(30, 400, 400, 150);
        Screen.themePrompt.setFont(new Font("Arial", Font.BOLD, 75));
        Screen.themePrompt.setBorder(null);
        Screen.themePrompt.setEditable(false);
        Screen.themePrompt.setHorizontalAlignment(SwingConstants.CENTER);

        Screen.langSection.setBounds(600, 200, 400, 150);
        Screen.langSection.setFont(new Font("Arial", Font.BOLD, 75));
        Screen.langSection.setBorder(null);
        Screen.langSection.setSelectedItem(null);

        Screen.themeSection.setBounds(600, 400, 400, 150);
        Screen.themeSection.setFont(new Font("Arial", Font.BOLD, 75));
        Screen.themeSection.setBorder(null);
        Screen.themeSection.setSelectedItem(null);

        Screen.saveChanges.setBounds(1000, 555, 170, 100);
        Screen.saveChanges.setFont(new Font("Arial", Font.BOLD, 50));
        Screen.saveChanges.setBorder(null);
    }

    @Override
    public void savf()
    {
        Screen.saveSavf.setBounds(10, 10, 200, 100);
        Screen.saveSavf.setFont(new Font("Arial", Font.BOLD, 50));
        Screen.saveSavf.setBorder(null);

        Screen.savfName.setBounds(240, 10, 500, 100);
        Screen.savfName.setFont(new Font("Arial", Font.BOLD, 50));
        Screen.savfName.setBorder(null);
        Screen.savfName.setHorizontalAlignment(SwingConstants.CENTER);
        Screen.savfName.setEditable(false);

        Screen.exitSavf.setBounds(770, 10, 200, 100);
        Screen.exitSavf.setFont(new Font("Arial", Font.BOLD, 50));
        Screen.exitSavf.setBorder(null);

        Screen.paraList.setBounds(10, 160, 400, 100);
        Screen.paraList.setFont(new Font("Arial", Font.BOLD, 30));
        Screen.paraList.setBorder(null);

        Screen.valList.setBounds(570, 160, 400, 100);
        Screen.valList.setFont(new Font("Arial", Font.BOLD, 30));
        Screen.valList.setBorder(null);

        Screen.paraSection.setBounds(10, 300, 400, 100);
        Screen.paraSection.setFont(new Font("Arial", Font.BOLD, 30));
        Screen.paraSection.setBorder(null);
        Screen.paraSection.setHorizontalAlignment(SwingConstants.CENTER);

        Screen.valSection.setBounds(570, 300, 400, 100);
        Screen.valSection.setFont(new Font("Arial", Font.BOLD, 30));
        Screen.valSection.setBorder(null);
        Screen.valSection.setHorizontalAlignment(SwingConstants.CENTER);

        Screen.okSavf.setBounds(10, 450, 400, 100);
        Screen.okSavf.setFont(new Font("Arial", Font.BOLD, 30));
        Screen.okSavf.setBorder(null);

        Screen.changePara.setBounds(1000, 160, 180, 80);
        Screen.changePara.setFont(new Font("Arial", Font.BOLD, 15));
        Screen.changePara.setBorder(null);

        Screen.changeVal.setBounds(1000, 250, 180, 80);
        Screen.changeVal.setFont(new Font("Arial", Font.BOLD, 15));
        Screen.changeVal.setBorder(null);

        Screen.addSave.setBounds(1000, 340, 180, 80);
        Screen.addSave.setFont(new Font("Arial", Font.BOLD, 15));
        Screen.addSave.setBorder(null);

        Screen.deleteSave.setBounds(1000, 430, 180, 80);
        Screen.deleteSave.setFont(new Font("Arial", Font.BOLD, 15));
        Screen.deleteSave.setBorder(null);
    }

    @Override
    public void tinf()
    {
        Screen.saveTinf.setBounds(10, 10, 200, 100);
        Screen.saveTinf.setFont(new Font("Arial", Font.BOLD, 50));
        Screen.saveTinf.setBorder(null);

        Screen.tinfName.setBounds(240, 10, 500, 100);
        Screen.tinfName.setFont(new Font("Arial", Font.BOLD, 50));
        Screen.tinfName.setBorder(null);
        Screen.tinfName.setHorizontalAlignment(SwingConstants.CENTER);
        Screen.tinfName.setEditable(false);

        Screen.exitTinf.setBounds(770, 10, 200, 100);
        Screen.exitTinf.setFont(new Font("Arial", Font.BOLD, 50));
        Screen.exitTinf.setBorder(null);

        Screen.infList.setBounds(10, 160, 400, 60);
        Screen.infList.setFont(new Font("Arial", Font.BOLD, 30));
        Screen.infList.setBorder(null);

        Screen.infHeader.setBounds(10, 230, 400, 60);
        Screen.infHeader.setFont(new Font("Arial", Font.BOLD, 30));
        Screen.infHeader.setBorder(null);

        Screen.addTinf.setBounds(570, 160, 200, 60);
        Screen.addTinf.setFont(new Font("Arial", Font.BOLD, 30));
        Screen.addTinf.setBorder(null);

        Screen.deleteTinf.setBounds(790, 160, 200, 60);
        Screen.deleteTinf.setFont(new Font("Arial", Font.BOLD, 30));
        Screen.deleteTinf.setBorder(null);

        Screen.infID.setBounds(570, 230, 200, 60);
        Screen.infID.setFont(new Font("Arial", Font.BOLD, 30));
        Screen.infID.setBorder(null);

        Screen.okTinf.setBounds(790, 230, 200, 60);
        Screen.okTinf.setFont(new Font("Arial", Font.BOLD, 30));
        Screen.okTinf.setBorder(null);

        Screen.infText.setBounds(10, 300, 1180, 350);
        Screen.infText.setFont(new Font("Arial", Font.BOLD, 30));
        Screen.infText.setBorder(null);
        Screen.infText.setLineWrap(true);
        Screen.infText.setWrapStyleWord(true);
    }

    @Override
    public void vitd()
    {
        Screen.saveVitd.setBounds(10, 10, 200, 100);
        Screen.saveVitd.setFont(new Font("Arial", Font.BOLD, 50));
        Screen.saveVitd.setBorder(null);

        Screen.vitdName.setBounds(240, 10, 500, 100);
        Screen.vitdName.setFont(new Font("Arial", Font.BOLD, 50));
        Screen.vitdName.setBorder(null);
        Screen.vitdName.setHorizontalAlignment(SwingConstants.CENTER);
        Screen.vitdName.setEditable(false);

        Screen.exitVitd.setBounds(770, 10, 200, 100);
        Screen.exitVitd.setFont(new Font("Arial", Font.BOLD, 50));
        Screen.exitVitd.setBorder(null);

        Screen.prewVitd.setBounds(1000, 10, 150, 100);
        Screen.prewVitd.setFont(new Font("Arial", Font.BOLD, 25));
        Screen.prewVitd.setBorder(null);

        Screen.vitdList.setBounds(10, 160, 400, 60);
        Screen.vitdList.setFont(new Font("Arial", Font.BOLD, 30));
        Screen.vitdList.setBorder(null);

        Screen.vitdHeader.setBounds(10, 230, 400, 60);
        Screen.vitdHeader.setFont(new Font("Arial", Font.BOLD, 30));
        Screen.vitdHeader.setBorder(null);

        Screen.addVitd.setBounds(570, 160, 200, 60);
        Screen.addVitd.setFont(new Font("Arial", Font.BOLD, 30));
        Screen.addVitd.setBorder(null);

        Screen.deleteVitd.setBounds(790, 160, 200, 60);
        Screen.deleteVitd.setFont(new Font("Arial", Font.BOLD, 30));
        Screen.deleteVitd.setBorder(null);

        Screen.vitdID.setBounds(570, 230, 200, 60);
        Screen.vitdID.setFont(new Font("Arial", Font.BOLD, 30));
        Screen.vitdID.setBorder(null);

        Screen.okVitd.setBounds(790, 230, 200, 60);
        Screen.okVitd.setFont(new Font("Arial", Font.BOLD, 30));
        Screen.okVitd.setBorder(null);

        Screen.vitdText.setBounds(10, 300, 1180, 350);
        Screen.vitdText.setFont(new Font("Arial", Font.BOLD, 30));
        Screen.vitdText.setBorder(null);
        Screen.vitdText.setLineWrap(true);
        Screen.vitdText.setWrapStyleWord(true);
    }

    @Override
    public void viewVitd()
    {
        Screen.viewVitdName.setBounds(340, 10, 500, 100);
        Screen.viewVitdName.setFont(new Font("Arial", Font.BOLD, 50));
        Screen.viewVitdName.setBorder(null);
        Screen.viewVitdName.setHorizontalAlignment(SwingConstants.CENTER);
        Screen.viewVitdName.setEditable(false);

        Screen.exitViewVitd.setBounds(10, 10, 200, 100);
        Screen.exitViewVitd.setFont(new Font("Arial", Font.BOLD, 50));
        Screen.exitViewVitd.setBorder(null);

        Screen.editVitd.setBounds(1000, 10, 150, 100);
        Screen.editVitd.setFont(new Font("Arial", Font.BOLD, 50));
        Screen.editVitd.setBorder(null);

        Screen.slideVitd.setBounds(120, 160, 960, 490);
        Screen.slideVitd.setFont(new Font("Arial", Font.BOLD, 30));
        Screen.slideVitd.setBorder(null);
        Screen.slideVitd.setEditable(false);
        Screen.slideVitd.setLineWrap(true);
        Screen.slideVitd.setWrapStyleWord(true);

        Screen.prevSlide.setBounds(10, 340, 100, 100);
        Screen.prevSlide.setFont(new Font("Arial", Font.BOLD, 30));
        Screen.prevSlide.setBorder(null);

        Screen.nextSlide.setBounds(1090, 340, 100, 100);
        Screen.nextSlide.setFont(new Font("Arial", Font.BOLD, 30));
        Screen.nextSlide.setBorder(null);
    }
}
