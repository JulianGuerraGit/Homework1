package Answers;

import util.Node;
import util.SinglyLinkedList;

public class AnswerToQ3B {

    public static void main(String[] args) {

        System.out.println("\nThe last pen is #" + bobsLastPen(5,1));

    }

    public static int bobsLastPen(int numberOfPens, int k){

        SinglyLinkedList list = new SinglyLinkedList(new Node(1)); // initialize linked list with initial node
        Node cur = list.head;
        for (int i = 2; i <= numberOfPens; i++) { // iterate through array adding to list.
            cur.next = new Node(i);
            cur = cur.next;
        }
        cur.next = list.head;
        System.out.println(list);// circular

        cur = list.head;
        while(cur != cur.next){
            for(int i = 1; i<k; i++){
                cur = cur.next;
            }
            System.out.println("Removed pen #" + cur + ", " + list);
            cur.data = cur.next.data;
            cur.next = cur.next.next;
        }

        return (int)cur.data;
    }

}
