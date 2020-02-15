package bridgePattern;

public class Main {
	public static void main(String[] args) {
		WebframeWorkAbstraction obj = new Angular(new JPA());
		System.out.println(obj.doDataBaseOperation());
		System.out.println(obj.view());
	}
}
