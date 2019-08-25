package base.algorithm.linklist;

public class MergeTwoLinkList {
    public static void main(String[] args) {


        LinkNode node5 = new LinkNode(9, null);
        LinkNode node4 = new LinkNode(7, node5);
        LinkNode node3 = new LinkNode(5, node4);
        LinkNode node2 = new LinkNode(3, node3);
        LinkNode head1 = new LinkNode(1, node2);


        LinkNode node25 = new LinkNode(10, null);
        LinkNode node24 = new LinkNode(8, node25);
        LinkNode node23 = new LinkNode(6, node24);
        LinkNode node22 = new LinkNode(4, node23);
        LinkNode head2 = new LinkNode(2, node22);

        LinkNode mergeHead = solution2(head1, head2);
        System.out.println(mergeHead);

    }

    private static LinkNode solution(LinkNode head1, LinkNode head2) {
        if (head1 == null) {
            return head2;
        }

        if (head2 == null) {
            return head1;
        }

        LinkNode mergeHead = new LinkNode(0, null);
        LinkNode currentNode = mergeHead;


        while (head1 != null && head2 != null) {
            if (head1.getValue() <= head2.getValue()) {
                currentNode.setNext(head1);
                currentNode = currentNode.getNext();
                head1 = head1.getNext();
            } else if (head1.getValue() > head2.getValue()) {
                currentNode.setNext(head2);
                currentNode = currentNode.getNext();
                head2 = head2.getNext();
            }
        }

        if (head1 == null) {
            currentNode.setNext(head2);
        }

        if (head2 == null) {
            currentNode.setNext(head1);
        }

        return mergeHead.getNext();
    }


    private static LinkNode solution2(LinkNode head1, LinkNode head2) {
        if (head1 == null) {
            return head2;
        }

        if (head2 == null) {
            return head1;
        }

        if (head1.getValue() <= head2.getValue()) {
            head1.setNext(solution2(head1.getNext(), head2));
            return head1;
        } else {
            head2.setNext(solution2(head1, head2.getNext()));
            return head2;
        }

    }
}
