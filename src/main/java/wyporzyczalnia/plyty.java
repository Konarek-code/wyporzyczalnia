package wyporzyczalnia;

import java.time.LocalDate;

public class plyty extends rzecz{
    int czasutworu;


    public plyty(String nazwa, int cena, int id, LocalDate data, String autor, String czasutowru)
    {
        super(nazwa,cena,id,data,autor);

    }


}
