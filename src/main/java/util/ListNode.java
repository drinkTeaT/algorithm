package util;

import java.util.Arrays;
import java.util.List;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    public static ListNode genListNode(List<Integer> list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        ListNode root = new ListNode(list.get(0));
        ListNode temp = root;
        for (int i = 1; i < list.size(); i++) {
            temp.next = new ListNode(list.get(i));
            temp = temp.next;
        }
        return root;
    }

    public static void main(String[] args) {
        genListNode(Arrays.asList(1, 32, 3, 4, 5));
    }
}