import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

public static void main(String[] args) throws IOException {
		// creating a new objects for customer and restaurant
		Customer customer = new Customer();
		Restaurant restaurant = new Restaurant();

		// creating an object of a Customer
		customer.setOrderNum();
		customer.setFullname();
		customer.setCellNum();
		customer.setEmail();
		customer.setLoction();
		String address = customer.setAddress();
		System.out.println(address);
		
		// Creating a new restaurant object
		restaurant.setAddress(address);
		restaurant.setName();
		restaurant.setLocation();
		String location = restaurant.getLocation();
		restaurant.setDriver(location);
		Restaurant.setListOfMeal();
		restaurant.setMealPrice();
		restaurant.setTotal();
		restaurant.setAddONs();
		restaurant.setPhoneNum();
		System.out.println(restaurant);
		
		// creating a new file
		try {
			File myFile = new File("invoice.txt");
			if (myFile.createNewFile()) {
				System.out.println("file created");
			} else {
				System.out.println("file already exist");
			}
		} catch (IOException e) {
			System.out.println("an error occured");
			e.printStackTrace();
		}
		// Writing to the new file I've created
		try {
			FileWriter file = new FileWriter("invoice.txt");
			file.write(customer.toString());
			file.write(restaurant.toString());
			file.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
