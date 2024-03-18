package unit03.parser;

public class Constant implements Expression {
    
    private final double value;

    public Constant (double value) {
        this.value = value;
    }

    @Override
    public double evaluate () {
        return value;
    }

    public static void main(String[] args) {
        Expression con = new Constant (3);
        System.out.println (con.evaluate ());
    }
}
