import java.util.Scanner;

public class New {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int inp = sc.nextInt();
        int f = 1, sum = 0, next;
        for (int i = 0; i <= inp; i++) {
            System.out.print(sum + " ");
            next = sum + f;
            sum = f;
            f = next;
        }

    }

}
