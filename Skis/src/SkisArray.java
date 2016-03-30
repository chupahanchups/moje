

public class SkisArray {
	public SkisArray(int i){
		System.out.println("Creating SkisArray. Filling with objects Skis");
		this.size = i;
		this.skis = new Skis[this.size];
		for(int k = 0; k<this.size; k++){
			Skis ski = new Skis();
			ski.setType("skis");
			this.skis[k] = ski;
		}	
	}
	
	private int size;
	
	private Skis skis[];
	
	public void replace(int i , Skis ski){
		this.skis[i] = null;
		this.skis[i] = ski;
	}
	
	public void remove(int i){
		System.out.println("Removing " + this.skis[i].type);
		this.skis[i] = null;
	}
	
	public void print(){
		System.out.println("SkisArray:");
		for(int i = 0; i<this.size; i++)
			if(this.skis[i] != null)
				System.out.println(this.skis[i].type);
			else
				System.out.println("Null");
	}
	
	public static void main(String[] args){
		SkisArray skis = new SkisArray(5);
		skis.replace(1 , new GSSkis());
		skis.remove(2);
		skis.remove(4);
		skis.remove(0);
		skis.replace(3 , new GSSkis());
		skis.replace(0 , new SLSkis());
		skis.print();
	}
	
}
