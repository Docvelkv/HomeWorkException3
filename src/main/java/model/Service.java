package model;

import java.util.ArrayList;
import java.util.List;

public class Service {

    public static List<String> getData(String input) throws IndexOutOfBoundsException {
        List<String> list = null;
        try {
            list = new ArrayList<>();
            if (!CustomExceptions.IncorrectAmountDataEntered(input).isEmpty()) {
                input = CustomExceptions.IncorrectAmountDataEntered(input);
                String name = CustomExceptions.incorrectName(input);
                String date = CustomExceptions.incorrectDate(input);
                String telephone = CustomExceptions.incorrectTelephone(input);
                String gender = CustomExceptions.incorrectGender(input);
                if (!name.isEmpty() && !date.isEmpty() && !telephone.isEmpty() && !gender.isEmpty()) {
                    list.addAll(0, List.of(name.split(" ")));
                    list.add(date);
                    list.add(telephone);
                    list.add(gender);
                }
            }
        } catch (IndexOutOfBoundsException ex) {
            System.out.println(ex.getMessage());
        }
        return list;
    }

    public static String creatingStringToSave(String input){
        List<String> list = getData(input);
        StringBuilder sb = new StringBuilder();
        if (!(list.isEmpty())){
            sb.append("<").append(list.get(0)).append("><")
                    .append(list.get(1)).append("><")
                    .append(list.get(2)).append("><")
                    .append(list.get(3)).append("><")
                    .append(list.get(4)).append("><")
                    .append(list.get(5)).append(">")
                    .append("\n");
            return sb.toString();
        }
        return sb.toString();
    }
}
