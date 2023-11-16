package ca.college.lasalle;
/**
 * Ayrton Amaral - 202234145
 * Bruno Landeiro - 202234156
 * Carolina Ruiz - 202234358
 * */
public class Controller {
	
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
	        	break;
	        case 6:
	        	//Compare two chocolate bars and display which one is healthier
	        	break;
	        case 7:
	        	//Display all sandwiches 
	        	break;
	        case 8:
	        	// Compare two sandwiches and display which one is cheaper 
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

}
