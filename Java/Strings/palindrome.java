import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input");
        String input=sc.next();
        int tr=0;
        int left=0,right=input.length()-1;
        while(left<right){
            if(input.charAt(left)==input.charAt(right)){
                tr=1;
            }
            else{
                tr=0;
            }
            left++;
            right--;
        }
        if(tr==1){
            System.out.println(input+ " is a palindrome");
        }
        else{
            System.out.println(input+ " is not a palindrome");
        }
    }
}
