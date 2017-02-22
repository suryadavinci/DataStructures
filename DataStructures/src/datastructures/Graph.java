package datastructures;

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

	public String getLabel() {
		return this.label;
	}

	public Edge getNeighbor(int index) {
		return this.neighbourhood.get(index);
	}

	public int getNeighbourhoodCount() {
		return this.neighbourhood.size();
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

		Vertex current = this.vertices.get(vertex.getLabel());

		if (current != null) {
			if (!overwriteExistingEdge) {
				return false;
			}

			while (current.getNeighbourhoodCount() > 0) {
				this.removeEdge(current.getNeighbor(0));
			}

		}
		return overwriteExistingEdge;

	}

	private void removeEdge(Edge neighbor) {
		// TODO Auto-generated method stub

		this.edges.remove(neighbor);

	}

	public static void main(String[] args) {

	}

	public Vertex get(String label) {
		return this.vertices.get(label);
	}

}
