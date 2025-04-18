class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
class Intro{
    public static void main(String args[]){
        Node n1=new Node(10);
        Node n2=new Node(20);
        Node n3=new Node(30);
        Node n4=new Node(40);
       
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;

        // System.out.println(n1.data);
        // System.out.println(n2.data);
        // System.out.println(n3.data);
        // System.out.println(n4.data);

        // System.out.println(n1.data);
        // System.out.println(n1.next.data);
        // System.out.println(n1.next.next.data);
        // System.out.println(n1.next.next.next.data);

        // Node temp=n1;
        // while(temp!=null){
        //     System.out.println(temp.data);
        //     temp=temp.next;
        // }
        // System.out.println(n1.data);

        printLinkedList(n1);
        System.out.println(n1.data);
    }
    public static void printLinkedList(Node n1){
        while(n1!=null){
            System.out.println(n1.data);
            n1=n1.next;
        }
    }
}