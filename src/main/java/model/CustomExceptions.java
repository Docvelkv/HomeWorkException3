package model;

public class CustomExceptions {

    /**
     * Проверка количества введённых данных
     * @param input входящая строка
     * @return String
     */
    public static String IncorrectAmountDataEntered(String input){
        String numData = Identification.removingExtraSpaces(input);
        try {
            int count = Identification.substringCount(numData);
            if(count != 6){
                throw new Exception(String.format(
                        "Количество введённых данных %d, необходимо %d", count, 6));
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return numData;
    }

    /**
     * Проверка корректности ввода полного имени
     * @param input входящая строка
     * @return String
     */
    public static String incorrectName(String input){
        String strName = Identification.searchName(input);
        try{
            if(strName.isEmpty()){
                throw new Exception("Некорректный ввод ФИО");
            }
            else return strName;
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return input;
    }

    /**
     * Проверка корректности ввода даты рождения
     * @param input входящая строка
     * @return String
     */
    public static String incorrectDate(String input){
        String strDate = Identification.searchData(input);
        try{
            if(strDate.isEmpty()){
                throw new Exception("Некорректный ввод даты");
            }
            else return strDate;
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return input;
    }

    /**
     * Проверка корректности ввода номера телефона
     * @param input входящая строка
     * @return String
     */
    public static String incorrectTelephone(String input){
        String strTelephone = Identification.searchTelephone(input);
        try{
            if(strTelephone.isEmpty())
                throw new Exception("Количество цифр в номере телефона меньше необходимого");
            if(strTelephone.length() > 11){
                throw new Exception("Количество цифр в номере телефона больше необходимого");
            }
            else return strTelephone;
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return input;
    }

    /**
     * Проверка корректности ввода пола
     * @param input входящая строка
     * @return String
     */
    public static String incorrectGender(String input){
        String strGender = Identification.searchGender(input);
        try{
            if(strGender.isEmpty())
                throw new Exception("Некорректный ввод пола");
            else return strGender;
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return input;
    }
}
