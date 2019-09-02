package base.algorithm.idea.twopointers;


public class JudgeHasCycle {


    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(0);
        ListNode node3 = new ListNode(-4);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = head;


        boolean res = solution(head);

        if (res){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }


    }

    private static boolean solution(ListNode head){
        boolean res = false;
        if (head == null || head.next == null){
            return false;
        }

        ListNode pNode1 = head;
        ListNode pNode2 = head.next;

        while (pNode1 != null && pNode2 != null){
            if (pNode1.val == pNode2.val){
                res = true;
                break;
            }else {
                pNode1 = pNode1.next;
                if (pNode2.next != null && pNode2.next.next != null){
                    pNode2 = pNode2.next.next;
                }else {
                    break;
                }
            }
        }


        return res;
    }


    static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
            next = null;
        }
    }


}
