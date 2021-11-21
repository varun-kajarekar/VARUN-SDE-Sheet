
public static void Delete(int n) {
        Node first = head;
        n = n - 1;
        if (n == 0) {
            head = head.next;
        } else {
            Node prev = null;
            while (n-- > 0) {
                prev = first;
                first = first.next;
            }
            prev.next = first.next;
        }
    }
