package javaalgorithms;

import java.util.ArrayList;

public class GraphDemo {

	public static void main(String[] args) {
		
		Graph g = new Graph();
		
		Vertex a = new Vertex("A");
		Vertex b = new Vertex("B");
		Vertex c = new Vertex("C");
		Vertex d = new Vertex("D");
		Vertex e = new Vertex("E");
		ArrayList<Vertex> vertices = new ArrayList<Vertex>();
		vertices.add(a);
		vertices.add(b);
		vertices.add(c);
		vertices.add(d);
		vertices.add(e);
		
		g.addVertices(vertices);
		
		g.addEdge(a, b);
		g.addEdge(a, c);
		g.addEdge(b, d);
		g.addEdge(c, d);
		g.addEdge(d,e);
		
		for(Vertex v : g.getVertices().values()){
			System.out.println(v.getLabel());
			for(Edge neighbour: v.getNeighbours()){
				System.out.println(neighbour);
			}
		}
		System.out.println("depth first search result");
		g.dfSearch(a);
		
		System.out.println("bredth first search result");
		g.bfSearch(a);

	}

}
