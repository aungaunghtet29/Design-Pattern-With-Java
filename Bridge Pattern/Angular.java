package bridgePattern;

public class Angular extends WebframeWorkAbstraction{

	public Angular(IPersistence ipersistence) {
		super(ipersistence);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String doDataBaseOperation() {
		// TODO Auto-generated method stub
		return new StringBuilder().append(ipersistence.create()).append("\n")
				.append(ipersistence.delete()).append("\n")
				.append(ipersistence.retrieve()).append("\n")
				.append(ipersistence.update()).toString();
	}

	@Override
	public String view() {
		// TODO Auto-generated method stub
		return "Angular view";
	}

}
