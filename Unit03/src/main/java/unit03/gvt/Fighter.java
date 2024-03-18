package unit03.gvt;

public class Fighter extends Goat {
    private static final int MAX_HP = 150;

    public Fighter (String name) {
        super (name, MAX_HP);
    }

    @Override
    public Attack attack () {
        return new Attack ("Cleave",
                            new int[] {25},
                            DamageType.PHYSICAL);
    }

    @Override
    public void takeDamage (Attack attack) {
        double modifier = 1;
        if (attack.getDamageType() == DamageType.MAGICAL) {
            modifier = 1.25;
        }
        else if (attack.getDamageType() == DamageType.PHYSICAL) {
            modifier = 0.75;
        }

        super.takeDamage (attack, modifier);
    }

    @Override
    public String toString () {
        return "A fighter named " + getName () + " with " + getCurrentHP () + "/" + getMaximumHP () +
                " hit points!";    
    }

    public static void main(String[] args) {
        Goat fighter1 = new Fighter ("Goatly");
        Goat fighter2 = new Fighter ("Baaard");

        System.out.println (fighter1);
        System.out.println (fighter2);

        fighter1.takeDamage (fighter2.attack ());
        fighter2.takeDamage (fighter1.attack ());

        System.out.println (fighter1);
        System.out.println (fighter2);
    }    
}
