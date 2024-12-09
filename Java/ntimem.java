import java.util.Scanner;

public class ntimem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String str=sc.next();
        int i=0;
        while(i<n){
            System.out.print(str);
            i++;
        }
    }
}
