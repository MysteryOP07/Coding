import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter starting no.");
        int start = scanner.nextInt();
        System.out.print("Enter ending no.");
        int end = scanner.nextInt();
        int i, num, ognum, temp;

        for (i = start; i <= end; i++) {
            num = i;
            temp = i;
            ognum = i;
            int digit_count = 0, sum = 0, digit;
            while (num > 0) {
                num /= 10;
                digit_count++;
            }
            while (ognum > 0) {
                digit = ognum % 10;
                sum += (int) Math.pow(digit, digit_count);
                ognum /= 10;
            }
            if (sum == temp) {
                System.out.println("\n"+temp + " ");
            }
        }
    }
}
