package base.algorithm.tree;

public class InvertTree {

    public static void main(String[] args) {
        InvertTree invertTree = new InvertTree();
        invertTree.invertTree(null);
    }


    public TreeNode invertTree(TreeNode root){
        if (root == null){
            return null;
        }

        TreeNode leftNode = root.left;
        TreeNode rightNode = root.right;

        root.left = rightNode;
        root.right = leftNode;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }



}
