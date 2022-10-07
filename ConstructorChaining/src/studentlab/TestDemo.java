
package studentlab;

/**
 * WELCOME TO LAB 3!
 * The essence of this lab is to work with constructors and to show overloaded constructor calls.
 * It demonstrates chaining overloaded constructors using "this" keyword.
 * It helps to consolidate understanding of the chaining rules learned in the theory class
 * This program also displays a good example of writing comments in your code using the Javadoc style.  
 */

/**
 * 
 * File name: [TestDemo.java ]
 * 
 * @author Mark Aguado<br>
 *         Course: CST8132 � OOP<br>
 * @version 1.0<br>
 * @since openjdk version "11.0.15" 2022-04-19 LTS
 */

public class TestDemo {

	/**
	 * This is the entry point for the application, it instantiates 4 EventSchedule
	 * objects to show-case the constructors. Anonymous objects are used and
	 * each one is only retained long enough to call method create report on
	 * each. No variable names were used, just new Constructor().methodCall().
	 * 
	 * @param args Command line arguments are not used by this program.
	 */

	/**
	 * YOUR TASK: COMPLETE THE CODE FOR THIS DRIVER CLASS NAMED TestDemo.
	 * Hint: See the SampleOutput file provided for the print statements required.
	 */

	/**
	 * The main method test demo, EventSchedule demonstrating the 4 cases of
	 * overloading a constructor
	 * 
	 * @param args Command line arguments are not used by this program.
	 */

	public static void main(String[] args) {

		/**
		 * YOUR CODE STARTS HERE
		 */
		// default constructor
		System.out.println("EventSchedule1");
		System.out.println(new EventSchedule().createReport());

		// second case constructor
		System.out.println("EventSchedule2");
		System.out.println(new EventSchedule(2023).createReport());

		// third case constructor
		System.out.println("EventSchedule3");
		System.out.println(new EventSchedule(2023, 12).createReport());

		// fourth case constructor
		System.out.println("EventSchedule4");
		System.out.println(new EventSchedule(2023, 11, 15).createReport());

		/**
		 * YOUR CODE ENDS HERE
		 */
	}

}
