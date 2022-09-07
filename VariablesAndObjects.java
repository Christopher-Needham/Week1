/**
 * 
 */
package com.christopherneedham.week1;

/**
 * @author 17015
 *
 */
public class VariablesAndObjects {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create a variable to hold the quantity of available plane seats left on a flight
		int availableSeats = 8;
		//create a variable to hold the cost of groceries at checkout
		double groceriesCost = 10.99;


		//create a variable to hold a person's middle initial
		char middleInitial = 'C';


		//create a variable to hold true if it's hot outside and false if it's cold outside
		boolean isHot = true;

		//create a variable to hold a customer's first name
		String customerName = "Bob";

		//create a variable to hold a street address
		String streetAddress = "1209 Ashford Dr, Cheyenne WY 58582";

		//print all variables to the console
		System.out.println(streetAddress);
		System.out.println(customerName);
		System.out.println(isHot);
		System.out.println(middleInitial);
		System.out.println(groceriesCost);
		System.out.println(availableSeats);
		



		//a customer booked 2 plane seats, remove 2 seats from the available seats variable
		availableSeats = availableSeats - 2;
		System.out.println(availableSeats);
		
		

		//impulse candy bar purchase, add 2.15 to the grocery total
		groceriesCost = groceriesCost + 2.15;
		System.out.println(groceriesCost);


		//birth certificate was printed incorrectly, change the middle initial to something else
		middleInitial = 'B';
		System.out.println(middleInitial);

		//the season has changed, update the hot outside variable to be opposite of what it was
		isHot = false;
		System.out.println(isHot);

		//create a new variable called full name using the customer's first name, the middle initial, and a last name of your choice
		String fullName = customerName + " " + middleInitial + " " + "Thompson";


		//print a line to the console that introduces the customer and says they live at the address variable
		System.out.println("Hello,");
		System.out.println("This is " + fullName + ". He lives in the green house at " + streetAddress);


	}

}
