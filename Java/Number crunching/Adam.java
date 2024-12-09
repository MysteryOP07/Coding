import java.util.Scanner;

public class Adam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();

        for (int i = start; i <= end; i++) {
            int squareN = i * i;
            int num = i;
            int revN = 0;
            // int squarerevN = 0;
            while (num > 0) {
                revN = revN * 10 + num % 10;
                num /= 10;
            }
            int squarerevN = revN * revN;
            int revsq = 0;
            num = squareN;

            while (num > 0) {
                revsq = revsq * 10 + num % 10;
                num /= 10;

            }
            if (revsq == squarerevN) {
                System.out.println(i);
            }

        }
    }
}