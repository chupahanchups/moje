
public class Skis extends AbstractSkis{
	protected String type = "Skis";
	
	@Override
	public void turn(){
		System.out.println("Turning.");
	}
	
	public void setType(String type){
		this.type = type;
		System.out.println(this.type);
	}
}
