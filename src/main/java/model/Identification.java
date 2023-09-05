package model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Identification {

    /**
     * Удаление лишних пробелов
     * @param input входящая строка
     * @return String
     */
    public static String removingExtraSpaces(String input){
        input = input.trim();
        input = input.replaceAll(" {2,}", " ");
        return input;
    }

    /**
     * Вывод количества введённых данных
     * @param input входящая строка
     * @return int
     */
    public static int substringCount(String input){
        String[] arr = input.split(" ");
        return arr.length;
    }

    /**
     * Поиск полного имени (формат: три подряд идущих слова с прописной буквы) в строке
     * @param input входящая строка
     * @return String
     */
    public static String searchName(String input){
        String name = "";
        Pattern pattern = Pattern.compile("( ?[А-Я][а-я]+ ?){3}");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()){
            name = input.substring(matcher.start(), matcher.end());
        }
        return removingExtraSpaces(name);
    }

    /**
     * Поиск даты (формат: dd.mm.yyyy) в строке
     * @param input входящая строка
     * @return String
     */
    public static String searchData(String input){
        String data = "";
        Pattern pattern = Pattern.compile("(?:[0-2][0-9]|3[01]).(?:0[0-9]|1[0-2]).[0-9]{4}");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()){
            data = input.substring(matcher.start(), matcher.end());
        }
        return data;
    }

    /**
     * Поиск номера телефона (формат: 11 или более подряд идущих цифр) в строке
     * @param input входящая строка
     * @return String
     */
    public static String searchTelephone(String input){
        String telephone = "";
        Pattern pattern = Pattern.compile("[0-9]{11,}");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()){
            telephone = input.substring(matcher.start(), matcher.end());
        }
        return telephone;
    }

    /**
     * Поиск пола (формат: одиночный символ m или f) в строке
     * @param input входящая строка
     * @return String
     */
    public static String searchGender(String input){
        String gender = "";
        Pattern pattern = Pattern.compile("[fm]");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()){
            gender = input.substring(matcher.start(), matcher.end());
        }
        return gender;
    }
}
