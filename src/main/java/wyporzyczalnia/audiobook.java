package wyporzyczalnia;

import java.time.LocalDate;
import java.util.Date;

public class audiobook extends rzecz {
    int dlugosc;

    public audiobook(String nazwa, int cena, int id, LocalDate data, String autor, int dlugosc)
    {
        super(nazwa,cena,id,data,autor);

    }

}
