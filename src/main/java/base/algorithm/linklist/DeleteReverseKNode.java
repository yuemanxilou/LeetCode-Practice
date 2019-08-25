package base.algorithm.linklist;

public class DeleteReverseKNode {
    public static void main(String[] args) {

        LinkNode node5 = new LinkNode(5, null);
        LinkNode node4 = new LinkNode(4, node5);
        LinkNode node3 = new LinkNode(3, node4);
        LinkNode node2 = new LinkNode(2, node3);
        LinkNode node1 = new LinkNode(1, node2);
        LinkNode head = solution2(node1, 2);

        System.out.println(head);


    }

    private static LinkNode solution(LinkNode head, int k) {
        LinkNode nummyNode = new LinkNode(0, null);
        nummyNode.setNext(head);

        int n = 0;
        int count = 1;
        LinkNode currentNode = nummyNode.getNext();

        while (currentNode != null) {
            n++;
            currentNode = currentNode.getNext();
        }

        System.out.println(n);
        currentNode = nummyNode;

        while (count <= n - k) {
            currentNode = currentNode.getNext();
            count++;
        }

        LinkNode node = currentNode.getNext().getNext();
        currentNode.setNext(node);
        return nummyNode.getNext();
    }

    private static LinkNode solution2(LinkNode head, int k) {
        LinkNode dummyNode = new LinkNode(0, head);

        LinkNode node1 = dummyNode.getNext();
        LinkNode node2 = dummyNode.getNext();

        int count = k + 1;

        while (node1.getNext() != null) {
            node1 = node1.getNext();
            count--;

            if (count <= 0) {
                node2 = node2.getNext();
            }
        }
        LinkNode temp = node2.getNext().getNext();
        node2.setNext(temp);
        return dummyNode.getNext();
    }


}
