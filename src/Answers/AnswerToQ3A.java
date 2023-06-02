package Answers;

import util.*;

public class AnswerToQ3A {

    public static void main(String[] args) {

        int[] arr = {5, 10, 15, 7, 3, 27, 14, 1}; // test list

        SinglyLinkedList list = new SinglyLinkedList(new Node(arr[0])); // initialize linked list with initial node
        Node cur = list.head;
        for (int i = 1; i < arr.length; i++) { // iterate through array adding to list.
            cur.next = new Node(arr[i]);
            cur = cur.next;
        }

        System.out.println(list + "\n");

        removeValuesLargerThanMax(list, 13);

        System.out.println(list + "\n");

    }

    public static void removeValuesLargerThanMax(SinglyLinkedList list, int max) {

        try {
            Node curr = list.head;
            while(curr != null && curr.next != null){
                if (curr == list.head && (int)curr.data > max) // if the list head is greater than max remove it
                    list.head = list.head.next;
                if ((int) curr.next.data > max) {   // if the next value is greater than max remove it
                    curr.next = curr.next.next;
                } else                              // else iterate through list
                    curr = curr.next;
            }

        }catch (ClassCastException e){ // catches if the node data type is not an integer
            System.out.println("Warning! List data does not contain only integers!\n");
        }

    }

}