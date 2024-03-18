package unit05.mcf;

import java.util.Iterator;

public class NodeQueue <E> implements Queue <E> {
    private Node <E> front;
    private Node <E> back;
    private int size;

    public NodeQueue () {
        front = null;
        back = null;
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void enqueue (E value) {
        Node<E> newNode = new Node<> (value);
        if (back != null) {
            back.setNext (newNode);
        } 
        else {
            front = newNode;
        }
        back = newNode;

        size++;
    }

    @Override
    public E dequeue() {
        E value = front.getValue ();
        front = front.getNext ();
        if (front == null) {
            back = null;
        }
        size--;

        return value;
    }

    @Override
    public String toString() {
        return size + ", " + front;
    }

    @Override
    public Iterator<E> iterator() {
        System.out.println("NodeQueue Iterator");
        return new NodeIterator<> (front);
    }

    public static void main(String[] args) {
        Queue<String> queue = new NodeQueue <> ();
        System.out.println (queue);
        queue.enqueue ("A");
        System.out.println (queue);
        queue.enqueue ("B");
        System.out.println (queue);
        queue.enqueue ("C");
        System.out.println (queue);

        System.out.println (queue.dequeue () + ": " + queue);
        System.out.println (queue.dequeue () + ": " + queue);
        System.out.println (queue.dequeue () + ": " + queue);
    }
}
