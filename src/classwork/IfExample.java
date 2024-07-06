package classwork;

public class IfExample {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        if (x < y) {
            System.out.print("X:" + x + " ");
            System.out.println("Y:" + y);
            System.out.println("X-ը փոքր է՞ Y-ից:");
            System.out.println("X-ը փոքր է Y-ից:");
            System.out.println();
        }

        x = x * 2;
        if (x == y) {
            System.out.print("X:" + x + " ");
            System.out.println("Y:" + y);
            System.out.println("X-ը հավասար է՞ Y-ին:");
            System.out.println("X-ը հավասար է Y-ին:");
            System.out.println();
        }

        x = x * 2;
        if (x > y) {
            System.out.print("X:" + x + " ");
            System.out.println("Y:" + y);
            System.out.println("X-ը մէծ է՞ Y-ից:");
            System.out.println("X-ը մեծ է Y-ից:");
            System.out.println();
        }

        if (x == y) {

        } else {
            System.out.print("X:" + x + " ");
            System.out.println("Y:" + y);
            System.out.println("X-ը հավասար է՞ Y-ին:");
            System.out.println("X-ը հավասար չէ Y-ին:");
        }
    }
}
