public class PrimitiveTypesChallenge {
    public static void main(String[] args) {
        byte myByte = 1;
        short myShort = 77;
        int myInt = 100;
        long myLong = 50000 + 10 * (myByte + myShort + myInt);

        System.out.println(myLong);
    }
}
