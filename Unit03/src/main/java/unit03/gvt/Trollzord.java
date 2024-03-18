package unit03.gvt;

public class Trollzord extends Troll {
    private static final int MAX_HP = 64;
    private static final int REGEN = (int) (MAX_HP * 0.05);

    public Trollzord () {
        super ("Trollzord", MAX_HP, REGEN);
    }

    @Override
    public Attack attack () {
        return new Attack ("Flame War",
                            new int[] {25},
                            DamageType.MAGICAL);
    }

    @Override
    public void takeDamage (Attack attack) {
        double modifier = 1;
        if (attack.getDamageType() == DamageType.HOLY) {
            modifier = 1.25;
        }

        super.takeDamage (attack, modifier);
    }  
}
