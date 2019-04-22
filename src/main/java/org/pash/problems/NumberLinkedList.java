package org.pash.problems;

import java.util.List;

public class NumberLinkedList extends AbstractProblems {

    void problemDefinition () {
        System.out.println("You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.\n" +
                "You may assume the two numbers do not contain any leading zero, except the number 0 itself.\n" +
                "Example:\n" +
                "Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)\n" +
                "Output: 7 -> 0 -> 8\n" +
                "Explanation: 342 + 465 = 807.");

        System.out.println("This is a just a test");
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode (int x) {val = x;}
    }

    public ListNode getRoot() {
        return root;
    }

    private ListNode root;

    /**
     * This constructor with one value create a root List Node with Integer value
     * @param nodeValue
     */

    NumberLinkedList (int nodeValue) {
        this.root = new ListNode(nodeValue);
    }

    /**
     * This constructor takes the ListNode as the argument
     * @param l1
     */

    NumberLinkedList (ListNode l1) {
        this.root = l1;
    }

    public NumberLinkedList appendNode (int nodeValue) {
        if (this.root == null)
            this.root = new ListNode(nodeValue);
        else {
            ListNode l1 = this.root;
            while (l1.next != null) {
                l1 = l1.next;
            }

            l1.next = new ListNode(nodeValue);
        }

        return this;
    }

    public int getLength () {
        int len = 0;

        ListNode traversal = this.root;
        while (traversal != null) {
            len++;
            traversal = traversal.next;
        }

        System.out.println("List Length: " +len);
        return len;
    }

    public int printValue (ListNode... l1) {
        StringBuffer sb = new StringBuffer("");

        ListNode traversal = l1.length > 0 ? l1[0] : this.root;

        while (traversal != null) {
            sb.append(traversal.val);
            traversal = traversal.next;
        }

        System.out.println("Linked List value: " + Integer.parseInt(sb.toString()));
        return Integer.parseInt(sb.toString());
    }

    public ListNode addTwoNumbers (ListNode l1, ListNode l2) {
        String sum = null;
        NumberLinkedList finalList = null;

        sum = Integer.toString (printValue(l1) + printValue(l2));

        char [] charArray = sum.toCharArray();

        for (char ch: charArray) {

            if (finalList == null)
                finalList = new NumberLinkedList(Character.getNumericValue(ch));
            else
                finalList.appendNode(Character.getNumericValue(ch));
        }

        return finalList.getRoot();
    }

}

