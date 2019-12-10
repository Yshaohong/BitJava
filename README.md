# BitJava
// 给定一个带有头结点 head 的非空单链表，返回链表的中间结点。如果有两个中间结点，则返回第二个中间结点
//只遍历一次（快慢指针）
public class Solution876_1 {
    public ListNode middleNode(ListNode head){
        //判断边界
        if(head==null||head.next==null){
            return head;
        }
        //慢指针
        ListNode low = head;
        //快指针
        ListNode fast = head;
        while(fast!=null&&fast.next!=null){
            low=low.next;
            fast=fast.next.next;
        }
        //此时low一定在中间位置
        return low;
    }
}



// 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的
//合并两个链表，空间复杂度为O1
public class Solution21_1 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(-1);
        ListNode temp =dummyHead;
        //遍历l1和l2
        while (l1!=null&&l2!=null){
            if(l1.val<=l2.val) {
                temp.next = l1;
                temp=l1;
                l1 = l1.next;
            }else{
                temp.next=l2;
                temp=l2;
                l2=l2.next;
            }
        }
        temp.next=(l1==null)?l2:l1;
        return dummyHead.next;
    }
}
