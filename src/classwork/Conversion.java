package classwork;

public class Conversion {
    public static void main(String[] args) {
        byte b;
        int i = 257;
        double d = 323.142;

        System.out.println("\nПереобразование типа int в тип byte.");
        b = (byte) i;
        System.out.println("i и b : " + i + " и " + b);

        System.out.println("\nПереобразование типа double в тип int.");
        i = (int) d;
        System.out.println("d и i : " + d + " и " + i);

        System.out.println("\nПереобразование типа double в тип byte.");
        b = (byte) d;
        System.out.println("d и b : " + d + " и " + b);

    }
}
