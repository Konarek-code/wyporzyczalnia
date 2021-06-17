package wyporzyczalnia;

import java.time.LocalDate;
import java.util.Date;

public class ksiazki extends rzecz {
    int strony;
    String okladka;

    public ksiazki(String nazwa, int cena, int id, LocalDate data, String autor, int strony, String okladka )
    {
        super(nazwa,cena,id,data,autor);

    }

}
