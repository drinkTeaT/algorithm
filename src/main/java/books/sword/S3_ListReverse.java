package books.sword;

import util.ListNode;

import java.util.Stack;

/**
 * Description 打印链表
 * 输入一个链表的头结点，从尾到头反过来打印出每个结点的值
 * <p>
 * leetcode 反转链表 简单
 * Author liuweibin
 * Date 2020/1/14 12:02
 **/
public class S3_ListReverse {
    public static void main(String[] args) {
    }

    /**
     *
     */
    public static ListNode solution1(ListNode node) {
        ListNode prev = null;
        ListNode curr = node;
        while (curr !=null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

    /**
     * 指向翻转;考验引用的功底。
     */
    public static ListNode solution2(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }
}
