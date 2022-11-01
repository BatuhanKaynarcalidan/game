package game;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) 
	{
		GameSales gameSales = new GameSales();
		gameSales.setGameName("Farmex");
		gameSales.setGamePrice(100);
		System.out.println(gameSales.getGameName()+" Adli Oyun "+gameSales.getGamePrice()+" TL");
		OfferManager offerManager = new OfferManager();
		GameSalesManager gameSalesManager = new GameSalesManager();
		gameSalesManager.gamebuy(new Member(0, "Batuhan", "Kaynarcalidan", LocalDate.parse("2003-01-03") , "1231231312321"));
		
		MemberManager memberManager = new GameMemberManager(new MemberCheckService() {
			
			@Override
			public boolean checkIfRealPerson(Member member) {
				// TODO Auto-generated method stub
				return false;
				
			}
		});
			
		memberManager.register(new Member(0, "Batuhan", "Kaynarcalidan", LocalDate.parse("2003-01-03") , "1231231312321"));	
		offerManager.offerLogIn(new Member(0, "Batuhan", "Kaynarcalidan", LocalDate.parse("2003-01-03") , "1231231312321") , gameSales);
		memberManager.approve(new Member(0, "Batuhan", "Kaynarcalidan", LocalDate.parse("2003-01-03") , "1231231312321"));	
		memberManager.update(new Member(0, "Batuhan", "Kaynarcalidan", LocalDate.parse("2003-01-03") , "1231231312321"));
		memberManager.approve(new Member(0, "Batuhan", "Kaynarcalidan", LocalDate.parse("2003-01-03") , "1231231312321"));	
		memberManager.delete(new Member(0, "Batuhan", "Kaynarcalidan", LocalDate.parse("2003-01-03") , "1231231312321"));

	}

}
