package base.algorithm.tree;

public class BalancedTree {
    private static boolean isBalanced = true;

    public static void main(String[] args) {


    }

    private static boolean solution(TreeNode root){
        maxDepth(root);
        return isBalanced;
    }


    private static int maxDepth(TreeNode root){
        if (root == null){
            return 0;
        }

        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        if (Math.abs((leftDepth - rightDepth)) >1){
            isBalanced = false;
        }

        return Math.max(leftDepth, rightDepth) + 1;

    }

    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){val = x;}
    }

}
