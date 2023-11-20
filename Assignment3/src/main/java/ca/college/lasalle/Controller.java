package ca.college.lasalle;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;



/**
 * Ayrton Amaral - 202234145
 * Bruno Landeiro - 202234156
 * Carolina Ruiz - 202234358
 * */
public class Controller {
	static Scanner scanner = new Scanner(System.in);
    
	public static List<Product> products = DataProvider.initialProducts();
	
	public static void mainScreen() {
		Menu menu = new Menu();
		
		do {
			//Display the menu options
	        menu.displayMenu();

	        //Read selected option from the console
	        menu.selectOption();

	        switch(menu.getSelectedOption()) {
				case 1:
					addChocolateBar();
					break;

				case 2:
					// Add a sandwich
					break;

				case 3:
					addGas();
					break;

				case 4:
					addCoffee();
					break;

				case 5:
					displayAllChocolateBars();
					break;

				case 6:
					// Compare two chocolate bars and display which one is healthier
					System.out.println("\nAvailable Chocolate Bars:");
					for(Product product : products)	{
						if(product instanceof ChocolateBar){
							System.out.println(product);
						}
					}
					System.out.println("\nWhich sandwiches would you like to compare?");
					ChocolateBar chocolate1 = findChocolate("Enter the first chocolate id: ");
					ChocolateBar chocolate2 = findChocolate("Enter the second chocolate id: ");
					compareTwoChocolates(chocolate1, chocolate2);
					break;

				case 7:
					displayAllSandwiches();
					break;

				case 8:
					// Compare two sandwiches and display which one is cheaper
					displayAllSandwiches();
					System.out.println("Which sandwiches would you like to compare?");
					Sandwich sandwichOne = readSandwichFromConsole("Enter the first sandwich id: ");
					Sandwich sandwichTwo = readSandwichFromConsole("Enter the second sandwich id: ");
					compareTwoSandwiches(sandwichOne, sandwichTwo);
					break;

				case 9:
					//Sell an edible item
					break;

				case 10:
					//Sell gas
					break;

				case 11:
					// Sell coffee
					sellCoffee();
					break;

				case 12:
					displayGasInTanks();

					break;
			}//end of switch case
	        
		}while(menu.getSelectedOption()!=13);
	}//end of mainScreen method

	private static void sellCoffee() {
		displayAllCoffees();
		System.out.println("Which coffee would you like to buy?");
		Coffee coffee = null;
		do {
			int id = readIntegerFromConsole("Enter the id of the desired coffee: ");
			for(Product product : products){
				if(product instanceof Coffee && product.getId() == id){
					coffee = (Coffee) product;
				}
			}
			if(coffee != null){
				System.out.println("You have purchased the coffee: ");
				System.out.println(coffee);
			} else {
				System.out.println("Coffee id was not found.");
			}
		} while (coffee == null);
	}

	private static void addGas() {
		Scanner scanner = new Scanner(System.in);
		double amountOfGas = 0;
		do {
			System.out.println("Enter gas amount to add: ");
			try{
				amountOfGas = scanner.nextDouble();
				if(amountOfGas <= 0){
					System.out.println("Gas amount should be a number greater than 0.");
				}
			}
			catch (Exception e){
				System.out.println("Gas amount should be a numerical value.");
				scanner.next();
			}
		} while(amountOfGas <= 0);

		// Casting the product of type Gas and adding
		((Gas) products.get(0)).addGas(amountOfGas);
		System.out.println("The gas amount was added successfully.");
	}

	private static Sandwich readSandwichFromConsole(String displayMessage) {
		Sandwich sandwich = null;
		do {
			int id = readIntegerFromConsole(displayMessage);
			try {
				sandwich = findSandwichById(id);
			}catch (Exception exception) {
				System.out.println(exception.getMessage());
			}
		} while (sandwich == null);
		return sandwich;
	}

	private static int readIntegerFromConsole(String displayMessage)
	{
		Scanner scanner = new Scanner(System.in);
		Integer i = null;
		do {
			System.out.println(displayMessage);
			try {
				i = scanner.nextInt();
			} catch (Exception exception){
				System.out.println("The input should be an integer number.");
				scanner.next();
			}
		} while (i == null);
		return i;
	}
	private static void addChocolateBar() {

		String name;
		BigDecimal price = BigDecimal.ZERO;
		double numberOfCalories = 0; 
		LocalDate expiryDate = null;
		//Scanner scanner = new Scanner(System.in);
	    
	    
	    System.out.println("----------- ADD A CHOCOLATE BAR -------");
	    
	    //Get the name
	    System.out.println("What is the name of the new chocolate bar?:");
	    name = scanner.next();
	    
	    //Get the price
	    System.out.println("What is it's price?:");
	    try {
	    	price = scanner.nextBigDecimal();
	    }
		catch(Exception e1) {
			System.out.println("Please insert only a number");
			System.out.println(e1);
		}	
	    
	    //Get the number of calories
	    System.out.print("\nWhat is the number of calories?:");
	    try {
	    	numberOfCalories = scanner.nextDouble();
	    }
		catch(Exception e1) {
			System.out.println("Please insert only a number");
			System.out.println(e1);
		}
	    //get the expiry Date;
	    System.out.print("What is the expiry date? (yyyy-MM-dd): ");
	    try {
	    	expiryDate = LocalDate.parse(scanner.next());
	    }
		catch(Exception e1) {
			System.out.println("Please insert a valid date");
			System.out.println(e1);
		}
	    //add the new product
	    products.add(new ChocolateBar(name, price, numberOfCalories,expiryDate));
	    
	    
	}//End of addChocolateBar()

