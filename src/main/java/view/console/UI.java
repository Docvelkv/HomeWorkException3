package view.console;

import model.CustomExceptions;
import presenter.Presenter;
import view.View;

import java.io.IOException;
import java.util.Scanner;

public class UI implements View {
    private final Menu menu;
    private final Presenter presenter = new Presenter();
    private final Scanner scan;
    private boolean work;

    public UI() {
        menu = new Menu(this);
        scan = new Scanner(System.in);
        work = true;
    }

    private void initialTitle(){
        System.out.println("Начало работы");
    }

    private void showMenu(){
        System.out.println(menu.show());
    }

    private void execute(){
        String text = scan.nextLine();
        if(checkingTextForInt(text)){
            int commNum = Integer.parseInt(text);
            if(checkingCommandNum(commNum)){
                System.out.println("**********");
                menu.execute(commNum);
                System.out.println("**********\n");
            }
        }
    }

    private boolean checkingTextForInt(String text){
        return text.matches("[0-9]") || text.isEmpty();
    }

    private boolean checkingCommandNum(int commNum){
        return commNum <= menu.menuSize();
    }

    private boolean checkingEmptinessConsole(String str){
        return !str.isEmpty();
    }

    public void start(){
        initialTitle();
        while (work){
            showMenu();
            execute();
        }
    }

    @Override
    public void savingData() {
        try {
            System.out.print("""
                    Введите следующие данные через пробел:
                    ФИО (каждое слово с прописной буквы),
                    дату рождения (формат: dd.mm.yyyy),
                    номер телефона (11 подряд идущих цифр без знака),
                    пол (один символ m или f).
                    """);
            String input = scan.nextLine();
            if(checkingEmptinessConsole(input)) presenter.savingData(input);
            System.out.println("Файл сохранён");
        }catch (CustomExceptions | IndexOutOfBoundsException | IOException ex){
            System.out.println(ex.getMessage() +
                    "\nФайл не сохранён, так как есть ошибки в воде данных");
        }
    }

    @Override
    public void finish() {
        System.out.println("Работа закончена");
        work = false;
    }
}
