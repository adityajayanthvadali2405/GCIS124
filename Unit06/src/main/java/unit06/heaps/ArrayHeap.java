package unit06.heaps;

import java.util.Arrays;

public class ArrayHeap implements Heap {
    private int[] array;
    private int size;

    public ArrayHeap () {
        array = new int [3];
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return size + ", " + Arrays.toString (array);
    }

    private void swap (int a, int b) {
        if (a != b) {
            int temp = array [a];
            array [a] = array [b];
            array [b] = temp;
        }
    }

    @Override
    public void add (int value) {
        if (size == array.length) {
            array = Arrays.copyOf (array, size * 2);
        }
        array [size] = value;

        int child = size;
        int parent = (child - 1) / 2;
        while (array [parent] > array [child]) {
            swap (parent, child);
            child = parent;
            parent = (child - 1) / 2;
        }

        size++;
    }

    @Override
    public int remove() {
        int value = array [0];
        swap (0, size - 1);
        array [size - 1] = 0;
        size--;

        int parent = 0;
        while (parent < size) {
            int left = 2 * parent + 1;
            int right = 2 * parent + 2;
            int smaller = left;

            if (right < size && array [right] < array [left]) {
                smaller = right;
            }

            if (smaller < size && array [parent] > array [smaller]) {
                swap (smaller, parent);
            }
            else {
                break;
            }
        }

        return value;
    }

    public static void main(String[] args) {
        Heap heap = new ArrayHeap ();
        System.out.println (heap);

        heap.add (35);
        heap.add (12);
        heap.add (85);
        heap.add (3);

        System.out.println (heap);

        System.out.println (heap.remove() + ": " + heap);
        System.out.println (heap.remove() + ": " + heap);
        System.out.println (heap.remove() + ": " + heap);
        System.out.println (heap.remove() + ": " + heap);
    }
}
