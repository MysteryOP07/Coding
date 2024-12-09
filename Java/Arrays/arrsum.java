
import java.util.Scanner;

public class arrsum {
   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int size = scanner.nextInt();
    int[] arr = new int[size];
    int sum = 0,ind;
    
    for( ind = 0; ind < size; ind++) {
        arr[ind] = scanner.nextInt();
        
    }
    for ( ind=0;ind<size;ind++){
        System.out.println(sum+" ");
        sum+=arr[ind];
    }
   } 
}
