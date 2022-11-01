package game;

public class GameMemberManager extends MemberManager
{
	private MemberCheckService _memberCheckService;
	public GameMemberManager(MemberCheckService memberCheckService)
	{
		_memberCheckService = memberCheckService;
	}
	
	public void approve(Member member)
	{
		if(_memberCheckService.checkIfRealPerson(member))
		{
			this.approve(member);
		}
		else
		{
			System.out.println("Gercek Kisi Degil");
		}
	}
}
