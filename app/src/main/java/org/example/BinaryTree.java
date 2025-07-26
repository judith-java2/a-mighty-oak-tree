package org.example;

public class BinaryTree<T> {
    private Node<T> root;

    public BinaryTree(Node<T> root) {
        this.root = root;
    }

    public Node<T> getRoot() {
        return root;
    }

    public void traverseInOrder(Node<T> node) {
        if (node != null) {
            traverseInOrder(node.getLeft());
            System.out.println(node.getData());
            traverseInOrder(node.getRight());
        }
    }

    public void traversePreOrder(Node<T> node) {
        if (node != null) {
            System.out.println(node.getData());
            traversePreOrder(node.getLeft());
            traversePreOrder(node.getRight());
        }
    }

    public void traversePostOrder(Node<T> node) {
        if (node != null) {
            traversePostOrder(node.getLeft());
            traversePostOrder(node.getRight());
            System.out.println(node.getData());
        }
    }
}
