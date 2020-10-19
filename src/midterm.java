import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class midterm{

	public static void main(String[] args)  throws FileNotFoundException { 
		
		    
		        int[] counts = new int[101];     // counters of test scores 0 - 100
		        
		        Scanner input = new Scanner(new File("MidtermScores.txt"));
		        while (input.hasNextInt()) {     // read file into counts array
		            int score = input.nextInt();
		            counts[score]++;             // if score is 87, then counts[87]++
		        }
		        
		        // print star histogram
		        for (int i = 0; i < counts.length; i++) {
		            if (counts[i] > 0) {
		                // counts[i] stores how many students scored i on the test,
		                // so print a star (counts[i]) times
		                System.out.print(i + ": ");
		                for (int j = 0; j < counts[i]; j++) {
		                    System.out.print("*");
		                }
		                System.out.println();
		            }
		        }
		    }
		
	}


