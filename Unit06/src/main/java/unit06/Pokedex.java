package unit06;

public class Pokedex {
    private final BinarySearchTree dex;

    public Pokedex () {
        dex = new NodeBST ();
    }

    public boolean containsPokemon (int number) {
        return dex.search (number);
    }

    public void addPokemon (int number) {
        if (!containsPokemon (number)) {
            dex.insert (number);
        }
    }

    @Override
    public String toString () {
        return dex.toString ();
    }

    public static void main(String[] args) {
        Pokedex dex = new Pokedex ();
        dex.addPokemon (129);
        dex.addPokemon (20);
        dex.addPokemon (132);
        dex.addPokemon (50);
        dex.addPokemon (19);
        dex.addPokemon (54);
        dex.addPokemon (52);
        dex.addPokemon (172);
        dex.addPokemon (133);
        dex.addPokemon (13);

        System.out.println (dex);

        System.out.println (dex.containsPokemon (129));
        System.out.println (dex.containsPokemon (13));
        System.out.println (dex.containsPokemon (151));
        System.out.println (dex.containsPokemon (900));
    }
}
