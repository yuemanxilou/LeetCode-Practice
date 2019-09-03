package base.algorithm.tree;

public class MaxDepth {
    public static void main(String[] args) {


        TreeNode1 treeNode1 = new TreeNode1(15, null, null, null);
        TreeNode1 treeNode12 = new TreeNode1(7, null, null, null);
        TreeNode1 treeNode13 = new TreeNode1(20, treeNode1, treeNode12, null);
        TreeNode1 treeNode14 = new TreeNode1(9, null, null, null);
        TreeNode1 treeNode15 = new TreeNode1(3, treeNode14, treeNode13, null);

        int len = solution(treeNode15);
        System.out.println(len);

    }

    private static int solution(TreeNode1 root){
        if (root == null){
            return 0;
        }
        return Math.max(solution(root.getLeftChild()), solution(root.getRightChild())) + 1;
    }
}
