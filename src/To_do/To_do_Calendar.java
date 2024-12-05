package To_do;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


//This application allows the user to add a new To Do to the calendar, 
//view To Do's already added and exit the application. 
//The data is stored in a HashMap where the address is the key and the details are the value. 
//The user can communicate with the application from the console.

public class To_do_Calendar {
	private static Map<String, String> calendar = new HashMap<>();
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	boolean running = true;
	while(running) {
		System.out.println("Choose an option: ");
		System.out.println("1 - Add to To Do ");
		System.out.println("2 - View To Do  ");
		System.out.println("3 - Exit ");
		
		
		int choise = sc.nextInt();
		
		switch (choise) {
		case 1:
			addToDo();
			break;
		case 2 : 
			viewTodo();
			break;
		case 3:
			running = false;
			break;
		default:
			System.out.println("Wrong choice, please choose again.");
			}
		
	}
	System.out.println("Thank you for using the calendar! ");
	}
  
	private static void addToDo() {
		 Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter the new To Do address: ");
	        String title = scanner.nextLine();

	        System.out.println("Enter the To Do details: ");
	        String details = scanner.nextLine();

	        calendar.put(title, details);
	        System.out.println("Add to To Do: " + title);
		
	}
	private static void viewTodo() {
		if (calendar.isEmpty()) {
            System.out.println("There are no To Do's saved.");
        } else {
            System.out.println("List of saved To Do's: ");
            for (Map.Entry<String, String> entry : calendar.entrySet()) {
                System.out.println("Address: " + entry.getKey() + ", Details: " + entry.getValue());
	}

}
	}
}
