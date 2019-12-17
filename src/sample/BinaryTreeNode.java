package sample;

import java.util.LinkedList;

public class BinaryTreeNode {
    BinaryTreeNode leftNode;
    BinaryTreeNode rightNode;
    int value;

    public BinaryTreeNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(BinaryTreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public BinaryTreeNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(BinaryTreeNode rightNode) {
        this.rightNode = rightNode;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public BinaryTreeNode(int value) {
        this.value = value;
        leftNode= null;
        rightNode=null;
    }

}
