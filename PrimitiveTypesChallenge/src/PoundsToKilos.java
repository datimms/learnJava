public class PoundsToKilos {
    public static void main(String[] args) {
        double pounds = 200d;
        double poundToKiloFactor = 0.45359237d;
        double kilos = 0d;

        kilos = pounds * poundToKiloFactor;

        System.out.println(pounds + " pounds is equal to " + kilos + " kilos." );

    }
}
