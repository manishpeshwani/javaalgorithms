package javaalgorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Queue;
import java.util.Stack;

public class Graph {
	
	private HashMap<String, Vertex> vertices;
	private HashMap<Integer, Edge> edges;
	
	public Graph(){
		vertices = new HashMap<String, Vertex>();
		edges    = new HashMap<Integer, Edge>();
	}
	
	
	
	public HashMap<String, Vertex> getVertices() {
		return vertices;
	}



	public void setVertices(HashMap<String, Vertex> vertices) {
		this.vertices = vertices;
	}



	public HashMap<Integer, Edge> getEdges() {
		return edges;
	}



	public void setEdges(HashMap<Integer, Edge> edges) {
		this.edges = edges;
	}



	public void addVertices(ArrayList<Vertex> vertices){
		for(Vertex v : vertices){
			this.vertices.put(v.getLabel(), v);
		}
	}
	
	public boolean addEdge(Vertex one, Vertex two){
		return this.addEdge(one, two, 1);
	}

	public boolean addEdge(Vertex one, Vertex two, int weight) {
		if(one.equals(two)){
			return false;
		}
		
		Edge edge = new Edge(one, two, weight);
		if(this.edges.containsKey(edge.hashCode())){
			return false;
		}
		
		if(one.containsNeighbour(edge) || two.containsNeighbour(edge)){
			return false;
		}
		
		this.edges.put(edge.hashCode(), edge);
		one.addNeighbour(edge);
		two.addNeighbour(edge);
		return true;
		
	}
	
	public boolean containsEdge(Edge edge){
		if(edge.getOne() == null || edge.getTwo() == null){
			return false;
		}
		
		return this.edges.containsKey(edge.hashCode());
	}
	
	public Edge removeEdge(Edge edge){
		edge.getOne().removeNeighbour(edge);
		edge.getTwo().removeNeighbour(edge);
		return this.edges.remove(edge.hashCode());
		
	}
	
	public boolean containsVertex(Vertex v){
		return this.vertices.containsKey(v.getLabel());
	}
	
	/**
	 * 
	 * @param root
	 */
	public void dfSearch(Vertex root){
		Stack<Vertex> stack = new Stack<Vertex>();
		stack.push(root);
		
		while(!stack.isEmpty()){
			Vertex node = stack.pop();
			if(!node.isVisited()){
				System.out.println(node.getLabel());
				node.setVisited(true);
			}
			
			for(Edge neighbour: node.getNeighbours()){
				Vertex neighbouringNode = neighbour.getNeighbour(node);
				if(!neighbouringNode.isVisited()){
					stack.push(neighbouringNode);
				}
			}
		}
		
		for(Vertex v:this.getVertices().values()){
			v.setVisited(false);
		}
	}
	
	public void bfSearch(Vertex root){
		Queue<Vertex> queue = new java.util.LinkedList<Vertex>();
		queue.offer(root);
		
		while(!queue.isEmpty()){
			Vertex node = queue.remove();
			if(!node.isVisited()){
				System.out.println(node.getLabel());
				node.setVisited(true);
			}
			
			for(Edge neighbour: node.getNeighbours()){
				Vertex neighbouringNode = neighbour.getNeighbour(node);
				if(!neighbouringNode.isVisited()){
					queue.offer(neighbouringNode);
				}
			}
		}
		
		for(Vertex v:this.getVertices().values()){
			v.setVisited(false);
		}
	}
	

}
