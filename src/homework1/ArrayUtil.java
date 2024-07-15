package homework1;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};
        int len = numbers.length;
        System.out.println("1)");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.println();

        System.out.println("2)");
        int num = numbers[0];
        System.out.println(num);
         System.out.println();

        System.out.println("3)");
        int x = numbers[numbers.length - 1];
        System.out.println(x);
         System.out.println();

        System.out.println("4)");
        System.out.println(numbers.length);
        System.out.println();

        System.out.println("5)");
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min){
                min = numbers[i];
            }
        }
        System.out.println(min);
        System.out.println();

        System.out.println("6)");
        if (len <= 2){
            System.out.println("can't print middle values");
        }else {
            if (len % 2 == 0){
                System.out.print(numbers[(len / 2) - 1] + numbers[(len / 2)]);
            }else {
                System.out.println(numbers[(len / 2)]);
            }
        }
        System.out.println();

        System.out.println("7)");
        int evenCount = 0;
        for (int i = 0; i < len; i++) {
            if (numbers[i] % 2 == 0){
                evenCount++;

            }
        }
        System.out.println(evenCount);
        System.out.println();

        System.out.println("8)");
        int oddCount = 0;
        for (int i = 0; i < len; i++) {
            if (numbers[i] % 2 == 1){
                oddCount++;
            }
        }
        System.out.println(oddCount);
        System.out.println();

        System.out.println("9)");
        int sum = 0;
        for (int i = 0; i < len; i++) {
            sum += numbers[i];
        }
        System.out.println(sum);
        System.out.println();

        System.out.println("10)");
        System.out.println((float) sum / len);

    }
}
