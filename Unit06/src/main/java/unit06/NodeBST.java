package unit06;

public class NodeBST implements BinarySearchTree {
    private BinaryNode root;
    private int size;

    public NodeBST () {
        root = null;
        size = 0;
    }

    private void binaryInsert (BinaryNode node, int value) {
        if (value < node.getValue ()) {
            if (node.getLeft () == null) {
                node.setLeft (new BinaryNode (value));
            }
            else {
                binaryInsert (node.getLeft (), value);
            }
        }
        else {
            if (node.getRight () == null) {
                node.setRight (new BinaryNode (value));
            }
            else {
                binaryInsert (node.getRight (), value);
            }
        }
    }

    @Override
    public void insert(int value) {
        if (root == null) {
            root = new BinaryNode (value);
        }
        else {
            binaryInsert (root, value);
        }
        size++;
    }

    private boolean binarySearch (BinaryNode node, int target) {
        if (target == node.getValue ()) {
            return true;
        }
        else if (node.getLeft () != null && target < node.getValue ()) {
            return binarySearch (node.getLeft (), target);
        }
        else if (node.getRight () != null && target > node.getValue ()) {
            return binarySearch (node.getRight (), target);
        }
        else {
            return false;
        }
    }

    @Override
    public boolean search(int target) {
        if (root == null) {
            return false;
        }
        return binarySearch (root, target);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        if (root == null) {
            return "<empty>";
        }
        else {
            return root.infixTraversal ();
        }
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new NodeBST ();
        System.out.println (bst);

        bst.insert (4);
        bst.insert (2);
        bst.insert (6);
        bst.insert (1);
        bst.insert (3);
        bst.insert (5);
        bst.insert (7);

        System.out.println (bst);

        System.out.println (bst.search (4));
        System.out.println (bst.search (7));
        System.out.println (bst.search (0));
        System.out.println (bst.search (8));
    }
}
