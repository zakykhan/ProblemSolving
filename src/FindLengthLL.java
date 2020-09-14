import java.util.LinkedList;

public class FindLengthLL {
    Node head;
    public class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }

    public int length(){
        Node temp = head;
        int count = 0;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        return count;
    }
    //Recursive Approach
    /*public int length(Node curr){
        if(curr == null){
            return 0;
        }
        else{
            return 1+length(curr.next);
        }
    }*/

    public void push(int newData){
        Node newNode = new Node(newData);
        newNode.data = newData;
        newNode.next = head;
        head = newNode;
    }

    public void print(){
        Node temp =head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp =temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        FindLengthLL ll = new FindLengthLL();
        for(int i = 5; i >0; i--){
            ll.push(i);
        }
        System.out.println("Linked List:");
        ll.print();
        System.out.println("length:"+ ll.length());
    }
}
