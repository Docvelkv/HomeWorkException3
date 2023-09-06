package view.commands;

import view.View;

public class Finish implements Commands{

    private final View view;

    public Finish(View view) {
        this.view = view;
    }

    @Override
    public String getDescription() {
        return "Закончить работу";
    }

    @Override
    public void execute() {
        view.finish();
    }
}
