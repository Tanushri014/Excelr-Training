package day23;

public class BST {
	static BSTNode root;
	public static void main(String[] args) {
		root=insert(root,50);
		insert(root,20);
		 insert(root, 70);
	        insert(root, 20);
	        insert(root, 40);
	        insert(root, 60);
	        insert(root, 80);
	        System.out.println("Pre-Order Traversal");
	        preOrder(root);
	        System.out.println("In-Order Traversal");
	        inOrder(root);
	        System.out.println("Post-Order Traversal");
	        postOrder(root);
	}
	private static BSTNode insert(BSTNode root,int data) {
		if(root==null) {
			return new BSTNode(data);
			
		}
		if(data<root.data) {
			root.left=insert(root.left,data);
		}
		else if(data>root.data) {
			root.right=insert(root.right, data);
		}
		return root;
	}
	private static void preOrder(BSTNode root) {
		if(root==null) {
			return;
		}
		
		 System.out.println(root.data);

		    preOrder(root.left);

		    preOrder(root.right);
	}
	private static void inOrder(BSTNode root) {
		if(root==null) {
			return;
		}
		    inOrder(root.left);
		    System.out.println(root.data);

		    inOrder(root.right);
	}
	private static void postOrder(BSTNode root) {

	    if (root == null) {
	        return;
	    }

	    postOrder(root.left);

	    postOrder(root.right);

	    System.out.println(root.data);
	}
	

}
