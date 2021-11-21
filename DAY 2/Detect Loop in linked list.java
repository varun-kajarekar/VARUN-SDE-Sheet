
static Node head;
    public static class Node{
        int data;
        Node next;
        int flag;
        Node(int d){
            this.data = d;
            next = null;
            this.flag = flag;     // modified Node class
        }
    }
    
    
    static boolean detectLoop(Node h)
    {
        while (h != null)
        {

            // If this node is already traverse
            // it means there is a cycle
            // (Because you we encountering the
            // node for the second time).
            if (h.flag == 1)
                return true;

            // If we are seeing the node for
            // the first time, mark its flag as 1
            h.flag = 1;

            h = h.next;
        }
        return false;
    }
