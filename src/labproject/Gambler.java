package labproject;

public class Gambler {
	public int chips1; 
	public int chips5 ;
    public int chips10 ;
    public int playerPot;
	
	public Gambler(int playerPot, int chips1, int chips5, int chips10){
		this.playerPot = playerPot;
		this.chips1 = chips1;
		this.chips5 = chips5;
		this.chips10 = chips10;
	}
		
	public void setplayerPot(int playerPot){
		this.playerPot = (playerPot < 0 ? 0 : playerPot);
	}
	
	public int getplayerPot(int playerPot){
		return playerPot;
	}
	
	public void setchips1(int chips1){
		this.chips1 = (chips1 < 0 ? 0 : chips1);		
	}
	
	public int getchips1(int chips1){
		return chips1;
	}
	
	public void setchips5(int chips5){
		this.chips5 = (chips5 < 0 ? 0 : chips5);
	}
	
	public int getchips5(int chips5){
		return chips5;
	}
	public void setchips10(int chips10){
		this.chips10 = (chips10 < 0? 0: chips10);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
