package Collection4;

public class CheckVoteAge {

	public static void main(String[] args) throws CheckAgeException {
		int a=56;
		try {
			if(a>18) {
				throw new CheckAgeException("Eligible");
			}
			else {
				throw new CheckAgeException("Not Eligible");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
