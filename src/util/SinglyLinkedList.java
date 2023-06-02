package util;

public class SinglyLinkedList {
    public Node head;

    public SinglyLinkedList(Node head) {
        this.head = head;
    }

    public String toString2() {
        if (head == null)//base case
            return "[]";
        String result = "[" + head;
        if (head.next != null)
            result += ", ";
        SinglyLinkedList rest = new SinglyLinkedList(head.next);

        return result + rest.toString2().substring(1);
    }
    @Override
    public String toString() { // works for both linear and circular
        String rv = "[";
        Node cur = head;
        if (cur != null)// if not empty
            do {
                rv += cur;
                if (cur.next != head && cur.next != null)
                    rv += ", ";
                cur = cur.next;
            } while (cur != head && cur != null);
        rv += "]";

        return rv;
    }

}