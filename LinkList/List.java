package LinkList;
import java.util.*;
public class List {
    public static void main(String[] args) {
        Node n1 = new Node(25);
        System.out.println(n1.data);

    }
}
    class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
        }
    }

