package presenter;

import model.CustomExceptions;
import model.SavingToFile;

import java.io.IOException;

public class Presenter {
    public void savingData(String input) throws CustomExceptions, IndexOutOfBoundsException, IOException{
        SavingToFile.saving(input);
    }
}
