package fitnesstracker.logic;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class IOHandler {
	
	public void writeToDocument(ArrayList<String> data, String path) {
		
	}
	
	public ArrayList<String> readFromDocument(String path) {
		
		String line;
		ArrayList<String> returnArray = new ArrayList<String>();
		try {
			FileReader fileReader = new FileReader(path);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			while ((line = bufferedReader.readLine()) != null) {
				returnArray.add(line);
			}
			bufferedReader.close();
		}
		catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		return returnArray;
	}
}
