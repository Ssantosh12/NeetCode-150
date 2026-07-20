/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    // instance level field (data structure) to hold 
    // IN-Order traversed elements from BST
    private ArrayList<Integer> inOrderArr=new ArrayList<>();

    public int kthSmallest(TreeNode root, int k) {
        // traverse tree in In-Order traversal and store sorted elements
        inOrderTraversal(root);

        return inOrderArr.get(k-1);
    }

    // state definition: for each subproblem of subtree with 'root' node
    // we call inOrderTraversal(left child node)+print/Add(current Node)
    // +inOrderTraversal(right child node)
    public void inOrderTraversal(TreeNode root){
        // base case: if root is null
        if(root==null)
            return;
        
        // transition:
        inOrderTraversal(root.left);
        inOrderArr.add(root.val);
        inOrderTraversal(root.right);
    }
}
