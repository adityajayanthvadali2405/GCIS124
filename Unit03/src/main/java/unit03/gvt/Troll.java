package unit03.gvt;

public abstract class Troll {
    private final String name;
    private final int maximumHP;
    private int currentHP;
    private int regenerate;

    public Troll (String name, int maximumHP, int regenerate) {
        this.name = name;
        this.maximumHP = maximumHP;
        this.currentHP = maximumHP;
        this.regenerate = regenerate;
    }

    public String getName () {
        return name;
    }

    public int getCurrentHP() {
        return currentHP;
    }

    public int getMaximumHP() {
        return maximumHP;
    }

    public void regenerate () {
        currentHP += regenerate;
        if (currentHP > maximumHP) {
            currentHP = maximumHP;
        } 
    }

    public boolean isVanquished () {
        return currentHP > 0;
    }

    public abstract Attack attack ();

    public abstract void takeDamage (Attack attack);

    protected void takeDamage (Attack attack, double modifier) {
        int damage = 0;
        for (int i = 0; i < attack.getHits ().length; i++) {
            damage += attack.getHits ()[i];
        }

        currentHP -= damage * modifier;
        if (currentHP < 0) {
            currentHP = 0;
        }
    }

    @Override
    public String toString () {
        return "A troll named " + name + " with " + currentHP + "/" + maximumHP +
                " hit points!";    
    }    
}
