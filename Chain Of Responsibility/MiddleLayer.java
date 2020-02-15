package chain_Of_responsibility;

public class MiddleLayer implements HelpContext{
	private static final int MIDDLE_CONST = 2;
	private HelpContext helpContext;
	public MiddleLayer(HelpContext helpContext) {
		this.helpContext = helpContext;
		}
	@Override
	public void help(int num) {
		if(num == MIDDLE_CONST) {
			System.out.println("this is middle Layer");
		}else {
			helpContext.help(num);
		}
	}
}
