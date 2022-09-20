// This method is known as Floyd's cycle method.
public static boolean detectLoop(Node head){
        
        Node slow_ptr=head;
        Node fast_ptr=head;
        
        int flag=0;
        while(slow_ptr!=null && fast_ptr!=null && fast_ptr.next!=null){
            slow_ptr=slow_ptr.next;
            fast_ptr=fast_ptr.next.next;
            
            if(slow_ptr==fast_ptr){
                flag=1;
                break;
            }
        }
        if(flag==1){
            return true;
        }else{
            return false;
        }
    }
