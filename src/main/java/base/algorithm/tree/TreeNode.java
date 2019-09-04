package base.algorithm.tree;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){val = x;}
    TreeNode(int x, TreeNode l, TreeNode r){
        val = x;
        left = l;
        right = r;
    }

}
