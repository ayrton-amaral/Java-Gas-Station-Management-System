package ca.college.lasalle;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

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
	        	//Add a chocolate bar 
	        	break;
	        case 2:
	        	// Add a sandwich
	        	break;
	        case 3:
	        	// Add gas 
	        	break;
	        case 4:
	        	// Add coffee 
	        	break;
	        case 5:
	        	//Display all chocolate bars
				displayAllChocolateBars();
	        	break;
	        case 6:
	        	//Compare two chocolate bars and display which one is healthier
	        	break;
	        case 7:
	        	//Display all sandwiches 
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
	        	//Sell gas 
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

	private static void displayAllChocolateBars() {
		System.out.println("Chocolate Bars:");
		//Using polymorphism to sisplay all Chocolate Bars
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
