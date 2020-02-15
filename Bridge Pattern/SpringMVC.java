package bridgePattern;

public class SpringMVC extends WebframeWorkAbstraction {

	public SpringMVC(IPersistence ipersistence) {
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
		return "Spring MVC view";
	}

}
