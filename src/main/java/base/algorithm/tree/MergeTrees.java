package base.algorithm.tree;

public class MergeTrees {

    public static void main(String[] args) {

    }

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2){
        if (t1 == null){return t2;}
        if (t2 == null){return t1;}

        TreeNode root = new TreeNode(0);
        root.val = getValue(t1) + getValue(t2);

        root.left = mergeTrees(t1.left, t2.left);
        root.right = mergeTrees(t1.right, t2.right);

        return root;
    }


    private int getValue(TreeNode root){
        if (root == null){return 0;}
        else{
            return root.val;
        }
    }




}
