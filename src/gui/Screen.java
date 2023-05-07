package gui;

import javax.swing.*;

public class Screen extends JFrame
{

    //main scene
    protected static JLabel appLogo;
    protected static JTextField appHeader, fileNameSection;
    protected static JButton createFile, openFile, goSettings;

    //settings screen
    protected static JTextField settingsHeader, langPrompt, themePrompt;
    protected static JComboBox<String> langSection, themeSection;
    protected static JButton exitSettings, saveChanges;

    //savf screen
    protected static JTextField savfName, paraSection, valSection;
    protected static JButton changePara, changeVal, addSave, deleteSave, saveSavf, exitSavf, okSavf;
    protected static JComboBox<String> paraList, valList;

    //tinf screen
    protected static JTextField tinfName, infHeader, infID;
    protected static JTextArea infText;
    protected static JComboBox<String> infList;
    protected static JButton saveTinf, exitTinf, addTinf, deleteTinf, okTinf;

    //vitd screen
    protected static JTextField vitdName, vitdHeader, vitdID;
    protected static JTextArea vitdText;
    protected static JComboBox<String> vitdList;
    protected static JButton saveVitd, exitVitd, addVitd, deleteVitd, okVitd, prewVitd;

    //preview vitd screen
    protected static JTextArea slideVitd;
    protected static JButton exitViewVitd, editVitd, prevSlide, nextSlide;
    protected static JTextField viewVitdName;
    public Screen()
    {
        this.setSize(1200, 700);
        this.setLayout(null);
        this.setResizable(false);
        this.setTitle("ladder");

        new CreateNew();
        new Add(this);
        new Visibility(false).turnOff();
        new Visibility(true).main();
        new AppText();
        new Theme(this);
        new Positions();
        new Buttons(this);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

}
