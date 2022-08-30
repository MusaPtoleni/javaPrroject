import java.util.Scanner;

public class Restaurant {

	/*
	 * new Scanner variable so that i don't repeat the process of creating new
	 * scanner variable
	 */
	static Scanner input;

	// All the Attributes for restaurant class
	String name;
	String location;
	int phoneNum;
	int numOfMeal;
	static String listOfMeal;
	double mealPrice;
	String addONs;
	String driver;
	double total;
	String address;

	// Getter method to get all the value of the attributes
	public String getLocation() {
		return location;
	}

	public String getAddress() {
		return address;
	}
	// Setters and methods to set the restaurant attributes
	public String setAddress(String address) {
		return address;
	}

	public String setName() {
		input = new Scanner(System.in);
		System.out.println("Name of the Restaurant?");
		name = input.nextLine();
		return this.name;
	}

	public String setLocation() {
		input = new Scanner(System.in);
		System.out.println("The location of the Restaurant?");
		location = input.nextLine();
		return this.location;
	}

	public int setPhoneNum() {
		input = new Scanner(System.in);
		System.out.println("Contact number of the Resturant?");
		phoneNum = input.nextInt();
		return this.phoneNum;
	}

	public static String setListOfMeal() {
		// Asking user for a the number of meals they want
		input = new Scanner(System.in);
		System.out.println("How many of each meals are you ordering?");
		int length = input.nextInt();
		// creating an array then store the number of meals as the length of the array
		String[] meals = new String[length];
		// Selecting this attributes so that I can store the meals chosen by the user
		listOfMeal = "";

		for (int index = 0; index < length; index++) {
			System.out.println("Please enter the Meal" + (index + 1));
			meals[index] = input.next();
		}
		// Looping through the array of meals the selecting each item and store them in
		// the listOfMeal attributes
		for (int index = 0; index < length; index++) {
			listOfMeal = meals[index];
		}
		return listOfMeal;
	}
	// created a setter method to set the price of the foods given
	public double setMealPrice() {
		input = new Scanner(System.in);
		System.out.println("How many meals did you oder?");
		int length = input.nextInt();
		// Similar to the storing the list of meal i created an array to store the price
		// of the meal
		String[] meals = new String[length];

		mealPrice = 0;

		for (int index = 0; index < length; index++) {
			System.out.println("Please enter the Price of the meal num" + (index + 1));
			meals[index] = input.next();
		}
		// I looped through each price in the array and assigned each element to the
		// meal price attributes
		for (int index = 0; index < length; index++) {
			mealPrice = Double.parseDouble(meals[index]);
		}
		return this.mealPrice;
	}
	//Asking user for any special instruction regarding delivery
	public String setAddONs() {
		input = new Scanner(System.in);
		System.out.println("Any special instruction?");
		addONs = input.nextLine();
		return this.addONs;
	}

	// asking the user for the total amount of the meal
public double setTotal() {
		input = new Scanner(System.in);
		System.out.println("What is the total of your meals?");
		total = input.nextDouble();
		return total;
	}

	public int setNumOfMeal() {
		return this.numOfMeal;
	}
	// Method to get the driver in the same location as the restaurant
	public String setDriver(String location) {
		// declared an empty variable for the driver
		driver = "";
		// if statement to compare the restaurant location and the driver location
		if (location.equalsIgnoreCase("Cape Town")) {
			driver = "Miranda Metcalfe is the nearest to the restaurant and so he will be delivering your order to you at: \n";
		} else if (location.equalsIgnoreCase("Durban")) {
			driver = "Eugene Santana is the nearest to the restaurant and so he will be delivering your order to you at: \n";
		} else if (location.equalsIgnoreCase("Johannesburg")) {
			driver = "Spike Fenton is the nearest to the restaurant and so he will be delivering your order to you at: \n";
		} else if (location.equalsIgnoreCase("Potchefstroom")) {
			driver = "Jaidan Sadler is the nearest to the restaurant and so he will be delivering your order to you at: \n";
		} else if (location.equalsIgnoreCase("Springbok")) {
			driver = "Johan Hoffman is the nearest to the restaurant and so he will be delivering your order to you at: \n";
		} else if (location.equalsIgnoreCase("Witbank")) {
			driver = "Eshan Gibson is the nearest to the restaurant and so he will be delivering your order to you at: \n";
		} else if (location.equalsIgnoreCase("Bloemfontein")) {
			driver = "Kailan Snow is the nearest to the restaurant and so he will be delivering your order to you at: \n";
		} else {
			driver = "Sorry! Our drivers are too far away from you to be able to deliver to your location.";
		}
		return this.driver;
	}
	// toString method
	public String toString() {
		String output = "You have ordered the follow from " + " " + name + " " + "in" + " " + location + "\n :";
		output += listOfMeal + " " + mealPrice + "\n";
		output += "Special Instruction: " + addONs + "\n";
		output += "Total: " + " " + total + "\n";
		output += driver + "\n";
		output += address + "\n";
		output += "If you need to conact the restaurant, their number is is: " + phoneNum;
		return output + "n";
	}
}
