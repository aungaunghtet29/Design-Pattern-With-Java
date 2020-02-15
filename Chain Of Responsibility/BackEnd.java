package chain_Of_responsibility;

public class BackEnd implements HelpContext{
	private static final int BACKEND_CONSTANT = 3;
	@Override
	public void help(int num) {
		if(num == BACKEND_CONSTANT) {
			System.out.println("This is a Backend Layer");
		}else {
			System.out.println("....");
		}
	}
}
