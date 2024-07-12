package homework1;

public class ForIfExample {
    public static void main(String[] args) {
        int x;
        for (x = 0; x <= 10; x++) {
            System.out.print(x + " ");
        }
        System.out.println();

        int b = 0;
        for (x = 0; x <= 100; x++) {
            b = b + x;
        }
        System.out.println(b);

        for (x = 50; x >= 0; x--) {
            System.out.print(x + " ");
        }
        System.out.println();

        for (x = 1; x < 20; x += 2) {
            System.out.print(x + " ");
        }
        System.out.println();

        int y = 0;
        for (x = 2; x <= 100; x += 2) {
            y++;
        }
        System.out.println(y);
    }
}
