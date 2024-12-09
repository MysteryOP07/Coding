import java.util.Scanner;

public class cross {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("do you want to increment or decrement the number");
            
            String iord=sc.next();
            if(iord.equals("i")){
                num=num+1;
                System.out.print("Your Number is : "+num+"\n\n");
            }
            else if(iord.equals("d")){
                num=num-1;
                System.out.print("Your Number is : "+num+"\n\n");
            }
        }
        int rows, columns;
        for (rows = 1; rows <= num; rows++) {
            for (columns = 1; columns <= num; columns++) {
                if ( columns==rows ||(columns+rows== (num +1 ))) {
                    System.out.print(columns+" ");
                    // System.out.print("");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }
}
