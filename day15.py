

    def insert(self,head,data):
        newNode = Node(data)
        current = head
        if(current == None):
            return newNode;
        if(current.next == None):
            current.next = newNode;
            return head;
        while(current.next != None):
            current = current.next;

        current.next = newNode;
        return head;
