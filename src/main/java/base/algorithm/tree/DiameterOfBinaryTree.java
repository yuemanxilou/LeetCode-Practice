package base.algorithm.tree;

public class DiameterOfBinaryTree {
    private static int MAX = 0;

    public static void main(String[] args) {

    }

    public static int diameterOfBinaryTree(TreeNode root){
        depth(root);
        return MAX;
    }



    private static int depth(TreeNode root){
        if (root == null){
            return 0;
        }


        int leftLen = depth(root.left);
        int rightLen = depth(root.right);

        MAX = Math.max(MAX, rightLen + leftLen);


        return Math.max(leftLen, rightLen) + 1;
    }


}
