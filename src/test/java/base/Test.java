package base;

import base.algorithm.linklist.LinkNode;

public class Test {
    public LinkNode reverserList(LinkNode head) {
        if (head == null || head.getNext() == null) {
            return head;
        }

        LinkNode next = head.getNext();
        LinkNode newHead = reverserList(next);
        next.setNext(head);
        head.setNext(null);
        return newHead;
    }

}
