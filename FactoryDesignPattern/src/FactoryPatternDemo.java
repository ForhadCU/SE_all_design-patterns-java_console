import java.io.PrintStream;

public class FactoryPatternDemo {

	private static final PrintStream OUT = System.out;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FacultyFactory ff = new FacultyFactory();
		FacultyMember fm = ff.getFacultyMember("Rofiq", "PhD");
		OUT.println("hello " + fm.getDesignation() + fm.getName());
		fm = ff.getFacultyMember("kamal", "MSc");
		OUT.println("hello " + fm.getDesignation() + fm.getName());

	}

}
