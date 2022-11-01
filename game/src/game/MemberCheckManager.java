package game;

public class MemberCheckManager implements MemberCheckService{

	@Override
	public boolean checkIfRealPerson(Member member) {
		
		return true;
	}

}
