package wyporzyczalnia;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Manager {
    ArrayList<rzecz> tab = new ArrayList<>();
    private static List<uzytkownik> customer;

   public Manager(){



      ksiazki ksiazka1 = new ksiazki("Eragon",10,768,LocalDate.parse("2017-04-20"),"Chrisopher Paoulini",300,"twarda"  );
       ksiazki ksiazka2 = new ksiazki("Harry Potter",15,767,LocalDate.parse("2015-04-20"),"JJ",300,"miękka"  );
       ksiazki ksiazka3 = new ksiazki("Lord of the Rings",20,788,LocalDate.parse("2016-04-20"),"Jr.Tolkien",300,"twarda"  );
       filmy film1 = new filmy( "Asterix i obelix na olimpiadzie",7,977,LocalDate.parse("2008-07-04"),"Thomas langman","komedia"  );
       filmy film2 = new filmy( "Iron Man",9,566,  LocalDate.parse("2008-07-04"),"Jon Favreau","Akcja/przygodowy"  );
       plyty plyta1 = new plyty("Lemon tree",5,796,  LocalDate.parse("2000-05-01"),"John Lenon","30min");
       plyty plyta2 = new plyty("Astroworld",9,796,  LocalDate.parse("2000-05-01"),"Travis Scoot"," 40 min");
       audiobook audiobook1 = new audiobook("Ziemia obiecana",21,123,LocalDate.parse("2020-04-05"),"Barack Obama",2 );
       eboook ebook1= new eboook("Lalka ", 2,231,LocalDate.parse("1980-06-05"),"Bolesław prus","2/10" );
        tab.add(ksiazka1);
        tab.add(ksiazka2);
        tab.add(ksiazka3);
        tab.add(film1);
        tab.add(film2);
        tab.add(plyta1);
        tab.add(plyta2);
        tab.add(audiobook1);
        tab.add(ebook1);


   }
   public static  void dodajuzyt(uzytkownik customer) {


   }


}
