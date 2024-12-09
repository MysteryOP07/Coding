import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ind;
        System.out.print("Enter Total no. of bills: ");
        int size = sc.nextInt();
        System.out.println("");
        System.out.print("Enter Bills :  ");
        int[] bills = new int[size];
        for (ind = 0; ind < size; ind++) {
            bills[ind] = sc.nextInt();
        }
        int i = 0, count5 = 0, count10 = 0, count20 = 0;
        for (i = 0; i < size; i++) {
            if (bills[i] == 5) {
                count5++;
            }
            if (bills[i] == 10) {

                count5--;
                count10++;

            }
            if (bills[i] == 20 && count5 >= 3 && count10 < 1) {

                count5 = count5 - 3;
            }
            if (bills[i] == 20 && count5 == 2 && count10 > 1) {
                count5 = count5 - 1;
                count10 = count10 - 1;
            }
        }
        if (count5 > 0) {

            System.out.println("True ");
        } else {
            System.out.println("False ");
        }

    }
}
