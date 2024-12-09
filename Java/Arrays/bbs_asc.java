import java.util.Scanner;

public class bbs_asc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        int ind;
        for (ind = 0; ind < size; ind++) {
            arr[ind] = sc.nextInt();
        }
        int i = 0, j = i + 1, temp;
        for (i = 0; i < size; i++) {
            for (j = i; j < size; j++) {
                if (arr[j] < arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        for(ind=0;ind<size;ind++){
            System.out.print(arr[ind]+" ");
        }
    }
}