package src.leetcode.easy;

import java.util.List;

public class MergeTwoSortedList21 {

    public static void main(String[] args) {

        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);





        list1.next.next = new ListNode(4);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        ListNode temp = new ListNode();
        ListNode head = temp;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                head.next = list1;
                list1 = list1.next;
            } else {
                head.next = list2;
                list2 = list2.next;
            }
            head = head.next;
        }

        // Attach the remaining elements of list1 or list2 to the merged list
        head.next = (list1 != null) ? list1 : list2;

        // Print the merged list
        ListNode current = temp.next;
        StringBuilder sb = new StringBuilder();
        while (current != null) {
            sb.append(current.val).append(" ");
            current = current.next;
        }
        System.out.println(sb.toString());
    }

}

