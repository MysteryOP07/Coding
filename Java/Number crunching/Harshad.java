import java.util.Scanner;

public class Harshad{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        for (int i=start;i<=end;i++) {
            int num=i;
            int sum=0;
            while(num>0){
                sum=sum+(num%10);
                num=num/10;
            }

            if(i%sum==0){
                System.out.println(i);
            }
            

    }
}}