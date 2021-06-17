package wyporzyczalnia;

import java.time.Duration;
import java.time.LocalDate;
public class kary {
    int koszt = 2;
    LocalDate date1;

    public kary() {
        this.date1 = LocalDate.now();
    }

    public void policzkare(LocalDate data) {

        long days = Duration.between(this.date1.atStartOfDay(), data.atStartOfDay()).toDays();

        if (days > 30) {
            int iloscdni = (int) (days - 30);
            int kary = iloscdni * this.koszt;


            System.out.println("ilość dni zaległych: " + iloscdni);
            System.out.println("kara: " + kary);


        }
        if(days<30){
            System.out.println("nie masz zadnej kary");
        }


    }
}
