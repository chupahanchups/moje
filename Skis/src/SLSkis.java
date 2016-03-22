
public class SLSkis extends Skis {
	
	@Override
	public void turn(){
		this.turnRadius -= 5;
		System.out.println("SLSkis turn, turn radius:" + this.turnRadius);
	}
	
	public void stop(){
		this.setTurnRadius(12);
		System.out.println("SLSkis stop, turn radius:" + this.turnRadius);
	}
	
	public static void main(String[] args){
		SLSkis sl = new SLSkis();
		sl.setTurnRadius(12);
		sl.turn();
		sl.stop();
	}
}
