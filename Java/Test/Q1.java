import java.util.*;
class Q1{
  public static void main(String args[]){
    try(Scanner sc= new Scanner(System.in);){
    String inp=sc.nextLine();
    int i=0;
    // char ch;
    while(i<inp.length()) {
      char ch=inp.charAt(i);
      if(Character.isUpperCase(ch)||ch== ' ') {
        break;
      }
      else{
        System.out.print(ch);
      }
      i++;

  }}

  }
}
