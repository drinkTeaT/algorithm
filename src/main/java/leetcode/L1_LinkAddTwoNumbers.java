package leetcode;

import util.ListNode;

import java.util.Stack;

/**
 * Description  两数相加 中等
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * 示例：
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 * Author liuweibin
 * Date 2020/1/13 14:37
 **/
public class L1_LinkAddTwoNumbers {
    public static void main(String[] args) {

    }

    public static ListNode solution(ListNode l1, ListNode l2) {
        int first = getValue(l1);
        int last = getValue(l2);
        String result = first + last + "";
        result = reverse(result);
        ListNode node = new ListNode(result.indexOf(0));
        for (int i = 1;i<result.length();i++){
            node.next = new ListNode(result.indexOf(i));
        }
        return node;
    }

    private static int getValue(ListNode l1) {
        String str = "";
        Stack<Integer> firstStack = new Stack<>();
        while (l1 != null) {
            firstStack.push(l1.val);
            l1 = l1.next;
        }
        while (!firstStack.isEmpty()) {
            str += firstStack.pop();
        }
        return Integer.parseInt(str);
    }

    private static String reverse(String s){
        String str = "";
        Stack<String> strings = new Stack<>();
        for (int i = 0 ;i <s.length();i++){
            strings.push(s.charAt(i)+"");
        }
        while (!strings.isEmpty()) {
            str += strings.pop();
        }
        return str;
    }
}
