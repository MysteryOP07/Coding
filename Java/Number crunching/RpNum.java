import java.util.Scanner;

public class RpNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        while (num1 >= 10) {
            int sum = 0;
            while (num1 > 0) {
                sum += num1 % 10;
                num1 = num1 / 10;
            }
            num1 = sum;
        }
        System.out.println(num1);
    }
}