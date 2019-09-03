package base.algorithm.tree;


public class LowestCommonNode {

    public static void main(String[] args) {
        TreeNode1 treeNode1 = new TreeNode1(1, null, null, null);
        TreeNode1 treeNode12 = new TreeNode1(3, null, null, null);
        TreeNode1 treeNode13 = new TreeNode1(5, null, null, null);
        TreeNode1 treeNode14 = new TreeNode1(7, null, null, null);
        TreeNode1 treeNode15 = new TreeNode1(2, null, null, null);
        TreeNode1 treeNode16 = new TreeNode1(6, null, null, null);

        TreeNode1 root = new TreeNode1(4, null, null, null);


        treeNode1.setNext(treeNode15);
        treeNode12.setNext(treeNode15);

        treeNode13.setNext(treeNode16);
        treeNode14.setNext(treeNode16);

        treeNode15.setNext(root);
        treeNode16.setNext(root);

        root.setLeftChild(treeNode15);
        root.setRightChild(treeNode16);

        treeNode15.setLeftChild(treeNode1);
        treeNode15.setRightChild(treeNode12);

        treeNode16.setLeftChild(treeNode13);
        treeNode16.setRightChild(treeNode14);

        TreeNode1 node = solution(root, new TreeNode1(1, null, null, null), new TreeNode1(3, null, null, null));
        System.out.println(node);

    }


    private static TreeNode1 solution(TreeNode1 root, TreeNode1 node1, TreeNode1 node2) {
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

    private static TreeNode1 solution2(TreeNode1 root, TreeNode1 p, TreeNode1 q) {
        if (root == null || root == p || root == q) {
            return root;
        }

        TreeNode1 left = solution2(root.getLeftChild(), p, q);
        TreeNode1 right = solution2(root.getRightChild(), p, q);

        return left == null ? right : right == null ? left : root;

    }


}
