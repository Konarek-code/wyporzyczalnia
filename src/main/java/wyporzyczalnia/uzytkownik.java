package wyporzyczalnia;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class uzytkownik{
    private static List<uzytkownik> customer;

    protected String imie;
    protected String nazwisko;
    protected String adres;
    protected int wiek;
    protected LocalDate data;
    protected ArrayList<rzecz> rzeczy ;
    public uzytkownik()
    {
        this.data = LocalDate.now();
        this.rzeczy = new ArrayList<>();
    }
    public uzytkownik(String imie, String nazwisko, int wiek, String adres)
    {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek= wiek;
        this.adres= adres;
        this.data = LocalDate.now();
        this.rzeczy = new ArrayList<>();
    }

    public int getage() {

        return  this.wiek;
    }

 void setwiek(int wiek){

        this.wiek = wiek;
}

public String getname() {

        return this.imie;
    }
 void setimie(String imie){
        this.imie = imie;
    }

 public String getsname(){

        return this.nazwisko;
    }

    void setsname(String nazwisko) {
        this.nazwisko = nazwisko;
    }




    public String getadres(){
        return this.adres;

    }
    public LocalDate getdata(){
        return data;
    }


    public void dodajrzecz(rzecz rzecz)
    {
        rzeczy.add(rzecz);

    }


    }


