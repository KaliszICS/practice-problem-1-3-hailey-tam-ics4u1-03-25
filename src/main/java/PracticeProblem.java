import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static String readFile (String fileName){
		BufferedReader inputStream = null;
		
		try {
			inputStream = new BufferedReader(new FileReader(fileName));
			String line;
			String result = "";
			while ((line = inputStream.readLine()) != null){
				 result += line + "\n";
			}
			return result;
		}
		catch (IOException e){
			return "There was an IOException";
		}
		finally {
			try {
				if (inputStream != null){
				inputStream.close();
				}
			}
			catch (IOException e){
				return "There was an IOException";
			}
		}
	}
	
	public static String backwardsReadFile(String fileName){
		FileReader inputStream = null;
		
		try {
			inputStream = new FileReader(fileName);
			int c;
			String file ="";
			String reverse ="";
			while ((c = inputStream.read()) != -1){
				file += (char)c;
				}
				for (int i = file.length() - 1; i >=0; i--){
					reverse += file.charAt(i);
					}
			return reverse;
		}
		catch(IOException e){
			return "There was an IOException"; 
		}
		
		finally {
			try {
				if (inputStream != null){
					inputStream.close();
				}
			}
			catch (IOException e){
				return "There was an IOException";
			}
		}
	}
}
