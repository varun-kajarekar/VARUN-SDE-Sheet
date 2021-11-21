// add first 
public static void addF(int data){
        Node new_head = new Node(data);
        new_head.next = head;
        head = new_head;
}

// add last 

    public static void addL(int data){
        Node n1 = new Node(data);
        Node n = head;
        while (n.next != null){
            n = n.next;
        }
        n.next = n1;
        n1.next = null;
}
// add middle of linkedlist

public static void addM(int data){
        Node n1 = new Node(data);
        Node h1 = head;
        int n = 0;
        while (h1 != null) {
            n++;
            h1 = h1.next;
        }
        if (n%2==0) {n=n/2-1;}
        else{n = (n/2);}
        Node h2 = head;
        while (n-->0){
            h2 = h2.next;
        }
        n1.next = h2.next;
        h2.next = n1;
}
