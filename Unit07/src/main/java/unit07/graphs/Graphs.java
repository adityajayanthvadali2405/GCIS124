package unit07.graphs;

public class Graphs {
    
    public static Graph <String> makeGraph () {
        Graph <String> graph = new AdjacencyGraph<> ();

        // Add verticies
        for (char ch = 'A'; ch <= 'K'; ch++) {
            graph.add (ch + "");
        }

        // Connect Verticies
        graph.connectUndirected ("A", "B");
        graph.connectDirected ("A", "C");

        graph.connectUndirected ("B", "E");

        graph.connectUndirected ("C", "D");
        graph.connectUndirected ("C", "E");
        graph.connectDirected ("C", "H");

        graph.connectDirected ("D", "B");
        graph.connectUndirected ("D", "F");

        graph.connectDirected ("E", "F");

        graph.connectUndirected ("F", "G");

        graph.connectUndirected ("I", "K");

        graph.connectUndirected ("K", "J");

        graph.connectDirected ("J", "I");

        return graph;
    }
}
