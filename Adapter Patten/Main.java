package adueter_pattern;

public class Main {
	public static void main(String[] args) {
		ITV itv = new ModernTvAdapter(new OldTVAdaptee());
		itv.switchOn();
		itv.switchOff();
	}
}
