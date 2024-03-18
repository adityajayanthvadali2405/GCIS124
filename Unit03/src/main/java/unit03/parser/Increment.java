package unit03.parser;

public class Increment implements Expression {

    private final Expression exp;

    public Increment (Expression exp) {
        this.exp = exp;
    }

    @Override
    public double evaluate () {
        return exp.evaluate () + 1;
    }

    public static void main(String[] args) {
        Expression con = new Constant (3);
        Expression inc = new Increment (con);
        System.out.println (inc.evaluate ());
    }    
}
