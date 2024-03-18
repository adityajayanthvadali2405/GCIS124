package unit05.mcf;

public class Node <E> {
    private E value;
    private Node <E> next;

    public Node (E value, Node <E> next) {
        this.value = value;
        this.next = next;
    }

    public Node (E value) {
        this (value, null);
    }

    public Node<E> getNext() {
        return next;
    }

    public E getValue() {
        return value;
    }

    public void setNext (Node <E> next) {
        this.next = next;
    }

    public void setValue (E value) {
        this.value = value;
    }

    @Override
    public String toString () {
        return value + " -> " + next;
    }

    public static void main (String[] args) {
        Node <Integer> n1 = new Node<> (1);
        System.out.println (n1);
        Node<Integer> n2 = new Node<> (2, n1);
        System.out.println (n2);
        Node<Integer> n3 = new Node<> (3, n2);
        System.out.println (n3);
    }
}
