
import java.util.*;

import acm.program.ConsoleProgram;

public class uniquenames extends ConsoleProgram {
	public void run() {

		ArrayList<String> list = new ArrayList<String>();
		while (true) {
			String name = readLine("Please enter a name: ");
			if (name.equals(" "))
				break;
			if (!list.contains(name)) {
				list.add(name);
			}
		}
		println("Unique name list contains:");
		printList(list);
		
	}

	private void printList(ArrayList list){
		for (int i = 0; i < list.size(); i++) {
			println(list.get(i));
	}
	}
	}