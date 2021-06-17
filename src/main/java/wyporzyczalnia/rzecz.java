package wyporzyczalnia;

import java.time.LocalDate;
import java.util.Date;

abstract public class rzecz {
    public String nazwa;
    public int cena;
    public int id;
    public LocalDate data;
    public String autor;
    public LocalDate datawporzy;

  public rzecz(String nazwa, int cena, int id, LocalDate data, String autor) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.id= id;
        this.data=data;
        this.autor=autor;
    }

    public LocalDate getDatawporzy() {
        return datawporzy;
    }

        void setDatawporzy(LocalDate datawporzy){
            this.datawporzy = datawporzy;

        }
}

