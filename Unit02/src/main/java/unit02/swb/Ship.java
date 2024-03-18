package unit02.swb;

public class Ship {
    private int hull;
    private int shields;
    private String name;
    private Weapon[] armaments;

    public Ship (String name, int hull, int shields, Weapon[] armaments) {
        this.name = name;
        this.hull = hull;
        this.shields = shields;
        this.armaments = armaments;
    }

    public Ship (String name, int hull) {
        this (name, hull, 0, new Weapon[0]);
    }

    public String getName () {
        return name;
    }

    public int getHull () {
        return hull;
    }

    public Weapon[] getArmaments () {
        return armaments;
    }

    @Override
    public String toString () {
        return name + ": shields " + shields + ", hull " + hull;
    }
}
