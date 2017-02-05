package datastructures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

class Vertex
{
	
	private String label;
	private ArrayList<Edge> neighbourhood;
	
	
	Vertex(String label)
	{
		
		
		this.label=label;
		this.neighbourhood=new ArrayList<Edge>();
	}
	
}


class Edge
{
	int weight;
	Vertex one,two;
	
	Edge(Vertex one , Vertex two, int weight)
	{
		this.weight=weight;
		this.one=one;
		this.two=two;
	}
}

public class Graph {

	boolean weighted;
	
	HashMap<String, Vertex> vertices;
	HashMap<Integer,Edge> edges;
	Graph()
	{
		this.vertices=new HashMap<String, Vertex>();
		this.edges=new HashMap<Integer, Edge>();
	}
	


	
	public static void main(String[] args) {
		LinkedList<Integer> l=new LinkedList();
		ArrayList<Integer>  al=new ArrayList<Integer> ();
		
		
		al.add(5);
		al.add(0,10);

		l.get(0);
		al.get(0);
		System.out.println(al.get(0)+" "+al.get(1));
		
	}
	
	
}
