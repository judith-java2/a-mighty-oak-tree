package org.example;

public class Node<T> {
    private T data;
    private Node<T> left;
    private Node<T> right;

    public Node(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setLeft(Node<T> left) {
        this.left = left;
    }

    public void setRight(Node<T> right) {
        this.right = right;
    }

    public Node<T> getLeft() {
        return left;
    }

    public Node<T> getRight() {
        return right;
    }
}
