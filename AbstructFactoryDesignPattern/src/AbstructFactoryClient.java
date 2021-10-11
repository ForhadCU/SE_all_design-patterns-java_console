
public class AbstructFactoryClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactoryProducer cf = new FactoryProducer();
		Computer pc = cf.getComputer(new PCFactory());
		Computer server = cf.getComputer(new ServerFactory());
		Computer laptop = cf.getComputer(new LaptopFactory());

		pc.view();
		server.view();
		laptop.view();

	}

}
