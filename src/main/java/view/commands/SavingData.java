package view.commands;

import view.View;

public class SavingData implements Commands{
    private final View view;

    public SavingData(View view) {
        this.view = view;
    }

    @Override
    public String getDescription() {
        return "Сохранить данные в файл";
    }

    @Override
    public void execute() {
        view.savingData();
    }
}
