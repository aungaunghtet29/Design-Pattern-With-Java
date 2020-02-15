package chain_Of_responsibility;

public class FrontEnd implements HelpContext {
	private static final int FRONTEND_CONST = 1;
	private HelpContext helpContext;

	public FrontEnd(HelpContext helpContext) {
		this.helpContext = helpContext;
	}

	@Override
	public void help(int num) {
		if (num == FRONTEND_CONST) {
			System.out.println("this is Front End layer");
		} else {
			helpContext.help(num);
		}
	}
}
