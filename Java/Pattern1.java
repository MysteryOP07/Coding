import java.util.Scanner;
public  class Pattern1{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int num =sc.nextInt();
    int rows,columns;
    for (rows=1;rows<=num;rows++) {
        for (columns=1;columns<=num;columns++){
            System.out.print("*"+" ");
        }
            System.out.println(" ");

    }
}}