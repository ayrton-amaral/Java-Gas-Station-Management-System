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
	        	//Carolina: Add a chocolate bar 
	        	addChocolateBar();
	        	break;
	        case 2:
	        	// Add a sandwich
	        	break;
	        case 3:
	        	// Add gas 
	        	break;
	        case 4:
	        	// Carolina: Add coffee 
	        	break;
	        case 5:
	        	//Display all chocolate bars
				displayAllChocolateBars();
	        	break;
	        case 6:
	        	//Compare two chocolate bars and display which one is healthier
	        	break;
	        case 7:
	        	//Carolina: Display all sandwiches 
	        	break;
	        case 8:
	        	// Compare two sandwiches and display which one is cheaper
				Sandwich one = new Sandwich("One", new BigDecimal(10), 100, LocalDate.now(), SandwichSize.LARGE, SandwichMainIgredient.CHICKEN);
				Sandwich two = new Sandwich("Two", new BigDecimal(15), 100, LocalDate.now(), SandwichSize.LARGE, SandwichMainIgredient.MEAT);
				compareTwoSandwiches(one, two);
				break;
	        case 9:
	        	//Sell an edible item 
	        	break;
	        case 10:
	        	//Carolina: Sell gas 
	        	break;
	        case 11:
	        	// Sell coffee 
	        	break;
	        case 12:
	        	// Display how much gas do we have in tanks 
	        	break;
	        }//end of switch case
	        
		}while(menu.getSelectedOption()!=13);
    	
        
	}//end of mainScreen method

	private static void addChocolateBar() {

		String name;
		BigDecimal price = BigDecimal.ZERO;
		double numberOfCalories = 0; 
		LocalDate expiryDate = null;
		Scanner scanner = new Scanner(System.in);
	    
	    
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
	    //LocalDate expiryDate;
	    System.out.print("What is the expiry date? (yyyy-MM-dd): ");
	    try {
	    	expiryDate = LocalDate.parse(scanner.next());
	    }
		catch(Exception e1) {
			System.out.println("Please insert a valid date");
			System.out.println(e1);
		}
	    products.add(new ChocolateBar(name, price, numberOfCalories,expiryDate));
	    
	    
	}//End of addChocolateBar()
	
	private static void displayAllChocolateBars() {
		System.out.println("Chocolate Bars:");
		//Using polymorphism to display all Chocolate Bars
		for(Product product : products) {
			if(product instanceof ChocolateBar){
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
			System.out.println(String.format("%s \n is cheaper then \n%s", sandwichOne, sandwichTwo));
		}
		else if(result > 0) {
			System.out.println(String.format("%s is cheaper then \n%s", sandwichTwo, sandwichOne));
		}
	}
}
