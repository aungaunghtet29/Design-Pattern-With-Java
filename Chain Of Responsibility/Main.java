package chain_Of_responsibility;

public class Main {
	public static void main(String[] args) {
		BackEnd backend = new BackEnd();
		MiddleLayer middle = new MiddleLayer(backend);
		FrontEnd front = new FrontEnd(middle);
		
		front.help(5);
	}
}
