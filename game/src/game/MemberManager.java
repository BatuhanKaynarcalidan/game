package game;

public class MemberManager implements Authentication
{
	@Override
	public void approve(Member member) {
		System.out.println("Gercek Kisi : " + member.getFirstName());
	}
	
	public void register(Member member)
	{
		System.out.println(member.getFirstName()+" "+member.getLastName()+" Kayit Oldu" );
	}
	public void update(Member member)
	{
		System.out.println(member.getFirstName()+" "+member.getLastName()+" Bilgilerini Guncelledi" );

	}
	public void delete(Member member)
	{
		System.out.println(member.getFirstName()+" "+member.getLastName()+" Adli Kullanicinin Kaydi Silindi" );

	}

	

	
}
