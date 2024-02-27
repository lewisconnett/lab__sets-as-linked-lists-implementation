package ci583.labs.lists;

public class Set extends LinkedCollection {

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Set s2)) {
            return false;
        }
        if (this.length() != s2.length()) {
            return false;
        }
        Node n = _head;
        while (n != null) {
            if (!s2.member(n.data)) {
                return false;
            }
            n = n.next;
        }
        return true;
    }

    public void insert(int data) {
        // Create a new node to be inserted with the provided data
        var n = new Node(data);

        // If the list is empty (head is null)
        if (_head == null) {
            // Set the new node as the head of the list
            _head = n;
            return;
        }

        // Initialize variables for traversing the list
        var last = _head; // Start from the head
        Node prev = null; // Keep track of the previous node

        // Traverse the list until the end or a matching element is found
        while (true) {
            // Check if the current node's data matches the provided data
            if (last.data == data) {
                // Duplicate found, do not insert (optional behavior)
                return; // You can modify this line to throw an exception or handle duplicates differently
            } else if (last.next == null) {
                // Reached the end of the list
                last.next = n; // Set the new node as the last node's next
                return;
            }

            // Move to the next node
            prev = last;
            last = last.next;
        }
    }

    public Set union(Set s2) {
        // Create a new empty set to store the union result
        var s3 = new Set();
        var n = _head;
        // Check if the current set is empty
        while (n != null) {
            // Add the data of each node from the current list to the new set
            s3.insert(n.data);
            n = n.next;
        }
        // Start traversing the second set (s2) from its head
        n = s2._head;
        // Add the data of each element from the second set to the new set
        while (n != null) {
            s3.insert(n.data);
            n = n.next;
        }
        // Return the newly created set containing the union of both sets
        return s3;
    }

    public Set intersection(Set s2) {
        var s3 = new Set();
        var n = _head;
        while (n != null) {
            if (s2.member(n.data)) {
                s3.insert(n.data);
            }
            n = n.next;
        }
        return s3;
    }

    public Set difference(Set s2) {
        var s3 = new Set();
        var n = _head;
        while (n != null) {
            if (!(s2.member(n.data))) {
                s3.insert(n.data);
            }
            n = n.next;
        }
        return s3;
    }
}
