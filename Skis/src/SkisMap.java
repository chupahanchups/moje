import java.util.*;

public class SkisMap {
	public SkisMap(){
		System.out.println("Creating SkisMap.");
	}
	
	private Map<String , Skis> skis = new HashMap<>();
	
	public void add(String key,Skis ski){
		this.skis.put(key , ski);
		System.out.println("Key - " + key + ", value - " + ski.type + " successfully added.");
	}
	
	public void remove(String key){
		Skis ski = this.skis.remove(key);
		if(ski != null)
			System.out.println("Key - " + key + ", value - " + ski + " successfully removed.");
		else
			System.out.println("Key - " + key + ", value - " + ski + " not found.");
	}
			
	public void print(){
		System.out.println("SkisMap:");
		Iterator<Map.Entry<String, Skis>> i = this.skis.entrySet().iterator();
		for(int k = 0; k<this.skis.size(); k++){
			Map.Entry<String, Skis> ski = i.next();
			System.out.println("Key - " + ski.getKey() + ", value - " + ski.getValue().type);
		}
	}
	
	public void clear(){
		this.skis.clear();
	}
	
	public static void main(String[] args){
		SkisMap skis = new SkisMap();
		Skis ski = new Skis();
		skis.add("ski1" , ski);
		skis.add("ski2" , new SLSkis());
		skis.add("ski3" , new Skis());
		skis.remove("ski3");
		skis.remove("ski5");
		skis.add("ski3" , new GSSkis());
		skis.add("ski4" , ski);
		skis.print();
		skis.clear();
		skis.print();
	}
}
