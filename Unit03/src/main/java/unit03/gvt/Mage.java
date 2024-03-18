package unit03.gvt;

public class Mage extends Goat {
    private static final int MAX_HP = 120;

    public Mage (String name) {
        super (name, MAX_HP);
    }

    @Override
    public Attack attack () {
        return new Attack ("Magic Missiles",
                            new int[] {9, 9, 9, 9},
                            DamageType.MAGICAL);
    }

    @Override
    public void takeDamage (Attack attack) {
        double modifier = 1;
        if (attack.getDamageType() == DamageType.MAGICAL) {
            modifier = 0.75;
        }
        else if (attack.getDamageType() == DamageType.PHYSICAL) {
            modifier = 1.25;
        }
        super.takeDamage (attack, modifier);
    }

    @Override
    public String toString () {
        return "A mage named " + getName () + " with " + getCurrentHP () + "/" 
                + getMaximumHP () + " hit points!";    
    }

    public static void main(String[] args) {
        Goat mage1 = new Mage ("Goatdolf");
        Goat mage2 = new Mage ("Baaminster");

        System.out.println (mage1);
        System.out.println (mage2);

        mage1.takeDamage (mage2.attack ());
        mage2.takeDamage (mage1.attack ());

        System.out.println (mage1);
        System.out.println (mage2);
    }
}
