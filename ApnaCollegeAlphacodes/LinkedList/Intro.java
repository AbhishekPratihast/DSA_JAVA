class Node{
    int data; //data
    Node next; //reference to next node
    Node(int value){
        data=value;
    }
}

public class Intro {
    public static void main(String[] args) {
        Node n1=new Node(1);
        Node n2=new Node(2);
        Node n3=new Node(3);
        Node n4=new Node(4);
        n1.next=n2;  
        n2.next=n3;
        n3.next=n4;
        System.out.println(n2);
        System.out.println(n1.next); 

        // System.out.println(n1.data);
        // System.out.println(n2.data);
        // System.out.println(n3.data);
        // System.out.println(n4.data);

        System.out.println(n1.data);
        System.out.println(n1.next.data);
        System.out.println(n1.next.next.data);
        System.out.println(n1.next.next.next.data);

        // Node temp=n1;
        // int size=0;
        // while(temp!=null){
        //     System.out.print(temp.data);
        //     size++;
        //     temp=temp.next;
        // }
        // System.out.println(n1.data);
        display(n1);
    }
    public static void display(Node temp){
        while(temp!=null){
            System.out.print(temp.data);
            temp=temp.next;
        }
    }
}

