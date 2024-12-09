import java.util.Scanner;

interface Student {
    abstract void Hello();

    default void Factorial() {
        System.out.println("University");
    }

    default void inf(){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(a*b);
    }
}

public class Main implements Student {
    public void Hello() {
        int a = 400;
        int b = 100;
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        Main data = new Main();
        data.Hello();
        data.Factorial();
        data.inf();
    }

}
