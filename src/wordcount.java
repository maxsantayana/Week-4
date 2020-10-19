import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import acm.graphics.*;

public class wordcount {

public static void main(String[] args) {
	try {
		File a = new File("Shakespeare.txt");
		FileInputStream fileStream = new FileInputStream(a);
		InputStreamReader input = new InputStreamReader(fileStream);
		BufferedReader bffer = new BufferedReader(input);
		String line = bffer.readLine();
		int wordCount = 0;
		int characterCount = 0;
		int lineCount = 0;
		
		while (true) {
		if (line == null) break;
		lineCount++;
		characterCount +=line.length();
		for (String x : line.split("( )|(')")) {
		wordCount++;
		}
		line = bffer.readLine();
		}
		System.out.println("Lines = " + lineCount 
		+ "\n" +"Words = " + wordCount + "\n"
		+ "Characters = " + characterCount+1);
	bffer.close();
	}catch (IOException ex) {
		System.out.println("bad file read");
	}
	}
}
