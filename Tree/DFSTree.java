import java.util.Stack;

public class DFSTree {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right = new TreeNode(3);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);

		DFSTree(root);
		DFSTree2(root);
	}

	/**
	 * µÝ¹é
	 * 
	 * @param node
	 */
	public static void DFSTree(TreeNode node) {
		if (node == null) {
			return;
		}
		System.out.print(node.value + " ");
		DFSTree(node.left);
		DFSTree(node.right);
	}

	/*
	 * ±éÀú
	 */
	public static void DFSTree2(TreeNode root) {
		if (root == null) {
			return;
		}

		Stack<TreeNode> stack = new Stack<>();
		stack.push(root);

		while (!stack.isEmpty()) {
			TreeNode node = stack.pop();
			if (node.right != null) {
				stack.push(node.right);
			}
			if (node.left != null) {
				stack.push(node.left);
			}
			System.out.print(node.value + " ");
		}
	}
}
