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
     * 放入栈中 没解决
     */
    public static ListNode solution1(ListNode node) {
        if (node == null) {
            return null;
        }
        Stack<Integer> temp = new Stack<>();
        while (node != null) {
            temp.push(node.val);
            node = node.next;
        }
        ListNode result = new ListNode(temp.pop());
        result.next = new ListNode(temp.pop());
        while (!temp.isEmpty()) {

        }
        return result;
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
