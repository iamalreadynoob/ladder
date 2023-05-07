package gui;

import javax.swing.*;

public class Add implements IScreen
{
    private JFrame frame;

    protected Add(JFrame frame)
    {
        this.frame = frame;

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
        frame.add(Screen.appLogo);
        frame.add(Screen.appHeader);
        frame.add(Screen.createFile);
        frame.add(Screen.openFile);
        frame.add(Screen.goSettings);
        frame.add(Screen.fileNameSection);
    }

    @Override
    public void settings()
    {
        frame.add(Screen.settingsHeader);
        frame.add(Screen.langPrompt);
        frame.add(Screen.themePrompt);
        frame.add(Screen.langSection);
        frame.add(Screen.themeSection);
        frame.add(Screen.exitSettings);
        frame.add(Screen.saveChanges);
    }

    @Override
    public void savf()
    {
        frame.add(Screen.savfName);
        frame.add(Screen.paraSection);
        frame.add(Screen.valSection);
        frame.add(Screen.changePara);
        frame.add(Screen.changeVal);
        frame.add(Screen.addSave);
        frame.add(Screen.deleteSave);
        frame.add(Screen.saveSavf);
        frame.add(Screen.exitSavf);
        frame.add(Screen.okSavf);
        frame.add(Screen.paraList);
        frame.add(Screen.valList);
    }

    @Override
    public void tinf()
    {
        frame.add(Screen.tinfName);
        frame.add(Screen.infHeader);
        frame.add(Screen.infID);
        frame.add(Screen.infText);
        frame.add(Screen.infList);
        frame.add(Screen.saveTinf);
        frame.add(Screen.exitTinf);
        frame.add(Screen.addTinf);
        frame.add(Screen.deleteTinf);
        frame.add(Screen.okTinf);
    }

    @Override
    public void vitd()
    {
        frame.add(Screen.vitdName);
        frame.add(Screen.vitdHeader);
        frame.add(Screen.vitdID);
        frame.add(Screen.vitdText);
        frame.add(Screen.vitdList);
        frame.add(Screen.saveVitd);
        frame.add(Screen.exitVitd);
        frame.add(Screen.addVitd);
        frame.add(Screen.deleteVitd);
        frame.add(Screen.okVitd);
        frame.add(Screen.prewVitd);
    }

    @Override
    public void viewVitd()
    {
        frame.add(Screen.slideVitd);
        frame.add(Screen.exitViewVitd);
        frame.add(Screen.viewVitdName);
        frame.add(Screen.editVitd);
        frame.add(Screen.prevSlide);
        frame.add(Screen.nextSlide);
    }
}
