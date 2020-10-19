import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import acm.program.ConsoleProgram;

public class Scores extends ConsoleProgram {



	public static void main(String[] args) {
	
		try {	
		File f = new File("MidtermScores.txt");
		FileInputStream fileStream = new FileInputStream(f);
		InputStreamReader input = new InputStreamReader(fileStream);
		BufferedReader bffer = new BufferedReader(input);
		String line = bffer.readLine();
	 int oness = 0;
	 int tenss = 0;
	 int twentiess = 0;
	 int thirtiess = 0;	
	 int fourtiess = 0;	
	 int fiftiess = 0;	
	 int sixtiess = 0;
	 int seventiess = 0;	
	 int eightiess = 0;
	 int nintiess = 0;	
	int hundreds = 0;
	
	while (true) { 
		if (line == null); break;
		int place = Integer.parseInt(line);
		
		if ((place >=0) && (place < 10)) {
			oness++; System.out.println ("0-9: " + oness);}
		else if ((place >= 10) && (place < 20)) { 
			tenss++; System.out.println ("10-19: " + tenss);}
		else if ((place >=20) && (place < 30)) {
			twentiess++; System.out.println ("20-29: " + twentiess);}
		else if ((place >=30) && (place <40)) {
			thirtiess++; System.out.println ("30-39: " + thirtiess);}
		else if ((place >= 40) && (place < 50)) {
			fourtiess++; System.out.println ("40-49: " + fourtiess);}
		else if ((place >=50) && (place <60)) {
			fiftiess++; System.out.println ("50-59: " + fiftiess);}
		else if ((place >=60) && (place < 70)) {
			sixtiess++; System.out.println ("60-69: " + sixtiess);}
		else if ((place >=70) && (place < 80)) {
			seventiess++; System.out.println ("70-79: " + seventiess);}
		else if ((place >=80) && (place < 90)) {
			eightiess++; System.out.println ("80-89: " + eightiess);}
		else if ((place >=90) && (place <100)) {
			nintiess++; System.out.println ("90-99: " + nintiess);}
		else if (place == 100)
			hundreds++; System.out.println ("100: " + hundreds);}
	bffer.close();
	}
		
		
	
	catch (FileNotFoundException e) { 
        System.out.println("File not found."); 
    } 
	catch (IOException e) { 
        System.out.println("incorrect type."); 
    }}}

	
			
		
		
		
		
	

		

	


