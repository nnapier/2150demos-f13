import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class EmployeeTester
{

	public static Employee createEmployee(Scanner keyboard)
	{
		System.out.println( "Enter name: ");
		String name = keyboard.nextLine();
		
		System.out.println( "Enter title: ");
		String title = keyboard.nextLine();
		
		System.out.println( "Enter hourly rate: ");
		double rate = keyboard.nextDouble();
		
		System.out.println( "Enter hours worked: ");
		double hours = keyboard.nextDouble();
		
		System.out.println( "Enter part-time (1 for true, 0 for false): ");
		int partTime = keyboard.nextInt();
		boolean partTimeStatus = (partTime==1) ? true : false; 
		
		// consume extra newline character
		keyboard.nextLine();
		Employee worker = new Employee(name, title, rate, hours, partTimeStatus);
		return worker;
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Employee worker1 = new Employee("John", "Assistant Manager", 
										12.40, 30, true);
		Employee worker2 = new Employee("John", "Assistant Manager", 
										12.40, 30, true);
		
		Employee worker3 = new Employee("Me", "Some title", 
				10, 55, false);

		Employee worker4 = new Employee("You", "Some title", 
				15, 55, false);

		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add( worker1);
		employees.add( worker2);
		employees.add( worker3);
		employees.add( worker4);
		
		// Enter an employee
		/*
		Scanner keyboard = new Scanner(System.in);
		 
		Employee worker5 = createEmployee(keyboard);
		employees.add(worker5);
		
		Employee worker6 = createEmployee(keyboard);
		employees.add(worker6);
		*/
		System.out.println("Original: \n" + employees);
		
		Collections.reverse( employees );
		System.out.println("Reversed: \n" + employees);
		
		Collections.shuffle( employees );
		System.out.println("Shuffled: \n" + employees);
		
		// SOP whether two employees are equal
		System.out.println("Are workers 1 and 2 equal? " );
		System.out.println( worker1.equals(worker2));
		
		
		//Collections.sort(employees);
		//  NOTE: Cannot do this until we implement the Comparable interface
		
		
	}

}
