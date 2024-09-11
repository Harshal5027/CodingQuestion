package LinkedList;


public class Program1 {

    int data;
    Program1 next;

    Program1( int new_data){

        data = new_data;
        next = null;
    }

    public static Program1 insertAtFront( Program1 head, int new_data){

        Program1 new_node= new Program1(new_data);

        new_node.next = head;

        return new_node;
    }

    public static void printList( Program1 head) {

        Program1 curr = head;
        while ( curr != null){
            System.out.println(" "+curr.data);
            curr = curr.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        
        Program1  head = new Program1(2);
        head.next = new Program1(3);
        head.next.next = new Program1(4);
        head.next.next.next = new Program1(5);

        System.out.println("Origunal Linked List : ");

        printList(head);

        System.out.println("After inserting elemnt at head : ");

        int data = 1;

        head = insertAtFront(head, data);

        printList(head);
    }
}