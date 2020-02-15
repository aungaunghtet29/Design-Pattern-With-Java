package bridgePattern;

public abstract class WebframeWorkAbstraction {
	protected IPersistence ipersistence;

	public WebframeWorkAbstraction(IPersistence ipersistence) {
		this.ipersistence = ipersistence;
	}

	// Ipersistence
	public abstract String doDataBaseOperation();

	// WebframeWork
	public abstract String view();

}
