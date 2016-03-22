
public class Skis extends AbstractSkis{
	protected String type;
	
	@Override
	public void turn(){
		System.out.println("Turning.");
	}
	
	public String getType(){
		return this.type;
	}
	
	public void setType(String type){
		this.type = type;
	}
}
