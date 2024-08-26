package Day_26;

import org.w3c.dom.Node;
import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> postorder(TreeNode root) {
        if (root == null) return new ArrayList<>();

        List<Integer> res = new ArrayList<>();

        dfs(root, res);

        return res;
    }

    private void dfs(TreeNode root, List<Integer> res) {
        for (TreeNode child : root.children) {
            dfs(child, res);
        }
        res.add(root.val);
    }

    public static void main(String[] args) {
        // Create a sample tree
        TreeNode root = new TreeNode(1, new ArrayList<>());
        TreeNode child1 = new TreeNode(2, new ArrayList<>());
        TreeNode child2 = new TreeNode(3, new ArrayList<>());
        root.children.add(child1);
        root.children.add(child2);
        child1.children.add(new TreeNode(4, new ArrayList<>()));
        child1.children.add(new TreeNode(5, new ArrayList<>()));
        child2.children.add(new TreeNode(6, new ArrayList<>()));
        child2.children.add(new TreeNode(7, new ArrayList<>()));

        Solution solution = new Solution();
        List<Integer> result = solution.postorder(root);

        System.out.println(result); // Output should be [4, 5, 2, 6, 7, 3, 1]
    }
}

// Assuming TreeNode class is defined as follows:
class TreeNode {
    public int val;
    public List<TreeNode> children;

    public TreeNode(int val, List<TreeNode> children) {
        this.val = val;
        this.children = children;
    }
}


