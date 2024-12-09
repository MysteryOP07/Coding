import java.util.Scanner;

public class tcsques {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input: ");
        String inp=sc.next();
        StringBuilder non_num= new StringBuilder();
        for(int i=0;i<inp.length();i++){
            char ch= inp.charAt(i);
            if(!Character.isDigit(ch)){
                non_num.append(ch);
            }
        }
        non_num.reverse();
        StringBuilder res=new StringBuilder();
        int ind=0;
        for(int i=0;i<inp.length();i++){
            char ch=inp.charAt(i);
            if(Character.isDigit(ch)){
                res.append(ch);
            }
            else{
                res.append(non_num.charAt(ind));
                ind++;
            }
        }
        System.out.println("Output : " + res);
        
    }
}
