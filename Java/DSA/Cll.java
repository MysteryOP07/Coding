import java.util.*;

class Node {
    int data;
    Node next;

    Node(int num) {
        this.data = num;
        this.next = null;
    }
}

public class Cll {
    Node head = null;
    Node temp = null;
    Node prev = null;

    public void cll(int num) {
        Node newnode = new Node(num);
        if (head == null) {
            head = newnode;
            temp = newnode;
        } else {
            temp.next = newnode;
            temp = newnode;
            temp.next = head;
        }
    }

    public void insertion_at_start(int N) {
        Node newnode = new Node(N);
        newnode.data = N;
        newnode.next = head;
        head = newnode;
        temp.next = head;
    }

    public void insetion_at_end(int M) {
        Node newnode = new Node(M);
        newnode.data = M;
        newnode.next = null;
        temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = newnode;
        temp = newnode;
        temp.next = head;
    }

    public void insetion_at_pos(int K) {
        Node newnode = new Node(K);
        newnode.data = K;
        newnode.next = null;
        Scanner sc = new Scanner(System.in);
        int pos = sc.nextInt();
        temp = head;
        int i = 1;
        while (i < pos) {
            prev = temp;
            temp = temp.next;
            i++;
        }
        prev.next = newnode;
        newnode.next = temp;
    }

    public void display() {
        temp = head;
        while (temp.next != head) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.print(temp.data);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Cll list = new Cll();
        while (true) {
            int num = sc.nextInt();///10 
            if (num == -1)///10==-1 
            {
                break;
            }
            list.cll(num);
        }
        int N = sc.nextInt();
        list.insertion_at_start(N);
        int M = sc.nextInt();
        list.insetion_at_end(M);
        int K = sc.nextInt();
        list.insetion_at_pos(K);
        list.display();
    }
}