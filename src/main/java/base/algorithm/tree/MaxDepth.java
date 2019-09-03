package base.algorithm.tree;

public class MaxDepth {
    public static void main(String[] args) {


        TreeNode treeNode1 = new TreeNode(15, null, null, null);
        TreeNode treeNode2 = new TreeNode(7, null, null, null);
        TreeNode treeNode3 = new TreeNode(20, treeNode1, treeNode2, null);
        TreeNode treeNode4 = new TreeNode(9, null, null, null);
        TreeNode treeNode5 = new TreeNode(3, treeNode4, treeNode3, null);

        int len = solution(treeNode5);
        System.out.println(len);

    }

    private static int solution(TreeNode root){
        if (root == null){
            return 0;
        }
        return Math.max(solution(root.getLeftChild()), solution(root.getRightChild())) + 1;
    }
}
