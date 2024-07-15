package homework1;


public class FigurePainter {
    public static void main(String[] args) {
        System.out.println("1)");
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

        System.out.println("2)");
        for (int i = 5; i >= 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();

        }
        System.out.println();
        System.out.println();

        System.out.println("3)");
        int x = 5;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x - i - 1; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
        System.out.println();
        System.out.println();

        System.out.println("4)");
        for (int i = 6; i > 0; i--) {
            for (int j = 6 - i; j > 0; j--) {
                System.out.print("  ");
            }
            for (int j = i - 1; j > 0; j--) {
                System.out.print("* ");
            }

            System.out.println();
        }

        System.out.println();
        System.out.println();

        System.out.println("5)");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
        for (int i = 5; i > 0; i--) {
            for (int j = 5 - i; j > 0; j--) {

                System.out.print(" ");
            }
            System.out.print(" ");
            for (int j = i - 1; j > 0; j--) {
                ;
                System.out.print("* ");
            }

            System.out.println();
        }
    }

}



