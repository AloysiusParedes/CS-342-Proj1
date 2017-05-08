/**
 * Class:       Vertex
 * Function:    To represent an adjacency list of cities
 */

import java.util.ArrayList;

public class Vertex {
    //variables
    private String name;
    private int id;
    private ArrayList<Edge> edges;

    //constructor
    public Vertex(String str, int id){
        this.name = str;
        this.id = id;
        edges = new ArrayList<Edge>();
    }

    //getters
    public String getName(){ return name;}
    public int getID(){ return id;}
    public ArrayList<Edge> getEdges(){ return edges;}

}//end Vertex Class