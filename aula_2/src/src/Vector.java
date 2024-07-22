package src;

class Node<E> {
    Node<E> next;
    E value;
    Node(E value) {
        this.value = value;
    }
}

public class Vector<E> {
    public int length = 0;
}
