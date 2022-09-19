package ProblemSolving;

public class PreOrderTraversal {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        BinaryTree.TreeNode root = new BinaryTree.TreeNode("1");
        bt.root = root;
        bt.root.left = new BinaryTree.TreeNode("2");
        bt.root.left.left = new BinaryTree.TreeNode("3");
        bt.root.left.right = new BinaryTree.TreeNode("4");
        bt.root.right = new BinaryTree.TreeNode("5");
        bt.root.right.right = new BinaryTree.TreeNode("6");

        bt.preOrder();
    }
}

class BinaryTree{
    static class TreeNode {
        String data;
        TreeNode left;
        TreeNode right;

        TreeNode(String value){
            this.data=value;
            left = right = null;
        }
        boolean isLeaf() {
            return left == null && right == null;
        }

    }

    TreeNode root;

    public void preOrder() {
        preOrder(root);
    }

    private void preOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        System.out.printf("%s ", node.data);
        preOrder(node.left);
        preOrder(node.right);               /*for inorder :inOrder(node.left);
                                                           sout("%s", node.data);
                                                           inOrder(node.right); similarly for post order
                                                           with a minor difference*/
    }
}

/* if you want to find leaf node
    public static void printLeaves(TreeNode node) {
    s base case
        if (node == null) {
            return;
        }
        if (node.isLeaf()) {
            System.out.printf("%s ", node.value);
        }
        printLeaves(node.left);
        printLeaves(node.right); }
    }

*/
