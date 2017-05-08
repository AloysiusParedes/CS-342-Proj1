/**
 * Class:       Edge
 * Function:    To be used with adjacency list; AKA "neighbors" or "connections" between other vertices (cities)
 */
public class Edge {
    //variables
    private int destination;
    private float distance;
    private int source;

    //constructor
    public Edge(int src, int id, float distance){
        this.source = src;
        this.destination = id;
        this.distance = distance;
    }

    //getters
    public int getDestination(){ return destination;}
    public float getDistance(){ return distance;}

}//end Edge Class