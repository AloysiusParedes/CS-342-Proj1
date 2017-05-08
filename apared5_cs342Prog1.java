/** Program 1: Mid Meeting
 * Author:  Aloysius Paredes
 * Code #:  879P
 * Date:    09/05/2016
 * Class:   UIC CS 342 Fall 2016
 * System:  OS X, IntelliJ IDE
 * Program Description:
 *      Imagine you are planning a family reunion, and you want to find the midpoint to minimize the average distance* each person must travel to get there.           (You might have the same issue if you were planning a business meeting or a conference.)  Write the code to answer this question, given files with city        distance information for a map as well as files for a list of people and their starting locations.
 * Files needed:    CityNames.txt
 *                  CityDistances.txt
 *                  Participants.txt
 */

import java.io.*;
import java.util.*;

public class apared5_cs342Prog1 {

    public static void main(String[] args) {
        //header
        System.out.println("Author Code Number:\t879P");
        System.out.println("Class:\t\t\t\tCS 342, Fall 2016");
        System.out.println("Program 1:\t\t\tMid Meeting");

        ArrayList<Vertex> adjList = new ArrayList<Vertex>();        //adjacency list of city-states with distances to other city-states
        ArrayList<Integer> participants = new ArrayList<Integer>();  //array list to hold participant city-locations

        //read cities, distances, and participants files and update adjacency list and participants list accordingly
        String file = "CityNames.txt";
        readCities(file, adjList);              //read cities file
        file = "CityDistances.txt";
        readDistances(file, adjList);           //read distances file
        file = "Participants.txt";
        readParticipants(file, participants);   //read participants file

        int numCities = adjList.size();         //variable to hold number of cities

        printAdjacencyList(adjList);            //print adjacency list

        float[][] shortestDistances = new float[numCities][];   //variable to hold shortest distances
        //run dijkstra's algorithm on all vertices
        for(int i = 0; i < numCities; i++)
            shortestDistances[i] = dijkstrasAlg(adjList, adjList.get(i).getID(), numCities);

        //print shortest distance of city 57 (Chicago, IL) to all other cities
        printShortestDistance(adjList, 57, numCities, shortestDistances);

        //find the city to travel to for all participants based on shortest average distance per city
        calculateAverageDistance(adjList, shortestDistances, participants, numCities);

    }//end main(...)

    public static void readCities(String fileName, ArrayList<Vertex> adjacencyList){
        try{
            FileReader line = new FileReader(fileName);
            BufferedReader br = new BufferedReader(line);

            //read the first line of the file
            String lineOfText = br.readLine();

            //read the next line
            lineOfText = br.readLine();

            int index = 0;
            //read until the end of the file
            while(lineOfText != null){
                //add city to adjacency list
                adjacencyList.add(new Vertex(lineOfText, index));

                //read the next line
                lineOfText = br.readLine();
                index++;
            }
        }
        catch(Exception e){
            System.out.println("\nERROR: CAN'T READ \"" + fileName + "\"\n");
        }

    }//end readCities(...)

    public static void readDistances(String fileName, ArrayList<Vertex> adjacencyList){
        try{
            FileReader line = new FileReader(fileName);
            BufferedReader br = new BufferedReader(line);

            //read the first line of the file
            String lineOfText = br.readLine();

            //read the next line
            lineOfText = br.readLine();

            //read until the end of the file
            while(lineOfText != null){
                //parse the string
                String[] parse = lineOfText.split(" ");
                int source = Integer.parseInt(parse[0]);
                int destination = Integer.parseInt(parse[1]);
                float distance = Float.parseFloat(parse[2]);


                //add distance from source to destination
                adjacencyList.get(source - 1).getEdges().add(new Edge(source, destination - 1, distance));
                //add distance from destination to source
                adjacencyList.get(destination - 1).getEdges().add(new Edge(destination, source - 1, distance));

                //read the next line
                lineOfText = br.readLine();
            }
        }
        catch(Exception e){
            System.out.println("\nERROR: CAN'T READ \"" + fileName + "\"\n");
        }

    }//end readDistances(...)

    public static void readParticipants(String fileName, ArrayList<Integer> participantsList){
        try{
            FileReader line = new FileReader(fileName);
            BufferedReader br = new BufferedReader(line);

            //read the first line of the file
            String lineOfText = br.readLine();

            //read the next line
            lineOfText = br.readLine();

            //read until the end of the file
            while(lineOfText != null){
                //parse the string
                String[] parse = lineOfText.split(" ");
                String name = parse[0];
                int city = Integer.parseInt(parse[1]);

                participantsList.add(city - 1);
                //read the next line
                lineOfText = br.readLine();
            }
        }
        catch(Exception e){
            System.out.println("\nERROR: CAN'T READ \"" + fileName + "\"\n");
        }

    }//end readParticipants(...)

