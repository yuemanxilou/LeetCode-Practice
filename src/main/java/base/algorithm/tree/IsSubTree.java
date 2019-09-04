package base.algorithm.tree;

public class IsSubTree {
    public static void main(String[] args) {

    }

    public boolean isSubtree(TreeNode s, TreeNode t){
        if (s == null){return false;}
        return isSubtreeWithRoot(s, t) || isSubtree(s.left, t) || isSubtree(s.right, t);
    }


    private boolean isSubtreeWithRoot(TreeNode s, TreeNode t){
        if (t == null && s == null){
            return true;
        }

        if (t == null || s == null){
            return false;
        }

        if (t.val != s.val){
            return false;
        }

        return isSubtreeWithRoot(s.left, t.left) && isSubtreeWithRoot(s.right, t.right);

    }
}
