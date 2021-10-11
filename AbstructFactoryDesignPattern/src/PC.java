import java.io.PrintStream;

public class PC implements Computer {
	private static final PrintStream OUT = System.out;
	private String hdd;
	private String ram;
	private String cpu;

	public PC(String hdd, String ram, String cpu) {
		super();
		this.hdd = hdd;
		this.ram = ram;
		this.cpu = cpu;
	}

	@Override
	public void view() {
		// TODO Auto-generated method stub
		OUT.println("Call from PC");
		OUT.println("HDD " + hdd);
		OUT.println("RAM " + ram);
		OUT.println("CPU " + cpu);
	}

}
