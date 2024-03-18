package unit02.swb;

import java.util.Arrays;

public class StarWarsBattle {
    private static final Weapon BLASTER = new Weapon ("Laser Cannon", 20, DamageType.NORMAL);
    private static final Ship XWING = new Ship ("X-Wing", 50, 100, 
                                                new Weapon[] {BLASTER, BLASTER, BLASTER, BLASTER});

    public static void main(String[] args) {
        
        Weapon rifle = new Weapon ("Laser Rifle", 20, DamageType.NORMAL);
        Weapon iCannon = new Weapon ("Ion Cannon", 2000, DamageType.ION);
        System.out.println (BLASTER);
        System.out.println (iCannon);
        System.out.println ((BLASTER == rifle) + " " + (BLASTER.equals (rifle)));
        System.out.println ((BLASTER == iCannon) + " " + (BLASTER.equals (iCannon)));

        System.out.println (XWING);
        for (int i = 0; i < XWING.getArmaments ().length; i++) {
            System.out.println ("Weapon Name: " + XWING.getArmaments ()[i].getName ());
        }

        Ship ship2 = new Ship ("Booring", 10);
        System.out.println (ship2);
        for (int i = 0; i < ship2.getArmaments ().length; i++) {
            System.out.println ("Weapon Name: " + ship2.getArmaments ()[i].getName ());
        }

        System.out.println (DamageType.HEAVY);
        System.out.println (DamageType.NORMAL);
        System.out.println (DamageType.ION);

        System.out.println (DamageType.valueOf ("HEAVY"));
        System.out.println (DamageType.valueOf ("NORMAL"));
        System.out.println (DamageType.valueOf ("ION"));

        DamageType[] values = DamageType.values ();
        System.out.println (Arrays.toString (values));
    }
}
