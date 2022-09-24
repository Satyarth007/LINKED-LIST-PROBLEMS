 boolean isPalindrome(Node head) 
    {
       
        Stack<Integer> st=new Stack<>();
        Node temp1=head;
        while(temp1!=null){
            st.push(temp1.data);
            temp1=temp1.next;
        }
        Node temp2=head;
        while(temp2!=null){
            if(temp2.data== st.peek()){
                st.pop();
            }
            temp2=temp2.next;
        }
        
        if(st.isEmpty()){
            return true;
        }else{
            return false;
        }
    }    
