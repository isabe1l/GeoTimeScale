import java.util.Scanner;

public class GeologicTimeScaleCalc {
    public static void  Phanerozoic(double n){
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
            } else if(n < 251 && n > 65.5){
                System.out.println("Era: Mesozoic");
                if(n < 251.0 && n > 199.6) {
                    System.out.println("Period: Triassic");
                } else if(n < 199.6 && n > 145.5){
                    System.out.println("Period: Jurassic");
                } else {
                    System.out.println("Period: Cretaceous");
                }
            } else{
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
            if(n < 3600 && n > 2500){
                System.out.println("Eon: Archean");
                if(n < 3600 && n > 3200) {
                    System.out.println("Era: Paleoarchean");
                } else if(n < 3200 && n > 2800){
                    System.out.println("Era: Mesoarchean");
                } else if(n < 2800 && n > 2500){
                    System.out.println("Era: Neoarchean");
                } else {
                    System.out.println("Eroarchean");
                }
            } else if (n < 2500 && n > 542){
                System.out.println("Eon: Proterozoic");
                if(n < 2500 && n > 1600){
                    System.out.println("Era: Paleoproterozoic");
                } else if (n < 1600 && n > 1000) {
                    System.out.println("Era: Mesoproterozoic");
                } else {
                    System.out.println("Era: Neoproterozoic");
                }
            }
        }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Convert to Ma first!!");
        int count = 1;
        while(count < 12) {
            double year = sc.nextDouble();
            if (year > 0.0118 && year < 542.0) {
                Phanerozoic(year);
            } else {
                Precambrian(year);
            }
            count++;
        }
    }
}
