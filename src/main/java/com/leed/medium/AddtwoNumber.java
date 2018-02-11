package com.leed.medium;

/**
 * Created by qx44577 on 2017/12/29.
 */
public class AddtwoNumber {
//    2
//    You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order
//    and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
//
//    You may assume the two numbers do not contain any leading zero, except the number 0 itself.

    private static ListNode list1;
    private static ListNode list2;

    public static void main(String[] args) {
        init();

        ListNode head = addTwoNumbers(list1,list2);

        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }

    }

    public static ListNode addTwoNumbers(ListNode list1,ListNode list2){
        ListNode head = null;

        ListNode current = null;

        ListNode c1 = list1;
        ListNode c2 = list2;

        int out = 0;

        while (c1 != null || c2 != null || out != 0) {
            int a = 0;
            int b = 0;
            if (c1 != null) {
                a = c1.val;
                c1 = c1.next;
            }
            if (c2 != null) {
                b = c2.val;
                c2 = c2.next;
            }
            int res = a + b + out;
            out = res / 10;

            ListNode cur = new ListNode(res % 10);
            if (head == null) {
                head = cur;
            }
            if (current == null) {
                current = cur;
            } else {
                current.next = cur;
                current = cur;
            }
        }
        return head;
    }

    public static void init() {
        ListNode node11 = new ListNode(2);
        ListNode node12 = new ListNode(4);
        ListNode node13 = new ListNode(5);
        node11.next = node12;
        node12.next = node13;

        ListNode node21 = new ListNode(5);
        ListNode node22 = new ListNode(6);
        ListNode node23 = new ListNode(4);
//        ListNode node24 = new ListNode(4);
        node21.next = node22;
        node22.next = node23;
//        node23.next = node24;

        list1 = node11;
        list2 = node21;
    }


    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
