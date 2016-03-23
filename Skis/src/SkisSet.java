import java.util.*;

public class SkisSet {
	public SkisSet(){
		System.out.println("Creating SkisSet.");
	}
	
	private Set<Skis> skis = new HashSet<>();
	
	public void add(Skis ski){
		if(this.skis.add(ski))
			System.out.println(ski + " successfully added.");
		else
			System.out.println(ski + " already in SkisSet.");
	}
	
	public void remove(Skis ski){
		if(this.skis.remove(ski))
			System.out.println(ski + " successfully removed.");
		else
			System.out.println(ski + "not found.");
	}
	
	public void print(){
		System.out.println("SkisSet:");
		for(Skis ski : skis)
			System.out.println(ski.type);
	}
	
	public void clear(){
		this.skis.clear();
	}
	
	public static void main(String[] args){
		SkisSet skis = new SkisSet();
		Skis ski = new Skis();
		skis.add(ski);
		skis.add(new SLSkis());
		skis.add(new Skis());
		skis.remove(new GSSkis());
		skis.add(new GSSkis());
		skis.add(ski);
		skis.print();
		skis.clear();
		skis.print();
	}
}
