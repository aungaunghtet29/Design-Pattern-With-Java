package adueter_pattern;

public class ModernTvAdapter implements ITV {
	private OldTVAdaptee oldTVAdaptee;

	public ModernTvAdapter(OldTVAdaptee oldTVAdaptee) {
		this.oldTVAdaptee = oldTVAdaptee;
	}

	@Override
	public void switchOff() {
		oldTVAdaptee.turnLeft();
	}

	@Override
	public void switchOn() {
		oldTVAdaptee.turnRight();
	}
}
