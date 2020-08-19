package demo.solution;

import demo.ISolution;
import util.ListNode;

import java.util.List;

/**
 * @author EDZ
 * @description K 个一组翻转链表
 * @date 2020/8/18 18:15
 */
public class ReverseKthLinkListSolution implements ISolution {
    @Override
    public void solution() {
        ListNode head = new ListNode(1);
        ListNode h1 = new ListNode(2);
        ListNode h3 = new ListNode(3);
        ListNode h4 = new ListNode(4);
        ListNode h5 = new ListNode(5);
        head.next = h1;
        h1.next = h3;
        h3.next = h4;
        h4.next = h5;
        reverseKGroup(head,2);
    }

    private ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        for(int i = 0;i<k-1;i++){
            if(temp == null || temp.next == null){
                return temp;
            }
            temp = temp.next;
        }
        ListNode split = reverseKGroup(temp.next,k);
        split = sort(split);
        temp.next = split;
        return head;
    }

    private ListNode sort(ListNode node){
        ListNode pre = null;
        ListNode c = node;
        ListNode n = node.next;
        while(n != null){
            ListNode temp = n.next;
            c.next = pre;
            n.next = c;
            pre = c;
            c= n;
            n = temp;
        }
        return c;
    }
}
