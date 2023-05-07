package gui;

public class Visibility implements IScreen
{
    private boolean isVisible;
    protected Visibility(boolean isVisible)
    {
        this.isVisible = isVisible;
    }

    protected void turnOff()
    {
        main();
        settings();
        savf();
        tinf();
        vitd();
        viewVitd();

        Screen.fileNameSection.setVisible(false);
        Screen.paraSection.setVisible(false);
        Screen.valSection.setVisible(false);
        Screen.okSavf.setVisible(false);
    }

    @Override
    public void main()
    {
        Screen.appLogo.setVisible(isVisible);
        Screen.appHeader.setVisible(isVisible);
        Screen.createFile.setVisible(isVisible);
        Screen.openFile.setVisible(isVisible);
        Screen.goSettings.setVisible(isVisible);
    }

    @Override
    public void settings()
    {
        Screen.settingsHeader.setVisible(isVisible);
        Screen.langPrompt.setVisible(isVisible);
        Screen.themePrompt.setVisible(isVisible);
        Screen.langSection.setVisible(isVisible);
        Screen.themeSection.setVisible(isVisible);
        Screen.exitSettings.setVisible(isVisible);
        Screen.saveChanges.setVisible(isVisible);
    }

    @Override
    public void savf()
    {
        Screen.savfName.setVisible(isVisible);
        Screen.changePara.setVisible(isVisible);
        Screen.changeVal.setVisible(isVisible);
        Screen.addSave.setVisible(isVisible);
        Screen.deleteSave.setVisible(isVisible);
        Screen.saveSavf.setVisible(isVisible);
        Screen.exitSavf.setVisible(isVisible);
        Screen.paraList.setVisible(isVisible);
        Screen.valList.setVisible(isVisible);
    }

    @Override
    public void tinf()
    {
        Screen.tinfName.setVisible(isVisible);
        Screen.infHeader.setVisible(isVisible);
        Screen.infID.setVisible(isVisible);
        Screen.infText.setVisible(isVisible);
        Screen.infList.setVisible(isVisible);
        Screen.saveTinf.setVisible(isVisible);
        Screen.exitTinf.setVisible(isVisible);
        Screen.addTinf.setVisible(isVisible);
        Screen.deleteTinf.setVisible(isVisible);
        Screen.okTinf.setVisible(isVisible);
    }

    @Override
    public void vitd()
    {
        Screen.vitdName.setVisible(isVisible);
        Screen.vitdHeader.setVisible(isVisible);
        Screen.vitdID.setVisible(isVisible);
        Screen.vitdText.setVisible(isVisible);
        Screen.vitdList.setVisible(isVisible);
        Screen.saveVitd.setVisible(isVisible);
        Screen.exitVitd.setVisible(isVisible);
        Screen.addVitd.setVisible(isVisible);
        Screen.deleteVitd.setVisible(isVisible);
        Screen.okVitd.setVisible(isVisible);
        Screen.prewVitd.setVisible(isVisible);
    }

    @Override
    public void viewVitd()
    {
        Screen.slideVitd.setVisible(isVisible);
        Screen.exitViewVitd.setVisible(isVisible);
        Screen.viewVitdName.setVisible(isVisible);
        Screen.editVitd.setVisible(isVisible);
        Screen.prevSlide.setVisible(isVisible);
        Screen.nextSlide.setVisible(isVisible);
    }
}
