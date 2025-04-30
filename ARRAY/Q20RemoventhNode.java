package ARRAY;
// Java program to delete nth node from last
class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
}
// Class containing the function to remove Nth node from end
public class Q20RemoventhNode{
    // remove the Nth node from last
    static Node removeNthFromEnd(Node head, int N) {
      
        // Initialize two pointers, fast and slow
        Node fast = head;
        Node slow = head;

        // Move fast pointer N steps ahead
        for (int i = 0; i < N; i++) {
            if (fast == null)
                return head; 
            fast = fast.next;
        }

        // If fast is null, remove the head node
        if (fast == null) {
            return head.next;
        }

        // Move both pointers until fast reaches the end
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // Remove the Nth node from the end
        slow.next = slow.next.next;

        return head;
    }

    // This function prints the contents of the linked list
    static void printList(Node node) {
        Node curr = node;
        while (curr != null) {
            System.out.print(" " + curr.data);
            curr = curr.next;
        }
    }

    public static void main(String[] args) {

        // Create a hard-coded linked list:
        // 1 -> 2 -> 3 -> 4 -> 5
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        int N = 2;
        head = removeNthFromEnd(head, N);

        printList(head);
    }
}


