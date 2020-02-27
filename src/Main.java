import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Arrays; // Import the Arrays class to sort array
import java.util.Scanner; // Import the Scanner class to read text files

public class Main {
	public static void main(String[] args) {
		try {	
			File folder = new File("cos_tardiness_SMALL/");
			String[] files = folder.list();
			Arrays.sort(files);
			Scanner sc;
			int aInt;

			for (String file : files)
			{
				System.out.println(file);

				sc = new Scanner(new File("cos_tardiness_SMALL/"+file));
				while (sc.hasNextInt()) {
					aInt = sc.nextInt();
					// System.out.println(aInt); 
				}

				sc.close();
			}
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}


	}
}
