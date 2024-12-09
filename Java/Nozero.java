import java.util.Scanner;

public class Nozero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String output=input.replace("0","5");
        System.out.println(output);

    }
}
