package gui;

import javax.swing.*;

public class CreateNew implements IScreen
{
    protected CreateNew()
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
        Screen.appLogo = new JLabel();
        Screen.appHeader = new JTextField();
        Screen.createFile = new JButton();
        Screen.openFile = new JButton();
        Screen.goSettings = new JButton();
        Screen.fileNameSection = new JTextField();
    }

    @Override
    public void settings()
    {
        Screen.settingsHeader = new JTextField();
        Screen.langPrompt = new JTextField();
        Screen.themePrompt = new JTextField();
        Screen.langSection = new JComboBox<>();
        Screen.themeSection = new JComboBox<>();
        Screen.exitSettings = new JButton();
        Screen.saveChanges = new JButton();
    }

    @Override
    public void savf()
    {
        Screen.savfName = new JTextField();
        Screen.paraSection = new JTextField();
        Screen.valSection = new JTextField();
        Screen.changePara = new JButton();
        Screen.changeVal = new JButton();
        Screen.addSave = new JButton();
        Screen.deleteSave = new JButton();
        Screen.saveSavf = new JButton();
        Screen.exitSavf = new JButton();
        Screen.okSavf = new JButton();
        Screen.paraList = new JComboBox<>();
        Screen.valList = new JComboBox<>();
    }

    @Override
    public void tinf()
    {
        Screen.tinfName = new JTextField();
        Screen.infHeader = new JTextField();
        Screen.infID = new JTextField();
        Screen.infText = new JTextArea();
        Screen.infList = new JComboBox<>();
        Screen.saveTinf = new JButton();
        Screen.exitTinf = new JButton();
        Screen.addTinf = new JButton();
        Screen.deleteTinf = new JButton();
        Screen.okTinf = new JButton();
    }

    @Override
    public void vitd()
    {
        Screen.vitdName = new JTextField();
        Screen.vitdHeader = new JTextField();
        Screen.vitdID = new JTextField();
        Screen.vitdText = new JTextArea();
        Screen.vitdList = new JComboBox<>();
        Screen.saveVitd = new JButton();
        Screen.exitVitd = new JButton();
        Screen.addVitd = new JButton();
        Screen.deleteVitd = new JButton();
        Screen.okVitd = new JButton();
        Screen.prewVitd = new JButton();
    }

    @Override
    public void viewVitd()
    {
        Screen.slideVitd = new JTextArea();
        Screen.exitViewVitd = new JButton();
        Screen.viewVitdName = new JTextField();
        Screen.editVitd = new JButton();
        Screen.prevSlide = new JButton();
        Screen.nextSlide = new JButton();
    }
}
