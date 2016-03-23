
public class GSSkis extends Skis implements Stability{
	public GSSkis(){
		this.type = "GS Skis";
	}
	
	@Override
	public void goFast(){
		this.setTurnRadius(20);
		System.out.println("GSSkis go fast, turn radius:" + this.turnRadius);
	}
	
	@Override
	public void turn(){
		this.turnRadius -= 2;
		System.out.println("GSSkis turn, turn radius:" + this.turnRadius);
	}
	
	public static void main(String[] args){
		GSSkis gs = new GSSkis();
		gs.setType("Giant Slalom Skis");
		gs.setTurnRadius(20);
		gs.turn();
		gs.goFast();
	}

}
