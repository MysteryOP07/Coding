public class Recursion {
    static void Hello(int a) {
        if (a >= 0) {
            Hi(a - 1);
            Hi(a-3);
            Hi(a-2);
            Hi(a-2);
            Hi(a-1);

            if (a % 2 == 0) {
                System.out.print("  ");
            }}}

    static void Hi(int a) {
        if (a >0) {
            System.out.print(a + " ");
            Hello(a - 3);}}
    public static void main(String[] args) {
        Hi(10);
    }
}
