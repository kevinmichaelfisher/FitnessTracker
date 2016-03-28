package fitnesstracker.model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class IOHandler {
	
	/*
	 * Takes in an array of strings and writes it to a file, with each element getting a line
	 */
	public void writeToDocument(ArrayList<String> data, String path) {
		try {
			FileWriter fileWriter = new FileWriter(path, true);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

			for (int i=0; i<data.size(); i++) {
				bufferedWriter.write(data.get(i), 0, data.get(i).length());
				bufferedWriter.newLine();
			}
			
			bufferedWriter.close();
		}
		catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
	/*
	 * Reads a file line by line
	 * Each line gets it's own element in the array, and the array is returned at the end
	 */
	public ArrayList<String> readFromDocument(String path) {
		
		String line;
		ArrayList<String> returnArray = new ArrayList<String>();
		try {
			FileReader fileReader = new FileReader(path);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			while ((line = bufferedReader.readLine()) != null)
				returnArray.add(line);
			
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
