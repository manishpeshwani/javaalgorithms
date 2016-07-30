package javaalgorithms;

import java.util.ArrayList;



public class Vertex {
	
	private String label;
	private ArrayList<Edge> neighbours;
	private boolean isVisited;
	
	public Vertex(String label){
		this.label = label;
		this.neighbours = new ArrayList<Edge>();
	}
	
	public void addNeighbour(Edge edge){
		if(neighbours.contains(edge)){
			return;
		}
		
		neighbours.add(edge);
	}
	
	public void removeNeighbour(Edge edge){
		neighbours.remove(edge);
	}
	
	public void removeNeighbour(int index){
		neighbours.remove(index);
	}
	
	public int countNeighbours(){
		return this.neighbours.size();
	}
	
	public Edge getNeighbour(int index){
		return neighbours.get(index);
	}
	
	public boolean containsNeighbour(Edge edge){
		return neighbours.contains(edge);
	}
	
	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public ArrayList<Edge> getNeighbours() {
		return neighbours;
	}

	public void setNeighbours(ArrayList<Edge> neighbours) {
		this.neighbours = neighbours;
	}
	
	

	public boolean isVisited() {
		return isVisited;
	}

	public void setVisited(boolean isVisited) {
		this.isVisited = isVisited;
	}

	@Override
	public String toString() {
		return this.getLabel();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((label == null) ? 0 : label.hashCode());
		result = prime * result + ((neighbours == null) ? 0 : neighbours.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vertex other = (Vertex) obj;
		if (label == null) {
			if (other.label != null)
				return false;
		} else if (!label.equals(other.label))
			return false;
		if (neighbours == null) {
			if (other.neighbours != null)
				return false;
		} else if (!neighbours.equals(other.neighbours))
			return false;
		return true;
	}
	
	

}
