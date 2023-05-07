package gui;

import fileWriting.SavfWriting;
import fileWriting.TextWriting;
import functionality.SavfFunctions;
import functionality.TinfFunctions;
import functionality.VitdFunctionality;
import functionality.VitdPreview;
import stringHandling.ShortedProcesses;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.io.File;

public class Buttons implements IScreen
{
    private JFrame frame;
    private SavfFunctions savfFunctions;
    private TinfFunctions tinfFunctions;
    private VitdPreview vitdPreview;
    private VitdFunctionality vitdFunctions;
    protected Buttons(JFrame frame)
    {
        this.frame = frame;
        savfFunctions = new SavfFunctions();
        tinfFunctions = new TinfFunctions();
        vitdPreview = new VitdPreview();
        vitdFunctions = new VitdFunctionality();

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
        Screen.fileNameSection.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                if (Screen.fileNameSection.getText().endsWith(".savf"))
                {
                    new Visibility(false).main();
                    Screen.fileNameSection.setVisible(false);
                    new Visibility(true).savf();
                    File file = new File(Screen.fileNameSection.getText());
                    Screen.fileNameSection.setText(null);
                    savfFunctions.initialize(file.getPath());
                    Screen.savfName.setText(file.getName());
                }
                else if (Screen.fileNameSection.getText().endsWith(".tinf"))
                {
                    new Visibility(false).main();
                    Screen.fileNameSection.setVisible(false);
                    new Visibility(true).tinf();
                    File file = new File(Screen.fileNameSection.getText());
                    Screen.fileNameSection.setText(null);
                    tinfFunctions.initial(file.getPath());
                    Screen.tinfName.setText(file.getName());
                }
                else if (Screen.fileNameSection.getText().endsWith(".vitd"))
                {
                    new Visibility(false).main();
                    Screen.fileNameSection.setVisible(false);
                    new Visibility(true).vitd();
                    Screen.prewVitd.setVisible(false);
                    File file = new File(Screen.fileNameSection.getText());
                    Screen.fileNameSection.setText(null);
                    vitdFunctions.initialize(file.getPath());
                    Screen.vitdName.setText(file.getName());
                }
            }
        });

        Screen.createFile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                Screen.createFile.setVisible(false);
                Screen.fileNameSection.setVisible(true);
            }
        });

        Screen.openFile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                JFileChooser chooser = new JFileChooser();
                int value = chooser.showOpenDialog(frame);

                if (value == JFileChooser.APPROVE_OPTION)
                {
                    File file = chooser.getSelectedFile();

                    new Visibility(false).main();
                    if (file.getPath().endsWith(".savf"))
                    {
                        Screen.savfName.setText(file.getName());
                        savfFunctions.initialize(file.getPath());
                        savfFunctions.updateValList(Screen.valList);
                        savfFunctions.updateParamList(Screen.paraList);

                        new Visibility(true).savf();
                    }
                    else if (file.getPath().endsWith(".tinf"))
                    {
                        Screen.tinfName.setText(file.getName());
                        new Visibility(true).tinf();

                        tinfFunctions.initial(file.getPath());
                        tinfFunctions.updateList(Screen.infList);
                        if (Screen.infList.getItemCount() > 0) tinfFunctions.fillPage(0, Screen.infID, Screen.infText, Screen.infHeader);
                    }
                    else if (file.getPath().endsWith(".vitd"))
                    {
                        vitdPreview.initialize(file.getPath());
                        vitdPreview.load(0, Screen.slideVitd);
                        vitdPreview.setName(file.getName());
                        Screen.viewVitdName.setText(file.getName());
                        new Visibility(true).viewVitd();

                    }
                }
            }
        });

        Screen.goSettings.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                new Visibility(false).main();
                Screen.fileNameSection.setVisible(false);
                new Visibility(true).settings();
            }
        });
    }

    @Override
    public void settings()
    {
        Screen.exitSettings.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                new Visibility(false).settings();
                Screen.fileNameSection.setVisible(false);
                new Visibility(true).main();
            }
        });

        Screen.saveChanges.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                if (Screen.langSection.getSelectedItem() != null) SavfWriting.change("data/settings.savf","lang", Integer.toString(Screen.langSection.getSelectedIndex()));
                if (Screen.themeSection.getSelectedItem() != null) SavfWriting.change("data/settings.savf", "theme", Integer.toString(Screen.themeSection.getSelectedIndex()));
            }
        });
    }

    @Override
    public void savf()
    {
        Screen.exitSavf.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                new Visibility(false).savf();
                Screen.paraSection.setVisible(false);
                Screen.valSection.setVisible(false);
                Screen.okSavf.setVisible(false);
                savfFunctions.exit();
                new Visibility(true).main();
            }
        });

        Screen.changePara.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                Screen.paraSection.setVisible(true);
                Screen.okSavf.setVisible(true);
            }
        });

        Screen.changeVal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                Screen.valSection.setVisible(true);
                Screen.okSavf.setVisible(true);
            }
        });

        Screen.addSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                Screen.valSection.setVisible(true);
                Screen.paraSection.setVisible(true);
                Screen.okSavf.setVisible(true);
            }
        });

        Screen.deleteSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                savfFunctions.delete(Screen.paraList.getSelectedIndex(), Screen.valList, Screen.paraList);
            }
        });

        Screen.saveSavf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                savfFunctions.save();
            }
        });

        Screen.okSavf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                if (!Screen.paraSection.isVisible()) savfFunctions.changeVal(Screen.valSection.getText(), Screen.valList.getSelectedIndex(), Screen.valList);
                else if (!Screen.valSection.isVisible()) savfFunctions.changePara(Screen.paraSection.getText(), Screen.paraList.getSelectedIndex(), Screen.paraList);
                else savfFunctions.addLine(Screen.paraSection.getText(), Screen.valSection.getText(), Screen.paraList, Screen.valList);

                Screen.paraSection.setVisible(false);
                Screen.valSection.setVisible(false);
                Screen.okSavf.setVisible(false);

                Screen.paraSection.setText(null);
                Screen.valSection.setText(null);
            }
        });

        Screen.paraList.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                if (Screen.paraList.getItemCount() != 0 && Screen.valList.getItemCount() != 0)
                {
                    Screen.valList.setSelectedIndex(Screen.paraList.getSelectedIndex());
                }
            }
        });

        Screen.valList.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                if (Screen.valList.getItemCount() != 0 && Screen.paraList.getItemCount() != 0)
                {
                    Screen.paraList.setSelectedIndex(Screen.valList.getSelectedIndex());
                }
            }
        });
    }

    @Override
    public void tinf()
    {
        Screen.exitTinf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                tinfFunctions.exit();
                new Visibility(false).tinf();
                new Visibility(true).main();
            }
        });

        Screen.saveTinf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                tinfFunctions.save();
            }
        });

        Screen.addTinf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                tinfFunctions.setAddPushed(true);
                Screen.infHeader.setText(null);
                Screen.infText.setText(null);
                Screen.infID.setText(Integer.toString(Screen.infList.getItemCount()));
            }
        });

        Screen.deleteTinf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                tinfFunctions.delete(Screen.infList.getSelectedIndex(), Screen.infList);
                if (Screen.infList.getItemCount() > 0) {tinfFunctions.fillPage(0, Screen.infID, Screen.infText, Screen.infHeader);}
                else
                {
                    Screen.infID.setText(null);
                    Screen.infText.setText(null);
                    Screen.infHeader.setText(null);
                }
            }
        });

        Screen.okTinf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (tinfFunctions.isAddPushed())
                {
                    tinfFunctions.add(Screen.infHeader.getText(), Screen.infID.getText(), Screen.infText.getText(), Screen.infList);
                    tinfFunctions.setAddPushed(false);
                }
                else
                {
                    tinfFunctions.edit(Screen.infHeader.getText(), Screen.infID.getText(), Screen.infText.getText(), Screen.infList);
                }
            }
        });

        Screen.infList.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (Screen.infList.getItemCount() > 0) tinfFunctions.fillPage(Screen.infList.getSelectedIndex(), Screen.infID, Screen.infText, Screen.infHeader);
            }
        });
    }

    @Override
    public void vitd()
    {
        Screen.vitdList.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                if (Screen.vitdList.getItemCount() > 0) vitdFunctions.fill(Screen.vitdList.getSelectedIndex(), Screen.vitdHeader, Screen.vitdID, Screen.vitdText);
            }
        });

        Screen.saveVitd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                vitdFunctions.save();
            }
        });

        Screen.exitVitd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                new Visibility(false).vitd();
                new Visibility(true).main();
                vitdFunctions.exit();
            }
        });

        Screen.addVitd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                vitdFunctions.setAddPushed(true);
                Screen.vitdHeader.setText(null);
                Screen.vitdID.setText(null);
                Screen.vitdText.setText(null);
            }
        });

        Screen.deleteVitd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                if (Screen.vitdList.getItemCount() > 0) vitdFunctions.delete(Screen.vitdList.getSelectedIndex(), Screen.vitdList);
            }
        });

        Screen.okVitd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (vitdFunctions.isAddPushed())
                {
                    vitdFunctions.add(Screen.vitdHeader.getText(), Screen.vitdID.getText(), Screen.vitdText.getText(), Screen.vitdList);
                    vitdFunctions.setAddPushed(false);
                }
                else
                {
                    vitdFunctions.edit(Screen.vitdHeader.getText(), Screen.vitdID.getText(), Screen.vitdText.getText(), Screen.vitdList);
                }
            }
        });

        Screen.prewVitd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                new Visibility(false).vitd();
                new Visibility(true).viewVitd();
                vitdFunctions.exit();
                vitdPreview.initialize(vitdPreview.getPath());
                vitdPreview.load(0, Screen.slideVitd);
                Screen.viewVitdName.setText(Screen.vitdName.getText());
            }
        });
    }

    @Override
    public void viewVitd()
    {
        Screen.exitViewVitd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                vitdPreview.exit();
                new Visibility(false).viewVitd();
                new Visibility(true).main();
            }
        });

        Screen.editVitd.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                vitdPreview.exit();
                vitdFunctions.initialize(vitdPreview.getPath());
                vitdFunctions.update(Screen.vitdList);
                Screen.vitdName.setText(vitdPreview.getName());
                new Visibility(false).viewVitd();
                new Visibility(true).vitd();
            }
        });

        Screen.prevSlide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                if (vitdPreview.getLoc() > 0)
                {
                    vitdPreview.setLoc(vitdPreview.getLoc() - 1);
                    vitdPreview.load(vitdPreview.getLoc(), Screen.slideVitd);
                }
            }
        });

        Screen.nextSlide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                if (vitdPreview.getLoc() < vitdPreview.getSize())
                {
                    vitdPreview.setLoc(vitdPreview.getLoc() + 1);
                    vitdPreview.load(vitdPreview.getLoc(), Screen.slideVitd);
                }
            }
        });
    }
}
