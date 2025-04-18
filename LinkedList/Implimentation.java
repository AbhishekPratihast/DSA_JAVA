public class Implimentation {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class LinkList{
        int size=0;
        Node head=null;
        Node tail=null;
        public void insertAtFirst(int data){
            Node n1=new Node(data);
            // empty
            size++;
            if(head==null){
                head=tail=n1;
                return;
            }
            n1.next=head;
            head=n1;
        }
        public void printLinkedList(){
            Node temp=head;
            if(temp==null){System.out.println("empty"); return;}
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
        // tail given
        public void insertAtEnd(int data){
            Node n2=new Node(data);
            size++;
            if(head==null){
                head=tail=n2;
                return;
            }
            tail.next=n2;
            tail=n2;
        }
        // without tail
        public void insertAtEndWithoutTail(int data){
            Node n2=new Node(data);
            size++;
            if(head==null){
                head=tail=n2;
                return;
            }
            Node temp=head;
            while(temp.next!=null){ 
                temp=temp.next;
            }
            temp.next=n2;
        }
        public void insert(int pos,int data){
            if(pos==0){
                insertAtFirst(data);
                return;
            }
            Node temp=head;
            for(int i=0;i<pos;i++){
                temp=temp.next;
            }
        }
    }
    public static void main(String[] args) {
        LinkList l1=new LinkList();
        // l1.insertAtFirst(20);
        // l1.insertAtFirst(40);
        // l1.insertAtFirst(50);
        // l1.insertAtFirst(60);
        // l1.insertAtFirst(70);
        l1.printLinkedList();
        l1.insertAtEnd(99);
        l1.insertAtEndWithoutTail(100);
        l1.insert(0, 200);
        
        l1.printLinkedList();
    } 
}
