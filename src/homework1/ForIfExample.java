package homework1;

public class ForIfExample {
    public static void main(String[] args) {
        int x;
        for (x = 1; x < 11; x++) {
            System.out.println(x);
        }
        System.out.println();

        for (x = 0; x < 100; x++) {
            System.out.println(x);
        }

        System.out.println();

        for (x = 50; x > 0; x--) {
            System.out.println(x);
        }
        System.out.println();

        for (x = 1; x < 20; x += 2) {
            System.out.println(x);
        }
        System.out.println();

        for (x = 0; x < 100; x += 2) {
            System.out.println(x);
        }
    }
}
