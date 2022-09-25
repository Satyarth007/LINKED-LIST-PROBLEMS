  static int countNodes(Node n)
    {
        int res = 1;
        Node temp = n;
        while (temp.next != n) {
            res++;
            temp = temp.next;
        }
        return res;
    }
 
   
    static int countNodesinLoop(Node head)
    {
        Node slowPtr = head, fastPtr = head;
 
        while (slowPtr != null && fastPtr != null
               && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
 
           
            if (slowPtr == fastPtr)
                return countNodes(slowPtr);
        }
 
        
        return 0;
    }
