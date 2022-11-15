
public class intro {

    // Leetcode Class 
    /*public class TreeNode {
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
    class node{
        int data;
        node left;
        node right;
        node(){}
        node(int data, node left, node right){
            this.data = data;
            this.left = left;
            this.right = right;
        }
        node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static void main(String[] args) {
        
    }
    public static void preOrder(node root){
        // Visit the node in the PRE Order 
        if(root == null) return;
        System.out.println(root.data);
        preOrder(root.left); // recursion will print the LST in Pre-Order
        preOrder(root.right); // Recursion will Print RST in Pre Order


        // visit the LST in the PRE Order 

        // Visit the RSR in the PRE Order 
    }
    public static void In_Order(node root){
        // Visit the node in the PRE Order 
        if(root == null) return;
       
        preOrder(root.left); // recursion will print the LST in Pre-Order
        System.out.println(root.data);
        preOrder(root.right); // Recursion will Print RST in Pre Order


        // visit the LST in the IN Order 

        // Visit the RSR in the IN Order 
    }
    public static void Post_Order(node root){
        // Visit the node in the PRE Order 
        if(root == null) return;
       
        preOrder(root.left); // recursion will print the LST in Pre-Order
        preOrder(root.right); // Recursion will Print RST in Pre Order
        System.out.println(root.data);

        // visit the LST in the Post Order 

        // Visit the RSR in the Post Order 
    }


    public static int count(node root){
        // Visit the node in the PRE Order 
        if(root == null) return 0;
        
        int ans = 1;
        ans += count(root.left);
        ans += count(root.right);
        return ans;
       
        // visit the LST in the IN Order 

        // Visit the RSR in the IN Order 
    }

    public static int sum(node root){
        // Visit the node in the PRE Order 
        if(root == null) return 0;
        
        int ans = root.data;
        ans += sum(root.left);
        ans += sum(root.right);
        return ans;
       
        // visit the LST in the IN Order 

        // Visit the RSR in the IN Order 
    }

}
