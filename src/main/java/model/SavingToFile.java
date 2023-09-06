package model;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class SavingToFile {

    public static void saving(String input) {
        try {
            String strPath = Service.getData(input).get(0);
            input = Service.creatingStringToSave(input);
            Path path = Path.of(strPath + ".txt");
            if(Files.notExists(path)){
                Files.writeString(path, input);
            }
            else Files.writeString(path, input, StandardOpenOption.APPEND);
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
