import model.CustomExceptions;
import presenter.Presenter;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            String input = " петров Иван   Николаевич  21,03.1978  739642953102 a ";
            Presenter pr = new Presenter();
            pr.savingData(input);
        }catch (CustomExceptions | IndexOutOfBoundsException | IOException ex){
            System.out.println(ex.getMessage() +
                    "\nФайл не сохранён, так как есть ошибки в воде данных");
        }

    }
}
