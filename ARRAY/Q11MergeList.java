package ARRAY;
// How to merge two sorted linked lists into one sorted list. Write its algorithm, program.
// Find its time and space complexities. Explain with suitable example.

// Time Complexity	O(n + m) (where n and m are lengths of the two lists)
// Space Complexity	O(1) (in-place merging, no extra list created)
class Node{
    int data;
    Node next;
    
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Q11MergeList {

    static Node mergeTwoLists(Node l1, Node l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        if (l1.data < l2.data) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }
    static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
       Node head1= new Node(1);
       head1.next= new Node(3);
       head1.next.next= new Node(5);
       Node head2= new Node(2);
       head2.next= new Node(4);
       head2.next.next= new Node(6);
       Node mergedHead= mergeTwoLists(head1, head2);
       printList(mergedHead);
    }
}
// Arrays.arraycopy(int[] src, int srcPos, int[] dest, int destPos, int length) is a method in Java 
// that copies a specified number of elements from one array to another. 
// It is part of the java.lang package and is used for array manipulation. 
// The method takes five parameters: the source array (src), the starting position in the source array (srcPos), the destination array (dest), the starting position in the destination array (destPos), and the number of elements to copy (length). The method copies elements from the source array to the destination array, starting at the specified positions. If any of the parameters are invalid or if the source and destination arrays are not compatible, an ArrayIndexOutOfBoundsException may be thrown.