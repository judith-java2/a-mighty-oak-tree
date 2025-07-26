package org.example;

public class App {
    public static void main(String[] args) {
        Squirrel cheeks = new Squirrel("Cheeks");
        Node<Squirrel> nodeOne = new Node<>(cheeks);

        Squirrel squeaks = new Squirrel("Squeaks");
        Node<Squirrel> nodeTwo = new Node<>(squeaks);

        Squirrel fluffybutt = new Squirrel("Mr. Fluffy Butt");
        Node<Squirrel> nodeThree = new Node<>(fluffybutt);

        nodeOne.setLeft(nodeTwo);
        nodeOne.setRight(nodeThree);

        BinaryTree<Squirrel> squirrelTree = new BinaryTree<>(nodeOne);

        System.out.println("Left child: " + nodeOne.getLeft().getData().getName());
        System.out.println("Right child: " + nodeOne.getRight().getData().getName());

        System.out.println("\nPre-order Traversal:");
        squirrelTree.traversePreOrder(squirrelTree.getRoot());
    }
}
