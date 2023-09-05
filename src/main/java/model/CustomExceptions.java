package model;

public class CustomExceptions {
    public static String IncorrectAmountDataEntered(String input){
        input = Identification.removingExtraSpaces(input);
        try {
            int count = Identification.substringCount(input);
            if(count != 6){
                System.out.println(input);
                throw new Exception(String.format(
                        "Количество введённых данных %d, необходимо %d", count, 6));
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return input;
    }
}
