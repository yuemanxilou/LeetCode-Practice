package base.algorithm.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageOfLevels {
    private Queue<TreeNode> queue = new LinkedList<>();

    public List<Double> averageOfLevels(TreeNode root){
        List<Double> resList = new ArrayList<>();


        if (root == null){
            return resList;
        }

        queue.add(root);



        while (!queue.isEmpty()){

            double res = 0.0;
            int count = queue.size();

            for (int i =0; i< count;i++){
                TreeNode node = queue.poll();
                res += node.val;

                if (node.left != null){
                    queue.add(node.left);
                }


                if (node.right != null){
                    queue.add(node.right);
                }
            }

            resList.add(res/count);

        }
        return resList;
    }



    public static void main(String[] args) {

        TreeNode treeNode11 = new TreeNode(15, null, null);
        TreeNode treeNode12 = new TreeNode(7, null, null);
        TreeNode treeNode13 = new TreeNode(20, treeNode11, treeNode12);
        TreeNode treeNode14 = new TreeNode(9, null, null);
        TreeNode treeNode15 = new TreeNode(3, treeNode14, treeNode13);

        AverageOfLevels averageOfLevels = new AverageOfLevels();

        List<Double> resList = averageOfLevels.averageOfLevels(treeNode15);
        System.out.println(resList);

    }
}
