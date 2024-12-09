import java.util.Scanner;

public class Bethrod {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int i, sum1 = 0, sum2 = 0;

        for (i = 1; i < num1; i++) {
            if (num1 % i == 0) {
                sum1 += i;
            }
        }
        for (i = 1; i < num2; i++) {
            if (num2 % i == 0) {
                sum2 += i;
            }
        }
        if (sum1 == (num2 + 1) && sum2 == (num1 + 1)) {
            System.out.println("Bethrod pair");
        } else {
            System.out.println("Not Bethrod pair");
        }

    }
}
