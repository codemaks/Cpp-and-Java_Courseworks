
import java.util.ArrayList;
import java.util.Map;

/**
 * Class also with main method to execute processes
 *
 * Demonstrates how to do longer process names using an arraylist and also how
 * to modify it's environment and get access to the Process object
 */
public class Processy{
	public static void main(String[] args) {
		ArrayList<String> commands = new ArrayList();
		// System.out.println("Starting ls");
		// commands.add("ls");
		System.out.println("Starting firefox");
		commands.add("firefox");
		execute(commands);
	}

	public static void execute(ArrayList<String> command) {
		try{
			ProcessBuilder builder = new ProcessBuilder(command);
			Map<String, String> environ = builder.environment();
			Process p = builder.start();
		} catch (Exception e){
			e.printStackTrace();
		}
	}
}
