import java.util.Scanner;

public class GeologicTimeScaleCalc {
    public static void Phanerozoic(double n) {
        //Phanerozoic Eon 542 - Present
        System.out.println("Eon: Phanerozoic");
        /*
         * Era: Cenozoic Era 65.5 - Present
         * Period: Quaternary Present - 2.4 Ma
         * Period: Tertiary 2.4 - 65.5 Ma which is broken down into two periods
         * Period: Neogene 2.4 - 23 Ma
         * Period: Paleogene 23 - 65.5 Ma
         */
        if (n < 65.5) {
            System.out.println("Era: Cenozoic");
            if (n < 2.4) {
                System.out.println("Period: Quaternary");
            } else {
                if (n < 23.03) {
                    System.out.println("Period: Neogene");
                } else {
                    System.out.println("Period: Paleogene");
                }
                System.out.println("Also known as the 'Tertiary Period'");
            }
        } else if (n < 251) {
            /*
             * Era: Mesozoic 65.5 - 251 Ma
             * Period: Cretaceous 65.5 - 145 Ma
             * Period: Jurassic 145.6 - 199.6 Ma
             * Period: Triassic 199.6 - 251 Ma
             */
            System.out.println("Era: Mesozoic");
            if (n < 145) {
                System.out.println("Period: Cretaceous");
            } else if (n < 199.6) {
                System.out.println("Period: Jurassic");
            } else {
                System.out.println("Period: Triassic");
            }
        } else {
            /*
             * Paleozoic Era 251-542
             * Period: Permian 251 - 299 Ma
             * Period: Carboniferous 299 - 359.2 Ma
             *   Series: Pennsylvania 299 - 318.1 Ma
             *   Series: Mississippian 318.1 - 359.2 Ma
             * Period: Devonian 359.2 - 416 Ma
             * Period: Silurian 416 - 443.7 Ma
             * Period: Ordovician 443.7 - 488.3 Ma
             * Period: Cambrian 488.3 - 542 Ma
             */
            System.out.println("Era: Paleozoic");
            if (n < 299) {
                System.out.println("Period: Permian");
            } else if (n < 359.2) {
                System.out.println("Period: Carboniferous");
                if (n < 318.1) {
                    System.out.println("Series: Pennsylvania");
                } else {
                    System.out.println("Series: Mississippian");
                }
            } else if (n < 416) {
                System.out.println("Period: Devonian");
            } else if (n < 423.7) {
                System.out.println("Period: Silurian");
            } else if (n < 488.3) {
                System.out.println("Period: Ordovician");
            } else {
                System.out.println("Period: Cambrian");
            }
        }
    }

    public static void Precambrian(double n) {
        System.out.println("In the Precambrian Eon Timeline");
        //Haydean Eon 4000+ Ma
        if (n > 4000) {
            System.out.println("Eon: Haydean");
            System.out.println("There is no other information provided for this Eon.");
        } else if (n < 2500) {
            /*
             * Proterozoic Eon 542 - 2500 Ma and is split in three Eras nicknamed Z, Y, X
             * Neoproterozoic (Z) 542-1000 Ma
             * Mesoproterozoic (Y) 1000 - 1600 Ma
             * Paleroproterozoic (X) 1600 - 2500 Ma*/
            System.out.println("Eon: Proterozoic");
            if (n < 1000) {
                System.out.println("Era: Neoproterozoic (Z)");
                System.out.println("Also known as: Late Proterozoic Era");
            } else if (n < 1600) {
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
            if (n < 2800) {
                System.out.println("Era: Neoarchean");
            } else if (n < 3200) {
                System.out.println("Era: Mesoarchean");
            } else {
                System.out.println("Era: Paleoarchean");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENSURE THE NUMBER IS CONVERT TO Ma BEFORE USING");

        int count = 1;
        //chose 12 because there was usually 12 homework related questions
        while (count < 12) {
            double year = sc.nextDouble();
            if (year < 542.0) {
                Phanerozoic(year);
            } else {
                Precambrian(year);
            }
            count++;
        }
        sc.close();
    }
}
