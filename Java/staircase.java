import java.util.Scanner;

public class staircase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter No. of Steps : ");
        int Steps = scanner.nextInt();
        int i = 0;
        while (Steps != 0)// 25//
        {

            if ((Steps % 2) == 0)//
            {
                Steps = Steps / 2;
                i++;
            } else {
                Steps = Steps - 1;
                i++;
            }
        }
        System.out.println("Total no. of leaps = "+i);
    }
}