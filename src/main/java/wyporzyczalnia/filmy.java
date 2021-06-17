package wyporzyczalnia;

import java.time.LocalDate;
import java.util.Date;

public class filmy extends rzecz {
    String gatunek;

    public filmy(String nazwa, int cena, int id, LocalDate data, String autor, String gatunek)
    {

        super(nazwa,cena,id,data,autor);

    }


}
