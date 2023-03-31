package Warehouse;

public class Item implements Comparable<Item>{
	public String name;
	public int weight;

	public Item() {
		
	}
	
    public Item(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}


	@Override
    public int compareTo(Item o) {
        return Integer.compare(this.weight, o.weight);
    }
}
