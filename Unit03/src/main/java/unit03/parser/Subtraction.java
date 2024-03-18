package unit03.parser;

public class Subtraction implements Expression {

    private final Expression left;
    private final Expression right;

    public Subtraction (Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public double evaluate () {
        return left.evaluate () - right.evaluate ();
    }

    public static void main(String[] args) {
        Expression con = new Constant (3);
        Expression inc = new Increment (con);
        Expression add = new Addition (con, inc);
        Expression sub = new Subtraction (add, inc);
        System.out.println (sub.evaluate ());
    }     
}
