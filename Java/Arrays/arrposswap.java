
import java.util.Scanner;

public class arrposswap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int ind;
        int[] arr = new int[size];
            for ( ind = 0; ind < size; ind++) 
            {
                arr[ind] = sc.nextInt();
            }
        
        int pos1=sc.nextInt();
        int pos2=sc.nextInt();
        if(pos1>size||pos2>size){
            System.out.print("Not possible");
        }
        else{
            int temp=arr[pos1];
            arr[pos1]=arr[pos2];
            arr[pos2]=temp;
            for(ind=0;ind<size;ind++){ System.out.print(arr[ind]+" ");}
        }
       
    }
}
