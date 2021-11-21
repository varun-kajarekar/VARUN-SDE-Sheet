static Node segregate(Node head)
    {
        int zero=0,one=0,two=0;
        Node cur=head;
        while(cur!=null)
        {
            if(cur.data==0)
                zero++;
            else if(cur.data==1)
                one++;
            else
                two++;
            cur=cur.next;
        }
        cur=head;
        while(cur!=null)
        {
            if(zero>0)
            {
                cur.data=0;
                zero--;
            }
            else if(one>0)
            {
                cur.data=1;
                one--;
            }
            else
            {
                cur.data=2;
            }
            cur=cur.next;
        }

        return head;
    }
