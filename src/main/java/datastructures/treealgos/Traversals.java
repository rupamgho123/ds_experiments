package datastructures.treealgos;

import datastructures.tree.Tree;
import datastructures.tree.TreeNode;

/**
 * Created by rupam.ghosh on 22/04/16.
 */
public class Traversals {

    private Tree tree;

    public Traversals(Tree tree){
        this.tree = tree;
    }

    private void inOrder(TreeNode treeNode){
        if(treeNode != null){
            inOrder(treeNode.left);
            System.out.println(" "+treeNode.data+" ");
            inOrder(treeNode.right);
        }
    }

    private void preOrder(TreeNode treeNode){
        if(treeNode != null){
            System.out.println(" "+treeNode.data+" ");
            inOrder(treeNode.left);
            inOrder(treeNode.right);
        }
    }

    private void postOrder(TreeNode treeNode){
        if(treeNode != null){
            inOrder(treeNode.left);
            inOrder(treeNode.right);
            System.out.println(" "+treeNode.data+" ");
        }
    }

    public void inOrder(){
        inOrder(tree.rootNode);
    }

    public void preOrder(){
        preOrder(tree.rootNode);
    }

    public void postOrder(){
        postOrder(tree.rootNode);
    }
}
