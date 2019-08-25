package base.algorithm.tree;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TreeNode {
    private int value;
    private TreeNode leftChild;
    private TreeNode rightChild;
    private TreeNode next;
}
