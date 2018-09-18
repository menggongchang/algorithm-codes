import java.util.ArrayList;
import java.util.LinkedList;

public class BFSTree {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right = new TreeNode(3);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);

		BFSTree(root);
	}

	public static void BFSTree(TreeNode root) {
		if (root == null) {
			return;
		}

		LinkedList<TreeNode> queue = new LinkedList<>();
		queue.add(root);

		while (!queue.isEmpty()) {
			TreeNode node = queue.remove(0);

			if (node.left != null) {
				queue.add(node.left);
			}
			if (node.right != null) {
				queue.add(node.right);
			}
			System.out.print(node.value + " ");
		}
	}
}
