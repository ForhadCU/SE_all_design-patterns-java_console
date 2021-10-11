
public class FactoryProducer {

	public Computer getComputer(ComputerAbstructFactory caf) {
		return caf.createComputer();
	}

}
