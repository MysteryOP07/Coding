import java.util.*;

class Node {
    int data;
    Node next;

    Node(int num) {
        this.data = num;
        this.next = null;
    }
}

public class Dll {
    Node head = null;
    Node temp = null;
    Node prev = null;

    public void sll(int num) {
        Node newnode = new Node(num);
        if (head == null) {
            head = newnode;
            temp = newnode;
        } else {
            temp.next = newnode;
            temp = newnode;
        }
    }

    public void insert_at_start(int N) {
        Node newnode = new Node(N);
        newnode.data = N;
        newnode.next = head;
        head = newnode;
    }

    public void insert_at_end(int M) {
        Node newnode = new Node(M);
        newnode.data = M;
        newnode.next = null;
        temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnode;
        temp = newnode;
    }

    public void insertion_at_pos(int S) {
        Node newnode = new Node(S);
        newnode.data = S;
        newnode.next = null;
        Scanner sc = new Scanner(System.in);
        int pos = sc.nextInt();
        int i = 1;
        temp = head;
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
        while (temp.next != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.print(temp.data);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Dll list = new Dll();
        while (true) {
            int num = sc.nextInt();
            if (num == -1) {
                break;
            }
            list.sll(num);
        }
        int N = sc.nextInt();
        list.insert_at_start(N);
        int M = sc.nextInt();
        list.insert_at_end(M);
        int S = sc.nextInt();
        list.insertion_at_pos(S);
        list.display();
    }
}
