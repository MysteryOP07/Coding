import java.util.Scanner;

public class Magicno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter starting no.");
        int start = scanner.nextInt();
        System.out.print("Enter ending no.");
        int end = scanner.nextInt();
        while (start <= end) {
            int temp = start;
            int sum = 0;
            while (temp > 0) {
                int rem = temp % 10;
                sum += rem;
                temp /= 10;
            }
            int sumrev = 0;
            int sumtemp = sum;
            while (sumtemp > 0) {
                int rem = sumtemp % 10;
                sumrev = sumrev * 10 + rem;
                sumtemp /= 10;
            }
            if (sumrev * sum == start) {
                System.out.println(start);
            }
            start++;
        }
    }
}