    public static float[] dijkstrasAlg(ArrayList<Vertex> adjList, int start, int numVertices){
        ArrayList<Edge> temp;                               //temporary edges from a certain city
        boolean[] isInTree = new boolean[numVertices];      //array to hold visited values
        float[] distance = new float[numVertices];          //array to hold shortest distances
        int currentVertex;                                  //index of current vertex being checked
        int adjacentVertex;                                 //index of adjacent vertex to be checked
        float dist;                                         //value to hold distance
        float shortestNewDistance;                          //value to hold current shortest distance

        //initialize all values to not visited and to "infinite distance"
        for(int i = 0; i < numVertices; i++){
            isInTree[i] = false;
            distance[i] = Float.MAX_VALUE;
        }

        distance[start] = 0;        //set the distance from the city to itself as 0
        currentVertex = start;      //set the index of the current vertex to the start city

        //loop through all possible paths
        while(isInTree[currentVertex] == false){
            //mark the current city as visited
            isInTree[currentVertex] = true;

            //initialize the temporary edges as the edges of the current vertex
            temp = adjList.get(currentVertex).getEdges();

            int j = 0;      //variable to keep track of certain index
            //loop through all of the edges
            while(j < temp.size()){
                adjacentVertex = temp.get(j).getDestination();  //set the adjacent vertex to the destination of the edge
                dist = temp.get(j).getDistance();               //hold the distance/weight of the edge

                //check to see if the distance of the adjacent vertex is larger than the current vertex's distance
                if (distance[adjacentVertex] > (distance[currentVertex] + dist))
                    //store new lower-cost distance
                    distance[adjacentVertex] = distance[currentVertex] + dist;

                //look at the next edge
                j++;
            }

            //find next vertex to be processed. should be the closest one not already in tree.
            currentVertex = 0;
            shortestNewDistance = Float.MAX_VALUE;		//initialize to some large number
            //loop through each vertex in graph
            for (int i = 0; i < numVertices; i++) {
                if ((isInTree[i] == false) && (shortestNewDistance > distance[i])) {
                    //this ith vertex is not yet in tree and is closest so far
                    shortestNewDistance = distance[i];      //set new shortest distance
                    currentVertex = i;                      //set new closest vertex
                }
            }
        }

        //return the shortest distances from start city to all other cities
        return distance;

    }//end dijkstrasAlg(...)

    public static void printAdjacencyList(ArrayList<Vertex> adjList){
        System.out.println("**** PRINTING ADJACENCY LIST ****");
        int i = 0;
        for(Vertex vert : adjList){
            System.out.print(i + ". " + vert.getName() + " -> ");
            for(Edge edge : vert.getEdges()){
                System.out.print("(" + edge.getDestination() + ": " + edge.getDistance() + ") ");
            }
            i++;
            System.out.println();
        }

    }//end printAdjacencyList(...)

    public static void printShortestDistance(ArrayList<Vertex> adjList, int city, int numCities, float[][] shortestDistances){
        System.out.println("\n**** DISTANCE FROM " + adjList.get(city).getName() + " TO EACH OTHER CITY ****");
        for(int i = 0; i < numCities; i++)
            System.out.println(i + ". " + adjList.get(city).getName() + " to " + adjList.get(i).getName() + ": " + shortestDistances[city][i]);

    }//end printAdjacencyList(...)

    public static void calculateAverageDistance(ArrayList<Vertex> adjList, float[][] shortestDistances, ArrayList<Integer> participantsList, int numCities){
        System.out.println("\n**** FINDING CITY TO TRAVEL TO FOR ALL PARTICIPANTS ****");

        float numParticipants = participantsList.size();    //variable to hold number of participants
        float smallestAverage = Float.MAX_VALUE;            //variable to hold the smallest average distance for the city to travel to
        int smallestIndex = 0;                              //index of the city that has the smallest average distance
        float sum = 0;                                      //variable to hold the current sum
        float currentAverage = 0;                           //variable to hold the current average

        //loop through all cities
        for(int i = 0; i < numCities; i++){
            //loop through all the participants
            for(Integer part : participantsList){
                //add up the distances from each participant for some city 'i'
                sum += shortestDistances[part][i];
            }
            //calculate the total average distance to travel to city 'i' based on all participants
            currentAverage = sum / numParticipants;

            //check to see if we found a city with a smaller average distance travel for all participants
            if(currentAverage < smallestAverage){
                smallestAverage = currentAverage;
                smallestIndex = i;
            }

            //reset the sum
            sum = 0;
        }

        //print out the city that all participants to travel to and the average distance to travel
        System.out.println("City to travel to:\t\t" + adjList.get(smallestIndex).getName() + "\nTotal Average Distance:\t" + smallestAverage);

    }//end calculateAverageDistance

}//end apared5_cs342Prog1