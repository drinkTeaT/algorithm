package demo.solution;

import demo.ISolution;
import util.ListNode;

import java.util.Arrays;

/**
 * @author EDZ
 * @description 奇偶链表 leetcode-328
 * 输入: 1->2->3->4->5->NULL
 * 输出: 1->3->5->2->4->NULL
 * @date 2020/8/19 14:06
 */
public class OddEvenLinkListSolution implements ISolution {
    @Override
    public void solution() {
        ListNode node = ListNode.genListNode(Arrays.asList(1, 2, 3, 4, 5));
        leftRecursive(node);
        leftRecursive(node.next);
    }

    private ListNode leftRecursive(ListNode node) {
        if (node == null) {
            return null;
        }
        if (node.next == null) {
            return node;
        }
        node.next = leftRecursive(node.next.next);
        return node;
    }

    private ListNode rightRecursive(ListNode node) {
        if (node == null) {
            return null;
        }
        node.next = leftRecursive(node.next);
        return node;
    }
}
