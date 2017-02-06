package test.datastructures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

class Vertex {

	private String label;
	private ArrayList<Edge> neighbourhood;

	Vertex(String label) {
		

		this.label = label;
		this.neighbourhood = new ArrayList<Edge>();
	}
	
	public String getLabel(){
		return this.label;
	}
	
	public Edge getNeighbor(int index){
		return this.neighbourhood.get(index);
	}
	
	public int getNeighbourhoodCount(){
		return this.neighbourhood.size();
	}

	public boolean addNeighbour(Edge e) {
		// TODO Auto-generated method stub
		
		this.neighbourhood.add(e);
		return true;
	}

}

class Edge implements Comparable {
	int weight;
	Vertex one, two;

	Edge(Vertex one, Vertex two, int weight) {
		this.weight = weight;
		this.one = one;
		this.two = two;
	}

	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
}

public class Graph {

	boolean weighted;

	HashMap<String, Vertex> vertices;
	HashMap<Integer, Edge> edges;

	Graph() {
		this.vertices = new HashMap<String, Vertex>();
		this.edges = new HashMap<Integer, Edge>();
	}

	public boolean addVertex(Vertex vertex, boolean overwriteExistingEdge) {
		
		Vertex current= this.vertices.get(vertex.getLabel());
		
		if(current!=null )
		{
			if(!overwriteExistingEdge)
			{
				return false;
			}
			
			while(current.getNeighbourhoodCount()>0)
			{
				this.removeEdge(current.getNeighbor(0));
			}
			this.vertices.remove(current.getLabel());						
		}
		
		
		this.vertices.put(vertex.getLabel(), vertex);
		return true;

	}
	
public boolean addVertex(Vertex vertex) {
		
		Vertex current= this.vertices.get(vertex.getLabel());
		
		if(current==null )
		{
			this.vertices.put(vertex.getLabel(), vertex);
			return true;
		}
		
		return false;

	}

	public boolean addEdge(Vertex one, Vertex two)
	{
		Edge e= new Edge(one, two, 1);
		this.edges.put(e.hashCode(), e);
		
		one.addNeighbour(e);
		two.addNeighbour(e);
		
		return true;
	}

	private void removeEdge(Edge neighbor) {
		this.edges.remove(neighbor);
	}

	public static void main(String[] args) {
		
		Graph graph = new Graph();
		graph.addVertex( new Vertex("A"));
		graph.addVertex( new Vertex("B"));
		graph.addVertex( new Vertex("C"));
		graph.addVertex( new Vertex("D"));
		graph.addVertex( new Vertex("E"));
		
		System.out.println(graph.getVertex("A"));
		
		
		
		graph.addEdge(graph.getVertex("A"),graph.getVertex("B"));
		graph.addEdge(graph.getVertex("B"),graph.getVertex("C"));
		graph.addEdge(graph.getVertex("C"),graph.getVertex("D"));
		graph.addEdge(graph.getVertex("D"),graph.getVertex("E"));
		graph.addEdge(graph.getVertex("E"),graph.getVertex("A"));
		
		
		
		
		int i=0;
		while(( i=0) <graph.vertices.size())
		{
			
			
		}
			
		
		for(int i1=0;i1<graph.vertices.size();i1++)
		{
			
			
		}
		
		
		
		
	}
	
	
	
	
	public Vertex getVertex(String label){
		return this.vertices.get(label);
	}

}
