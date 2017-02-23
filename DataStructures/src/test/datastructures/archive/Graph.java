package test.datastructures.archive;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
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

	private boolean weighted;
	private boolean directed;

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
			this.vertices.remove(current.getLabel());
		}

		this.vertices.put(vertex.getLabel(), vertex);
		return true;

	}

	public boolean addVertex(Vertex vertex) {

		Vertex current = this.vertices.get(vertex.getLabel());

		if (current == null) {
			this.vertices.put(vertex.getLabel(), vertex);
			return true;
		}

		return false;

	}

	public boolean addEdge(Vertex one, Vertex two) {
		return addEdge(one, two, 1);
	}

	public boolean addEdge(Vertex one, Vertex two, int weight) {
		Edge e = new Edge(one, two, weight);
		this.edges.put(e.hashCode(), e);

		one.addNeighbour(e);
		two.addNeighbour(e);

		return true;
	}

	private void removeEdge(Edge neighbor) {
		this.edges.remove(neighbor);
	}

	public void addRandomVertices(int size) {

		for (int i = 0; i < size; i++)
			this.addVertex(new Vertex(" " + i));
	}

	public static void main(String[] args) {

		Graph graph = new Graph();

		graph.addVertex(new Vertex("Surya"));
		graph.addVertex(new Vertex("Pavithran"));
		graph.addVertex(new Vertex("Arun"));
		graph.addVertex(new Vertex("Priyanka"));

		// System.out.println(graph.getVertex("A"));

		graph.addEdge(graph.getVertex("Surya"), graph.getVertex("Pavithran"), 1);
		graph.addEdge(graph.getVertex("Pavithran"), graph.getVertex("Priyanka"), 2);
		graph.addEdge(graph.getVertex("Pavithran"), graph.getVertex("Arun"), 10);
		graph.addEdge(graph.getVertex("Surya"), graph.getVertex("Priyanka"), 3);
		graph.addEdge(graph.getVertex("Surya"), graph.getVertex("Arun"), 11);
		graph.addEdge(graph.getVertex("Priyanka"), graph.getVertex("Arun"), 12);

		graph.printGraph();

	}

	public void printGraph() {

		String format = "%-10s%s%n";

		int tempWeight = 0;
		Vertex tempVertex;
		Iterator i = this.vertices.entrySet().iterator();
		while (i.hasNext()) {
			Map.Entry pair = ((Map.Entry) i.next());
			// System.out.println(pair.getKey());

			// tempVertex= (Vertex) pair.getValue();
			tempVertex = this.getVertex((String) pair.getKey());

			for (int j = 0; j < tempVertex.getNeighbourhoodCount(); j++) {
				tempWeight = tempVertex.getNeighbor(j).weight;

				System.out.printf(format, tempVertex.getNeighbor(j).one.getLabel(),
						" ---" + tempWeight + "---->  " + tempVertex.getNeighbor(j).two.getLabel());

				// System.out.println(tempVertex.getNeighbor(j).one.getLabel()+
				// " ---" + tempWeight + "----> "+
				// tempVertex.getNeighbor(j).two.getLabel());
			}
			i.remove();
		}
	}

	public Vertex getVertex(String label) {
		return this.vertices.get(label);
	}

}
