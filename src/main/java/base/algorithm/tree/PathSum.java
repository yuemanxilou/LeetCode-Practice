package base.algorithm.tree;

public class PathSum {

    public static void main(String[] args) {

        TreeNode treeNode1 = new TreeNode(23, null, null);
        TreeNode treeNode12 = new TreeNode(7, null, null);
        TreeNode treeNode13 = new TreeNode(20, treeNode1, treeNode12);
        TreeNode treeNode14 = new TreeNode(9, null, null);
        TreeNode treeNode15 = new TreeNode(3, treeNode14, treeNode13);

        PathSum pathSum = new PathSum();
        int res = pathSum.pathSum(treeNode15, 23);
        System.out.println(res);

    }

    public int pathSum(TreeNode root, int sum){

        if(root == null){
            return 0;
        }

        int res = 0;


        res +=  path(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
        return res;
    }


    private int path (TreeNode root, int sum){
        int res = 0;

        if (root == null){
            return 0;
        }

        if (root.val == sum){
            res ++;
        }

        res += path(root.left, sum-root.val) + path(root.right, sum - root.val);
        return res;
    }

}
