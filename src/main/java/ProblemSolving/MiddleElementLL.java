package ProblemSolving;

public class MiddleElementLL {
    Node head;
    class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }

    public void findMiddle() {
        Node slow = head;
        Node fast = head;

        if (head != null) {
            while (fast != null && fast.next != null) {
                fast = head.next.next;
                slow = head.next;

            }
            System.out.println("\nMiddle element is " + slow.data);
        }
    }

    public void push(int newdata) {
        Node new_node = new Node(newdata);
        new_node.next = head;
        head = new_node;
    }


    public void printList(){
        Node tempNode = head;
        while(tempNode!=null){
            System.out.print(tempNode.data+"->");
            tempNode = tempNode.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        MiddleElementLL nn = new MiddleElementLL();
        for (int i = 1; i <= 5; i++) {
            nn.push(i);
            nn.printList();
            nn.findMiddle();
        }
    }
}
