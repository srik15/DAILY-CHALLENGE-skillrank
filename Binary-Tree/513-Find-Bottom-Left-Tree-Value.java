// Given the root of a binary tree, return the leftmost value in the last row of the tree.

// Input: root = [2,1,3]
// Output: 1

// Input: root = [1,2,3,4,null,5,6,null,null,7]
// Output: 7

class Solution {
    int ans=0, h=0;
    public int findBottomLeftValue(TreeNode root) {
        findBottom(root, 1);
        return ans;
    }
    public void findBottom(TreeNode root, int depth){
        if (h<depth) {ans = root.val ; h=depth;}
        if (root.left != null) findBottom(root.left,depth+1);
        if (root.right != null) findBottom(root.right, depth+1);
    }
}
