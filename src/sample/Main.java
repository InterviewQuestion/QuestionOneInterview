package sample;

import javax.xml.xpath.XPath;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BinaryTree tree = new BinaryTree(new BinaryTreeNode(5));
        System.out.println("New Binary Tree Node with root equal to " + tree.root.value);
        tree.insert_node(tree.root,7);
        tree.insert_node(tree.root,2);
        tree.insert_node(tree.root,9);
        tree.insert_node(tree.root,1);
        tree.insert_node(tree.root, 6);
        tree.insert_node(tree.root,3);
        // We can use queues or linked list and have the value in them and add them to the array
        tree.traverse_tree(tree.root);
        int total = 0;
        for (int i =0 ; i< tree.leaves.size(); i++){
            String x= "";
            tree.search(tree.root,(Integer) tree.leaves.get(i));
            int y =tree.paths.size();
            for (int j =0 ; j<y ; j++){
                x= x + tree.paths.pop();
            }
            //System.out.println(x);
            total += flipStringThenToArray(x);
            System.out.println(total);
        }
    }

    private static int flipStringThenToArray(String x) {
        int y=0;
        int pow;
        int size= x.length()-1;
        for (int i = size; i >=0; i-- ){
            pow = (int) (Math.pow(10,(i)));
            y += Integer.parseInt(String.valueOf(x.charAt(i)))* pow;
            //System.out.println(x.charAt(i));
        }
        return y;
    }
}
