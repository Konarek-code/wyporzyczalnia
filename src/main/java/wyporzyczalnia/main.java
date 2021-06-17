package wyporzyczalnia;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class main {
    private static List<uzytkownik> customer;
    private static ArrayList<rzecz> tab = new ArrayList<>();

    public static void main(String[] args) {
        customer = new ArrayList();
        kary Kary = new kary();

        uzytkownik customer2 = new uzytkownik("Marek","Raczka",40,"Popławska 14");
        uzytkownik customer3 = new uzytkownik("Marcin","",40,"Popławska 14");
        uzytkownik customer4 = new uzytkownik(" Daniel", "Dudziński", 20,"Kremlowska 50");
        uzytkownik customer5 = new uzytkownik("Michał", "kózka", 30,"Koperkowa 12a/5");
        uzytkownik customer6 = new uzytkownik("Lukasz", "Rzęsa", 40,"Kolorowa 12");

        customer.add(customer2);
        customer.add(customer3);
        customer.add(customer4);
        customer.add(customer5);
        customer.add(customer6);
        ksiazki ksiazka1 = new ksiazki("Eragon",10,768, LocalDate.parse("2017-04-20"),"Chrisopher Paoulini",300,"twarda"  );
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


        Scanner scanner = new Scanner(System.in);
        System.out.println("######################");
        System.out.println("zaloguj sie aby kontunuować:");
        Scanner scan = new Scanner(System.in);
        uzytkownik customer1 = new uzytkownik();
        System.out.println("        ");
        System.out.println("Podaj imię:");
        customer1.imie = scan.next();
        System.out.println("Podaj nazwisko");
        customer1.nazwisko = scan.next();
        System.out.println("Podaj wiek");
        customer1.wiek = scan.nextInt();
        System.out.println("Podaj adres");
        customer1.adres = scan.next();

        main.customer.add(customer1);


        while (true) {
            System.out.println("       ");
            System.out.println("Witamy w biblotece!");
            System.out.println("Co chciałbyś zrobić: ");
            System.out.println("""
                        
                        ░░░░░░███████ ]▄▄▄▄▄▄▄▄▃
                        ▂▄▅█████████▅▄▃▂
                        I███████████████████].
                        ◥⊙▲⊙▲⊙▲⊙▲⊙▲⊙▲⊙◤...
                    *****************************
                                    
                        1) pokaz uzytkownikow
                        2) pokaz rzeczy 
                        3) wypożycz 
                        4) pokaz wypożyczone rzeczy
                        5) wyjdź
                                  """);


            int a = scanner.nextInt();
            if (a == 1) {
                for (int i = 0; i < main.customer.size(); i++) {
                    uzytkownik uztkownicy = main.customer.get(i);
                    System.out.println("        ");
                    System.out.println("Imie: " + uztkownicy.getname());
                    System.out.println("Nazwisko: " + uztkownicy.getsname());
                    System.out.println("Adres: " + uztkownicy.getadres());
                    System.out.println("wiek:" + uztkownicy.getage());

                }
            }
            if (a == 2) {

                    for (int i = 0; i < main.tab.size(); i++) {
                        rzecz Rzecz = main.tab.get(i);
                        System.out.println("        ");
                        System.out.println(i+1);
                        System.out.println("nazwa: " + Rzecz.nazwa);
                        System.out.println("autor: " + Rzecz.autor);
                        System.out.println("cena: " + Rzecz.cena);
                        System.out.println("id:" + Rzecz.id);
                        System.out.println("data:" + Rzecz.data);
                        if(i<=0){
                            System.out.println("        ");
                            System.out.println(" ksiazki: ");
                            System.out.println("        ");
                        }
                        if(i==2){
                            System.out.println("        ");
                            System.out.println(" filmy: ");
                            System.out.println("        ");
                        }
                        if(i==4) {
                            System.out.println("        ");
                            System.out.println(" plyty: ");
                            System.out.println("        ");


                        }
                        if(i==6){System.out.println("        ");
                            System.out.println(" audiobooki: ");
                            System.out.println("        ");

                        }
                        if(i==7){
                            System.out.println("        ");
                            System.out.println(" ebook: ");
                            System.out.println("        ");
                        }

                    }
            }
            if (a == 3) {
                System.out.println(" wybierz numer zeby wypożyczyć ksiązke");
                int nr = scanner.nextInt();
               rzecz Rzecz = main.tab.get(nr);
               Rzecz.setDatawporzy(LocalDate.now());
               customer1.dodajrzecz(Rzecz);
               System.out.println("wypożyczono rzecz!!!");


            }
            if (a == 4) {
                System.out.println("wypożyczone rzeczy:");

                for (int i = 0; i < customer1.rzeczy.size(); i++) {
                    rzecz Rzecz = customer1.rzeczy.get(i);
                    System.out.println("        ");
                    System.out.println(i + 1);
                    System.out.println("nazwa: " + Rzecz.nazwa);
                    System.out.println("autor: " + Rzecz.autor);
                    System.out.println("cena: " + Rzecz.cena);
                    System.out.println("id:" + Rzecz.id);
                    System.out.println("data:" + Rzecz.data);
                    Kary.policzkare(Rzecz.getDatawporzy());

                }
            }

            if(a==5){
                System.exit(0);
            }
            }

    }
}
