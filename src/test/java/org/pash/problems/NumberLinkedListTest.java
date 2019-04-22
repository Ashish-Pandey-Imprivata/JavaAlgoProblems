package org.pash.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NumberLinkedListTest {

    @Test
    public void testPrintList () {
        NumberLinkedList l1 = new NumberLinkedList(1);
        l1.appendNode(2);
        l1.appendNode(9);

        int val = l1.printValue();
        assertEquals (val, 129);

        l1.appendNode(5);
        val = l1.printValue();
        assertEquals (val, 1295);

        int len1 = l1.getLength();

        assertEquals(len1, 4);
    }

    @Test
    void testSumLists () {
        NumberLinkedList l1 = new NumberLinkedList(2).appendNode(6).appendNode(4).appendNode(9);
        NumberLinkedList l2 = new NumberLinkedList(4).appendNode(3).appendNode(3);

        NumberLinkedList sum = new NumberLinkedList(l1.addTwoNumbers(l1.getRoot(), l2.getRoot()));

        int val = sum.printValue();
        assertEquals(val, 3082);

    }
}
