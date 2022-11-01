package game;

public class GameSales 
{
	private int gamePrice;
	private String gameName;
	public GameSales() {
	
	}
	public GameSales(int gamePrice, String gameName) {
		
		this.gamePrice = gamePrice;
		this.gameName = gameName;
	}
	public int getGamePrice() {
		return gamePrice;
	}
	public void setGamePrice(int gamePrice) {
		this.gamePrice = gamePrice;
	}
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
}
