package unit06;

public class BinaryNode {
    private int value;
    private BinaryNode left;
    private BinaryNode right;

    public BinaryNode (int value, BinaryNode left, BinaryNode right) {
        this.left = left;
        this.right = right;
        this.value = value;
    }

    public BinaryNode (int value) {
        this (value, null, null);
    }

    public BinaryNode getLeft() {
        return left;
    }

    public BinaryNode getRight() {
        return right;
    }

    public int getValue() {
        return value;
    }

    public void setLeft(BinaryNode left) {
        this.left = left;
    }

    public void setRight(BinaryNode right) {
        this.right = right;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "BinaryNode{value=" + value + ", left=" + left + ", right=" + right +"}";
    }

    public String infixTraversal () {
        String traversal = "";
        
        if (left != null) {
            traversal += left.infixTraversal ();
        }
        traversal += value + " ";
        if (right != null) {
            traversal += right.infixTraversal ();
        }

        return traversal;
    }

    public boolean search (int target) {
        if (value == target) {
            return true;
        }
        else if (left != null && left.search (target)) {
            return true;
        }
        else if (right != null && right.search (target)) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main (String[] args) {
        BinaryNode nine = new BinaryNode (9);
        BinaryNode four = new BinaryNode (4);
        BinaryNode one = new BinaryNode (1);
        BinaryNode six = new BinaryNode (6);
        BinaryNode three = new BinaryNode (3, nine, four);
        BinaryNode seven = new BinaryNode (7, one, six);
        BinaryNode two = new BinaryNode (2, three, seven);
        
        System.out.println (two);
        System.out.println (two.infixTraversal());

        System.out.println (two.search (2));
        System.out.println (two.search (9));
        System.out.println (two.search (1));
        System.out.println (two.search (8));
    }
}