	private static void addCoffee() {
		//Coffee(String name, BigDecimal price, double numberOfCalories, LocalDate expiryDate) {
        
		String name;
		BigDecimal price = BigDecimal.ZERO;
		double numberOfCalories = 0; 
		LocalDate expiryDate = null;
		
		//Scanner scanner = new Scanner(System.in);
	    System.out.println("----------- ADD A COFFEE -------");
	    
	    //Get the name
	    System.out.println("What is the name of the new coffee?:");
	    name = scanner.next();
	    
	    //Get the price
	    System.out.println("What is it's price?:");
	    try {
	    	price = scanner.nextBigDecimal();
	    }
		catch(Exception e1) {
			System.out.println("Please insert only a number");
			System.out.println(e1);
		}	
	    
	    //Get the number of calories
	    System.out.print("\nWhat is the number of calories?:");
	    try {
	    	numberOfCalories = scanner.nextDouble();
	    }
		catch(Exception e1) {
			System.out.println("Please insert only a number");
			System.out.println(e1);
		}
	    //get the expiry Date;
	    System.out.print("What is the expiry date? (yyyy-MM-dd): ");
	    try {
	    	expiryDate = LocalDate.parse(scanner.next());
	    }
		catch(Exception e1) {
			System.out.println("Please insert a valid date");
			System.out.println(e1);
		}
	    //add the new product
	    products.add(new Coffee(name, price, numberOfCalories,expiryDate));
	    
	    
	}//End of addCoffee()

	private static void displayAllChocolateBars() {
		System.out.println("------- Chocolate Bars -------");
		//Using polymorphism to display all Chocolate Bars
		for(Product product : products) {
			if(product instanceof ChocolateBar){
				System.out.println(product.toString());
			}
		}
	}
	
	private static void displayAllSandwiches() {
		System.out.println("------ Sandwiches ------");
		//Using polymorphism to display all Sandwiches
		for(Product product : products) {
			if(product instanceof Sandwich){
				System.out.println(product.toString());
			}
		}
	}

	private static void displayAllCoffees() {
		System.out.println("------ Coffees ------");
		//Using polymorphism to display all Coffees
		for(Product product : products) {
			if(product instanceof Coffee){
				System.out.println(product.toString());
			}
		}
	}

	private static void compareTwoSandwiches(Sandwich sandwichOne, Sandwich sandwichTwo) {
		int result = sandwichOne.compareTo(sandwichTwo);
		if(result == 0) {
			System.out.println("Both sandwichs have the same price");
		}
		else if(result < 0) {
			System.out.println(String.format("%s \n is cheaper than \n%s", sandwichOne, sandwichTwo));
		}
		else if(result > 0) {
			System.out.println(String.format("%s \n is cheaper than \n%s", sandwichTwo, sandwichOne));
		}
	}

	private static Sandwich findSandwichById(int id) throws RuntimeException
	{
		for(Product product : products)
		{
			if(product instanceof Sandwich && product.getId().equals(id))
			{
				return (Sandwich) product;
			}
		}
		throw new RuntimeException("Sandwich not found.");
	}

	private static void displayGasInTanks() {
		double amountInTheTanks = ((Gas) products.get(0)).getAmountInTheTanks();
		System.out.println("The total amount of gas in the tanks is: " + amountInTheTanks + " liters.");
	}

	private static void compareTwoChocolates(ChocolateBar chocolate1, ChocolateBar chocolate2) {
		int result = chocolate1.getNumberOfCalories().compareTo(chocolate2.getNumberOfCalories());

		if(result == 0) {
			System.out.println("Both chocolates have the same number of calories.");
		}
		else if(result < 0) {
			System.out.println(String.format("%s \n is healthier than \n%s", chocolate1, chocolate2));
		}
		else if(result > 0) {
			System.out.println(String.format("%s \n is less healthier than \n%s", chocolate1, chocolate2));
		}
	}

	private static ChocolateBar findChocolate (String displayMessage) {
		ChocolateBar chocolate = null;
		do {
			int id = readIntegerFromConsole(displayMessage);
			for(Product product : products) {
				if(id == product.getId() && product instanceof ChocolateBar) {
					chocolate = ((ChocolateBar) product);
				}
			}
			if(chocolate == null) {
				System.out.println("Chocolate id was not found.");
			}
		} while (chocolate == null);
		return chocolate;
	}

}
