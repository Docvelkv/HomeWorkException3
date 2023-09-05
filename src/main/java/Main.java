import model.CustomExceptions;
import model.Identification;

public class Main {
    public static void main(String[] args) {
        String input = " Великонский Константин   Валерьевич  31.03.1973  79642953102 m ";
        input = CustomExceptions.IncorrectAmountDataEntered(input);
        int count = Identification.substringCount(input);
        if (count == 6){
            String str = CustomExceptions.incorrectName(input);
            System.out.println(str);
            String str2 = CustomExceptions.incorrectDate(input);
            System.out.println(str2);
            String str3 = CustomExceptions.incorrectTelephone(input);
            System.out.println(str3);
            String str4 = CustomExceptions.incorrectGender(input);
            System.out.println(str4);
        }
        else System.out.println("Неверное количество введённых данных");
    }
}
