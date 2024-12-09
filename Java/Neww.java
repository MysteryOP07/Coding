class next {
    public int age;
    String name;

    

}
class Net extends next {
        void Hi() {
            age = 23;
            name = "Mohit";
            System.out.println(age + "\n" + name);
        }
    }

public class Neww {
    public static void main(String[] args) {
        Net hello = new Net();
        hello.Hi();
    }

}
