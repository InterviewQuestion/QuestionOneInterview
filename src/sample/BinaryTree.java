package sample;

import java.util.LinkedList;
import java.util.Stack;

public class BinaryTree {
    BinaryTreeNode root;
    LinkedList leaves = new LinkedList();
    Stack paths = new Stack();

    public BinaryTree() {
    }

    public BinaryTree(BinaryTreeNode root) {
        this.root = root;
    }

    public BinaryTreeNode getRoot() {
        return root;
    }

    public void setRoot(BinaryTreeNode root) {
        this.root = root;
    }

    public void insert_node(BinaryTreeNode root, int value) {
        if (root != null) {
            if (value < root.value) {
                if (root.leftNode != null)
                    insert_node(root.leftNode, value);
                else
                    root.setLeftNode(new BinaryTreeNode(value));
            } else if (value > root.value)
                if (root.getRightNode() != null)
                    insert_node(root.rightNode, value);
                else
                    root.setRightNode((new BinaryTreeNode(value)));
        }
    }

    public Stack search(BinaryTreeNode root, int value) {
        paths.clear();
        while (root != null) {
            if (root.value > value) {
                paths.push(root.value);
                root = root.leftNode;
            } else if (root.value < value) {
                paths.push(root.value);
                root = root.rightNode;
            } else {
                paths.push(root.value);
                return paths;
            }
        }
        return paths;
    }

    public void traverse_tree(BinaryTreeNode root) { // Used to traverse the tree and find the leaves
        if (root == null)
            return;
        if (root.leftNode == null && root.rightNode == null)
            leaves.add(root.value);
        traverse_tree(root.leftNode);
        //out.println(root.value);
        traverse_tree(root.rightNode);
    }
}
