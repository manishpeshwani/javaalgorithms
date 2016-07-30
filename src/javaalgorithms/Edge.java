package javaalgorithms;

public class Edge implements Comparable<Edge>{

	private int weight;
	private Vertex one;
	private Vertex two;
	
	public Edge(Vertex one, Vertex two){
		this.one = one;
		this.two = two;
		this.weight = 1;
	}
	
	public Edge(Vertex one, Vertex two, int weight){
		this.one = one;
		this.two = two;
		this.weight = weight;
	}


	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public Vertex getOne() {
		return one;
	}

	public void setOne(Vertex one) {
		this.one = one;
	}

	public Vertex getTwo() {
		return two;
	}

	public void setTwo(Vertex two) {
		this.two = two;
	}

	@Override
	public int compareTo(Edge other) {
		return this.weight - other.weight;
	}
	
	public Vertex getNeighbour(Vertex v){
		if(!(this.one.equals(v) || this.two.equals(v))){
			return null;
		}
		
		return (v.equals(one) ? two : one);
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null){
			return false;
		}
		
		if(!(obj instanceof Edge)){
			return false;
		}
		
		Edge other = (Edge) obj;
		
		return (this.one.equals(other.one) && this.two.equals(other.two));
	}

	@Override
	public int hashCode() {
		return  (this.getOne().getLabel() + this.getTwo().getLabel()).hashCode();
	}

	@Override
	public String toString() {
		return this.getOne().getLabel() + "-" + this.getTwo().getLabel();
	}
	
	
	
	
	
}
