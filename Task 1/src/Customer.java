import java.util.Scanner;

public class Customer {
	//scanner variable
	Scanner input;
		
	//Customers Attributes
	int orderNum;
	String fullName;
	String email;
	int cellNum;
	static String address;
	String location;
	
	//Setters for every attributes listed
	//Also made each setter have a scanner to to get an input from the user.
	public int setOrderNum() {
		input = new Scanner(System.in);
		System.out.println("Enter your oder number");
		orderNum = input.nextInt();
		return orderNum;	
	}
	
	public String setFullname() {
		input = new Scanner(System.in);
		System.out.println("Enter Your full names");
		fullName = input.nextLine();
		return fullName;
	}
	
	public String setEmail() {
		input = new Scanner(System.in);
		System.out.println("Enter your email");
		email = input.nextLine();
		return email;
	}
	
	public int setCellNum(){
		input = new Scanner(System.in);
		System.out.println("Enter your Phone number");
		cellNum = input.nextInt();
		return cellNum;
	}
	
	public String setAddress() {
		input = new Scanner(System.in);
		System.out.println("What's your Address?");
		address = input.nextLine();
		return address;
	}
	
	public String setLoction() {
		input = new Scanner(System.in);
		System.out.println("Where are you located?");
		location = input.nextLine();
		return location;
	}
	
	//Getter for the Address attribute
	public static String getAddress() {
		return address;
	}

	//toString method
	public String toString() {
		String output = "Order Number: " + orderNum + "\n";
		output += "Customer: " + fullName +"\n";
		output += "Email: " + email + "\n";
		output += "Phone Number: " + cellNum +"\n";
		output += "Address: " + address +"\n";
		output += "Location: " + location + "\n";
		return output + "\n";
	}
}
