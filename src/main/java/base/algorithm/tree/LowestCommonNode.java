package base.algorithm.tree;


public class LowestCommonNode {

    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(1, null, null, null);
        TreeNode treeNode2 = new TreeNode(3, null, null, null);
        TreeNode treeNode3 = new TreeNode(5, null, null, null);
        TreeNode treeNode4 = new TreeNode(7, null, null, null);
        TreeNode treeNode5 = new TreeNode(2, null, null, null);
        TreeNode treeNode6 = new TreeNode(6, null, null, null);

        TreeNode root = new TreeNode(4, null, null, null);


        treeNode1.setNext(treeNode5);
        treeNode2.setNext(treeNode5);

        treeNode3.setNext(treeNode6);
        treeNode4.setNext(treeNode6);

        treeNode5.setNext(root);
        treeNode6.setNext(root);

        root.setLeftChild(treeNode5);
        root.setRightChild(treeNode6);

        treeNode5.setLeftChild(treeNode1);
        treeNode5.setRightChild(treeNode2);

        treeNode6.setLeftChild(treeNode3);
        treeNode6.setRightChild(treeNode4);

        TreeNode node = solution(root, new TreeNode(1, null, null, null), new TreeNode(3, null, null, null));
        System.out.println(node);

    }


    private static TreeNode solution(TreeNode root, TreeNode node1, TreeNode node2) {
        if (root == null) {
            return root;
        }

        if (root.getValue() < node1.getValue() && root.getValue() < node2.getValue()) {
            return solution(root.getRightChild(), node1, node2);
        } else if (root.getValue() > node1.getValue() && root.getValue() > node2.getValue()) {
            return solution(root.getLeftChild(), node1, node2);
        } else {
            return root;
        }
    }

    private static TreeNode solution2(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) {
            return root;
        }

        TreeNode left = solution2(root.getLeftChild(), p, q);
        TreeNode right = solution2(root.getRightChild(), p, q);

        return left == null ? right : right == null ? left : root;

    }


}
