import java.util.Scanner;

public class New2 {
    static void Table(int inp) {

        for (int i = 1; i <= 10; i++) {
            System.out.println(inp + " * " + i + " = " + inp * i);
        }
    }

    static void power(int inp) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a power value : ");
        int pow = sc.nextInt();
        int pm = (int) Math.pow(inp, pow);
        System.out.println("Power value = " + pm);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  an integer value : ");
        int inp = sc.nextInt();

        Table(inp);
        power(inp);

    }
}