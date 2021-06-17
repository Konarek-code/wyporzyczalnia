package wyporzyczalnia;

import java.time.LocalDate;
import java.util.Date;

public class eboook extends rzecz {
        String ocena;

        public eboook(String nazwa, int cena, int id, LocalDate data, String autor, String ocena)
        {
                super(nazwa,cena,id,data,autor);

        }
}


