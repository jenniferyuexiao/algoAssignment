/**
* Binary Tree Traversal
* Inorder Traversal - left->root->right
* Preorder Traversal - root->left->right
* Postorder Traversal - left->right->root
*/

//Inorder Traversal
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        inorder(root, result);
        return result;
    }
    private List<Integer> inorder(TreeNode root, List<Integer> result) {
        if (root == null) {
            return result;
        }
        
        inorder(root.left, result);
        result.add(root.val);
        inorder(root.right, result);
        
        return result;
    }
}

//Preorder Traversal
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preorder(root,result);
        return result;
    }
    
    public List<Integer> preorder(TreeNode root, List<Integer> result) {
        if (root == null) {
            return result;
        }
        
        result.add(root.val);
        preorder(root.left, result);
        preorder(root.right, result);
        
        return result;
    }
}

//Postorder Traversal
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        postorder(root, result);
        
        return result;
    }
    
    public List<Integer> postorder(TreeNode root, List<Integer> result) {
        if (root == null) {
            return result;
        }
        
        postorder(root.left, result);
        postorder(root.right, result);
        result.add(root.val);
        
        return result;
    }
}
