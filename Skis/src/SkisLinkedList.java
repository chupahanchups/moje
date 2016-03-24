import java.util.*;

public class SkisLinkedList {
	public SkisLinkedList(){
		System.out.println("Creating SkisLinkedList.");
	}
	
	private List<Skis> skis = new LinkedList<>();
	
	public void add(Skis ski){
		this.skis.add(ski);
		System.out.println(ski + " successfully added at the end.");
	}
	
	public void add(int i, Skis ski){
		if(i>=this.skis.size())
			this.add(ski);
		else{
			this.skis.add(i, ski);
			System.out.println(ski + " successfully added at " + i + " position.");
		}
	}
	
	public void remove(){
		this.skis.remove(this.skis.size()-1);
		System.out.println("Last element successfully removed.");
	}
	
	public void print(){
		System.out.println("SkisLinkedList:");
		for(int i = 0; i<this.skis.size(); i++)
			System.out.println(this.skis.get(i).type);
	}
	
	public static void main(String[] args){
		SkisLinkedList skis = new SkisLinkedList();
		skis.add(new Skis());
		skis.add(new SLSkis());
		skis.add(new Skis());
		skis.add(2 , new GSSkis());
		skis.print();
		skis.remove();
		skis.print();
	}
}
