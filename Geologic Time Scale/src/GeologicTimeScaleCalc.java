import java.util.Scanner;

public class GeologicTimeScaleCalc {
    public static void  Phanerozoic(double n){
        System.out.println("Eon: Phanerozoic");
        //all details for paleozoic era
            if(n >  251.0 && n < 542.0){
                System.out.println("Era: Paleozoic");
                 if(n > 488.3){
                     System.out.println("Period: Cambrian");
                 } else if(n < 488.3 && n > 443.7){
                     System.out.println("Period: Ordovician");
                 } else if(n < 443.7 && n > 416.0){
                     System.out.println("Period: Silurian");
                 } else if(n < 416.0 && n > 359.2){
                     System.out.println("Period: Devonian");
                     if(n < 359.2 && n > 318.1){
                         System.out.println("Series: Mississippian");
                     } else {
                         System.out.println("Series: Pennsylvanian");
                     }
                 } else if(n < 359.2 && n > 299.0){
                     System.out.println("Period: Carboniferous");
                 } else{
                     System.out.println("Period: Permian");
                 }
            } //all details for Mesozoic era
            else if(n < 251 && n > 65.5){
                System.out.println("Era: Mesozoic");
                if(n < 251.0 && n > 199.6) {
                    System.out.println("Period: Triassic");
                } else if(n < 199.6 && n > 145.5){
                    System.out.println("Period: Jurassic");
                } else {
                    System.out.println("Period: Cretaceous");
                }
            }//all details for Cenozoic era
            else{
                System.out.println("Era: Cenozoic");
                if(n < 65.5 && n > 23.03){
                    System.out.println("Period: Paleogene");
                } else if (n < 23.03 && n > 2.588) {
                    System.out.println("Period: Neogene");
                } else {
                    System.out.println("Quaternary");
                }
            }
        }

        public static void Precambrian(double n){
            System.out.println("In the Precambrian Eon Timeline");
            //Haydean Eon 4000+ Ma
            if(n > 4000){
                System.out.println("Eon: Haydean");
                System.out.println("There is no other information provided for this Eon.");
            } else if (n < 2500) {
                /*
                * Proterozoic Eon 542 - 2500 Ma and is split in three Eras nicknamed Z, Y, X
                * Neoproterozoic (Z) 542-1000 Ma
                * Mesoproterozoic (Y) 1000 - 1600 Ma
                * Paleroproterozoic (X) 1600 - 2500 Ma*/
                System.out.println("Eon: Proterozoic");
                if (n < 1000){
                    System.out.println("Era: Neoproterozoic (Z)");
                    System.out.println("Also known as: Late Proterozoic Era");
                } else if (n < 1600){
                    System.out.println("Era: Mesoproterozoic (Y)");
                    System.out.println("Also known as: Middle Proterozoic Era");
                } else {
                    System.out.println("Era: Paleroproterozoic (X)");
                    System.out.println("Also known as: Early Proterozoic Era");
                }
            } else {
                /*
                 * Archean Eon 2500 - 3200 Ma and is split between early and late Archean eras
                 * Neoarchean Era 2500 -2800
                 * Mesoarchean Era 2800 - 3200
                 * Paleoarchean Era 3200- 4000
                 */
                System.out.println("Eon: Archean");
                if(n < 2800){
                    System.out.println("Era: Neoarchean");
                } else if (n < 3200) {
                    System.out.println("Era: Mesoarchean");
                } else {
                    System.out.println("Era: Paleoarchean");
                }
            }
        }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENSURE THE NUMBER IS CONVERT TO Ma BEFORE USING");

        int count = 1;
        //chose 12 because there was usually 12 homework related questions
        while(count < 12) {
            double year = sc.nextDouble();
            if (year > 0.0118 && year < 542.0) {
                Phanerozoic(year);
            } else {
                Precambrian(year);
            }
            count++;
        }
        sc.close();
    }
}
