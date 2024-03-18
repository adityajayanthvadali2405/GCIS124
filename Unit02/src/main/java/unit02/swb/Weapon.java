package unit02.swb;

/**
 * 
 * @author Bruce Herring
 */
public class Weapon {
    /**
     * Name of the Weapon
     */
    private final String name;

    private final int damage;

    private final DamageType damageType;

    /**
     * Constructor for Weapon that initializes all attributes
     * @param name Name of the weapon
     * @param damage Amount of damage the weapon does
     * @param damageType Type of damage done by the weapon
     */
    public Weapon (String name, int damage, DamageType damageType) {
        this.name = name;
        this.damage = damage;
        this.damageType = damageType;
    }

    public String getName () {
        return name;
    } 

    public int getDamage () {
        return damage;
    }

    /**
     * Getter for the DamageType
     * @return Type of damage weapon does
     */
    public DamageType getDamageType () {
        /*
         * Multiline comment
         */
        return damageType; // Single line comment
    }

    @Override
    public String toString () {
        return name + ": damage " + damage + ", color " + damageType.getColor ();
    }

    @Override
    public boolean equals (Object o) {
        if (o instanceof Weapon) {
            Weapon other = (Weapon)o;
            return damage == other.damage && 
                   damageType.equals (other.damageType);
        }
        else {
            return false;
        }
    }
}
