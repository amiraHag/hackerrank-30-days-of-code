

    public static  Node insert(Node head,int data) {
        //Complete this method
        Node newNode = new Node(data);
        Node current = head;
        if(current == null){
            return newNode;
        }
        if(current.next == null){
            current.next = newNode;
            return head;
        }
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
        return head;
    }
