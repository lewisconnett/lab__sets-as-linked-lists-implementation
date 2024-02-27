package ci583.labs.lists;

public class LinkedCollection {

    protected Node _head;

    public boolean isEmpty() {
        return _head == null;
    }

    public int length() {
        Node last = _head;
        int counter = 0;
        while (last != null) {
            counter++;
            last = last.next;
        }
        return counter;
    }

    public boolean member(int data) {
        Node last = _head;
        while (last != null) {
            if (last.data == data) {
                return true;
            }
            last = last.next;
        }
        return false;
    }

    public void printList() {
        Node n = _head;
        System.out.println(n.data);
        while (n.next != null) {
            n = n.next;
            System.out.println(n.data);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node n = _head;
        while (n != null) {
            sb.append(n.data + ":");
            n = n.next;
        }
        return sb.toString();
    }


}
