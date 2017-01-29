import java.io.*;

/**
 * Class with main method to do the following on a 'LINUX' computer
 * 1) open a new file called output.txt
 * 2) Start a linux process "ps -aux"
 * 3) read this process's input stream line by line.
 * 4) write the process's input stream to the file output.txt line by line
 * 5) wait for process to finish, and close file
 */
public class RunProcess {
	public static void main(String[] args) {

		try{
			File file = new File("output.txt");
			BufferedWriter output = new BufferedWriter(new FileWriter(file));
			ProcessBuilder execute = new ProcessBuilder("ps", "-aux");
			Process ps = execute.start();

			BufferedReader br = new BufferedReader(new InputStreamReader(ps.getInputStream()));
			String info = br.readLine();

			while (info != null){
				output.write(info + "\n");
				info = br.readLine();
			}

			ps.waitFor();
			output.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("File written");

	}
}
