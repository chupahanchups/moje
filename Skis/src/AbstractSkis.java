
public abstract class AbstractSkis {
	protected int turnRadius;
	
	public abstract void turn();
	
	public int getTurnRadius(){
		return this.turnRadius;
	}
	
	public void setTurnRadius(int tr){
		this.turnRadius = tr;
	}
	
}
