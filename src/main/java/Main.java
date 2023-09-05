import model.CustomExceptions;
import model.Identification;

public class Main {
    public static void main(String[] args) {
        String input = "  Великонский Константин    Валерьевич 31.03.1973  79642953102 m ";
        input = CustomExceptions.IncorrectAmountDataEntered(input);
        int count = Identification.substringCount(input);
        if (count == 6){
            String str = Identification.searchName(input);
            String str2 = Identification.searchData(input);
            String str3 = Identification.searchTelephone(input);
            String str4 = Identification.searchGender(input);
            System.out.println(str + " " + str2 + " " + str3 + " " + str4);
        }
        else System.out.println("Неверное количество введённых данных");
    }
}
