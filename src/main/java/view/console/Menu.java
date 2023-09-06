package view.console;

import view.View;
import view.commands.Commands;
import view.commands.Finish;
import view.commands.SavingData;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private final List<Commands> listComm;

    public Menu(View view) {
        listComm = new ArrayList<>();

        listComm.add(new SavingData(view));
        listComm.add(new Finish(view));
    }

    public String show() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < menuSize(); i++) {
            sb.append(i + 1)
                    .append("\t")
                    .append(listComm.get(i).getDescription())
                    .append("\n");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    public void execute(int numCommand){
        listComm.get(numCommand - 1).execute();
    }

    public int menuSize(){
        return listComm.size();
    }
}
