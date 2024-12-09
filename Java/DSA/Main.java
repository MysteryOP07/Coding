import java.util.*;

class Node {
    int data;
    Node next;
    Node prev;

    Node(int num) {
        this.data = num;
        this.next = null;
        this.prev = null;
    }
}

public class Main {
    Node head = null;
    Node temp = null;
    Node tail = null;
    Node next=null;
    Node prev=null;

    public void cllfdll(int num) {
        Node newnode = new Node(num);
        if (head == null) {
            head = newnode;
            temp = newnode;
            tail = newnode;
            tail.next = head;
            head.prev = tail;
        } else {
            tail.next = newnode;
            newnode.prev = tail;
            tail = newnode;
            tail.next = head;
            head.prev = tail;
        }
    }

    public void displayf() {
        temp = head;
        while (temp.next != head) {
            System.out.print(temp.data + "  ");
            temp = temp.next;
        }
        System.out.print(temp.data);
    }

    public void displayb() {
        temp = tail;
        while (temp.prev != tail) {
            System.out.print(temp.data + "  ");
            temp = temp.prev;
        }
        System.out.print(temp.data);
    }
    public void insertion_at_start(int N){
        Node newnode =new Node(N);
        newnode.data=N;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main list = new Main();
        while (true) {
            int num = sc.nextInt();
            if (num == -1) {
                break;
            }

            list.cllfdll(num);
        }
        int N = sc.nextInt();
        list.insertion_at_start(N);
        list.displayf();
        System.out.println("");
        list.displayb();
    }

}
