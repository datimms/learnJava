package uk.co.randomdave;


public class MegaBytesConverter {
    public static void main(String[]args){
        printMegaBytesAndKiloBytes(5000);
        printMegaBytesAndKiloBytes(-5000);
        printMegaBytesAndKiloBytes(2500);
    }

    public static void printMegaBytesAndKiloBytes (int kiloBytes) {
        //1 MB = 1024 KB
        long kiloBytesInMegaByte = 1024L;

        if (kiloBytes <0) {
            System.out.println("Invalid Value");
            //return;
        } else {

            long megaBytes = kiloBytes / kiloBytesInMegaByte;
            long kiloBytesRemainder = kiloBytes % kiloBytesInMegaByte;


            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + kiloBytesRemainder + " KB");
        }
    }
}
