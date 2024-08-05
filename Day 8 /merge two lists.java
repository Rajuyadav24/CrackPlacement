class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        ListNode t1 = l1;
        ListNode t2 = l2;

        while(t1 != null && t2 != null){
            if(t1.val <= t2.val){
                temp.next = t1;
                temp = t1;
                t1 = t1.next;
            }
            else{
                temp.next = t2;
                temp = t2;
                t2 = t2.next;
            }
        }
        if(t1 != null) temp.next = t1;
        if(t2 != null) temp.next = t2;
        return dummy.next;
    }
}

