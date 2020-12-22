package Lab10;


public class Node<T extends Comparable<T>> {

    T data;
    Node<T> left;
    Node<T> right;

    public Node(T data) {
        this.data = data;
    }
    

}
