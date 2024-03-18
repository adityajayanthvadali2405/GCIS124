package unit03.gvt;

public abstract class Goat {
    private final String name;
    private final int maximumHP;
    private int currentHP;

    public Goat (String name, int maximumHP) {
        this.name = name;
        this.maximumHP = maximumHP;
        this.currentHP = maximumHP;
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

    public void heal (int amount) {
        currentHP += amount;
        if (currentHP > maximumHP) {
            currentHP = maximumHP;
        } 
    }

    public boolean isConscious () {
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
        return "A goat named " + name + " with " + currentHP + "/" + maximumHP +
                " hit points!";    
    }

    public static void main(String[] args) {
        Goat fighter1 = new Fighter ("Baaa");
        Goat fighter2 = new Mage ("Bleet");

        System.out.println (fighter1);
        System.out.println (fighter2);
    }       
}
