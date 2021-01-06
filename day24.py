

    def removeDuplicates(self,head):
        #Write your code here
        currentNode=head
        while currentNode.next != None :
           if currentNode.data == currentNode.next.data:
            currentNode.next=currentNode.next.next
           else:
             currentNode=currentNode.next;
        return head;
