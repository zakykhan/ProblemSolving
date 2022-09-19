package ProblemSolving;

import java.util.*;

class IsCyclicLL
{
    static class Node
    {
        int data;
        Node next;
    }

    static boolean isCircular( Node head)
    {
        if (head == null)
            return true;

        Node node = head.next;
        while (node != null && node != head)
            node = node.next;

        if(node == head)
            return true;
        return false;
    }

    static Node newNode(int data)
    {
        Node temp = new Node();
        temp.data = data;
        temp.next = null;
        return temp;
    }

    public static void main(String args[])
    {
        Node head = newNode(1);
        head.next = newNode(2);
        head.next.next = newNode(3);
        head.next.next.next = newNode(4);

        head.next.next.next.next = head;

        if(isCircular(head)){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }

    }
}

