package unit03.parser;

public class Decrement implements Expression {

    private final Expression exp;

    public Decrement (Expression exp) {
        this.exp = exp;
    }

    @Override
    public double evaluate () {
        return exp.evaluate () - 1;
    }

    public static void main(String[] args) {
        Expression con = new Constant (3);
        Expression inc = new Increment (con);
        Expression dec = new Decrement (inc);
        System.out.println (dec.evaluate ());
    }   
}
