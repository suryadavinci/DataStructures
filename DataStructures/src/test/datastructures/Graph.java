package test.datastructures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Edge {
	private Vertex one;
	private Vertex two;
	private int weight;

	Edge(Vertex one, Vertex two, int weight) {
		this.one = one;
		this.two = two;
		this.weight = weight;
	}
}

class Vertex {
	private String label;
	private ArrayList<Edge> neighbourhood;

	Vertex(String label) {
		this.label = label;
		neighbourhood = new ArrayList<Edge>();
	}

	public String getLabel() {
		return this.label;
	}

	public ArrayList<Edge> getNeighbour() {
		return this.neighbourhood;
	}

	public void addNeighbour(Edge e) {
		// TODO Auto-generated method stub

		if (this.neighbourhood.contains(e))
			return;
		this.neighbourhood.add(e);

	}

}

public class Graph {
	private String name;
	private HashMap<String, Vertex> vertices;
	private HashMap<Integer, Edge> edges;
	private boolean weighted;

	Graph(String name) {
		this.name = name;
		this.vertices = new HashMap<String, Vertex>();
		this.edges = new HashMap<Integer, Edge>();
	}

	public Map<String, Vertex> getVertices() {
		return this.vertices;
	}

	public void setWeighted(boolean weighted) {
		this.weighted = this.weighted == true ? true : weighted;
	}

	public void addVertex(Vertex vertex) {
		this.vertices.put(vertex.getLabel(), vertex);
	}

	public void addEdge(Vertex one, Vertex two, int weight) {
		if (!weighted)
			weight = 1;

		Edge e = new Edge(one, two, weight);

		one.addNeighbour(e);
		two.addNeighbour(e);

		this.edges.put(e.hashCode(), e);
	}

	public void addEdge(Vertex one, Vertex two) {
		addEdge(one, two, 1);
	}

	public static void main(String[] args) {

		Graph g = new Graph("SOUTH INDIA TOUR");
		g.setWeighted(true);

		Vertex pondy = new Vertex("Pondicherry");

		Vertex chennai = new Vertex("Chennai");

		Vertex bang = new Vertex("Bangaluru");

		Vertex thirupati = new Vertex("Thirupati");

		g.addVertex(pondy);
		g.addVertex(chennai);
		g.addVertex(bang);
		g.addVertex(thirupati);

		g.addEdge(pondy, chennai, 163);
		g.addEdge(pondy, bang, 268);
		g.addEdge(chennai, bang, 348);
		g.addEdge(chennai, thirupati, 133);
		g.addEdge(thirupati, bang, 251);

	}
}
