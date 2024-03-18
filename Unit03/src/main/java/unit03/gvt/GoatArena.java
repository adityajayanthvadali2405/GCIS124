package unit03.gvt;

public class GoatArena {

    public static void battle (Goat goat1, Goat goat2) {
        // Fight!
        while (goat1.isConscious () && goat2.isConscious ()) {
            goat1.takeDamage (goat2.attack ());
            goat2.takeDamage (goat1.attack ());

            System.out.println (goat1.getName() + " attacks with " + 
                                goat1.attack().getName());
            System.out.println (goat2.getName() + " attacks with " + 
                                goat2.attack().getName());

            System.out.println (goat1);
            System.out.println (goat2);
        }

        // Determine Winner
        if (!goat1.isConscious() && !goat2.isConscious ()) {
            System.out.println ("Draw :(");
        }
        else if (goat1.isConscious()) {
            System.out.println ("The winner is " + goat1);
        }
        else {
            System.out.println ("The winner is " + goat2);
        }
    }

    public static void main(String[] args) {
        Mage mage1 = new Mage ("Goatdolf");
        Mage mage2 = new Mage ("Baaminster");
        Fighter fighter1 = new Fighter ("Goatly");
        Fighter fighter2 = new Fighter ("Baaard");

        battle (mage1, fighter1);
        mage1.heal (1000);
        battle (mage1, mage2);
        fighter1.heal (1000);
        battle (fighter1, fighter2);
    }
}
