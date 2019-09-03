package base.algorithm.tree;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TreeNode1 {
    private int value;
    private TreeNode1 leftChild;
    private TreeNode1 rightChild;
    private TreeNode1 next;
}
