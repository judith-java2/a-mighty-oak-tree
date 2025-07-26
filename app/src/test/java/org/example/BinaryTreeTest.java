package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BinaryTreeTest {

    @Test
    public void testNodeCreation() {
        Squirrel squirrel = new Squirrel("Testy");
        Node<Squirrel> node = new Node<>(squirrel);

        assertNotNull(node);
        assertEquals("Testy", node.getData().getName());
    }

    @Test
    public void testLeftRightAssignment() {
        Node<Squirrel> parent = new Node<>(new Squirrel("Parent"));
        Node<Squirrel> left = new Node<>(new Squirrel("Left"));
        Node<Squirrel> right = new Node<>(new Squirrel("Right"));

        parent.setLeft(left);
        parent.setRight(right);

        assertEquals("Left", parent.getLeft().getData().getName());
        assertEquals("Right", parent.getRight().getData().getName());
    }

    @Test
    public void testBinaryTreeRootAssignment() {
        Node<Squirrel> root = new Node<>(new Squirrel("Rooty"));
        BinaryTree<Squirrel> tree = new BinaryTree<>(root);

        assertEquals("Rooty", tree.getRoot().getData().getName());
    }

    @Test
    public void testTreeTraversalOrder() {
        Node<Squirrel> nodeA = new Node<>(new Squirrel("A"));
        Node<Squirrel> nodeB = new Node<>(new Squirrel("B"));
        Node<Squirrel> nodeC = new Node<>(new Squirrel("C"));

        nodeA.setLeft(nodeB);
        nodeA.setRight(nodeC);

        BinaryTree<Squirrel> tree = new BinaryTree<>(nodeA);

        StringBuilder output = new StringBuilder();
        capturePreOrder(tree.getRoot(), output);
        assertEquals("A B C ", output.toString());
    }

    private void capturePreOrder(Node<Squirrel> node, StringBuilder sb) {
        if (node != null) {
            sb.append(node.getData().getName()).append(" ");
            capturePreOrder(node.getLeft(), sb);
            capturePreOrder(node.getRight(), sb);
        }
    }
}
