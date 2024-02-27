package ci583.labs.lists;

/**
 * A set implemented as linked list.
 */

public class SortedList extends LinkedList {

    public void insert (int data) {
        Node n = new Node(data);
        if (_head == null) {
            _head = n;
            return;
        }
        Node last = _head;
        Node prev = null;
        while (last != null) {
            if (last.data > data) {
                if (prev == null) {
                    _head = n;
                    n.next = last;
                } else {
                    prev.next = n;
                    n.next = last;
                }
                return;
            }
            if(last.next == null) {
                last.next = n;
                return;
            }
            prev = last;
            last = last.next;
        }
    }

}
