package purpleBox;

import java.util.ArrayList;
import java.util.Scanner;

public class PurpleBoxTestMain {

	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//variables
		int userInput;
		ArrayList<Product> allProducts = new ArrayList<Product>();
		ArrayList<Product> cart = new ArrayList<Product>();
		
		//call printMainMenu() method
		printMainMenu();
		
		System.out.print("\nMake selection: ");
		userInput =  console.nextInt();
		
		switch(userInput) {
			case 1:
				userInput = -1;   //reset userInput
				ArrayList<Product> allMovies = new ArrayList<Product>();
				allMovies = PurpleBox.viewAllMovies(allProducts);
				
				printMovieMenu();
				
				System.out.print("\nMake selection, 1-6: ");
				userInput =  console.nextInt();
				
				switch(userInput) {   //movie menu cases
					case 1:   //view all movies
						userInput = -1;
						makeSelectionMenu(allMovies, cart);
						break;
					case 2:   //search by name
						userInput = -1;
						break;
					case 3:   //search by genre
						userInput = -1;
						String genre;
						ArrayList<Product> listByGenre = new ArrayList<Product>();
						
						System.out.println("Which genre are you looking for?\n"
								+ "  1 -- Action"
								+ "  2 -- Comedy\n"
								+ "  3 -- Documentary\n"
								+ "  4 -- Drama\n"
								+ "  5 -- Family\n"
								+ "  6 -- Horror\n"
								+ "  7 -- Romance\n"
								+ "  8 -- Sci-Fi\n");
						System.out.print("Choose a number 1-8: ");
						userInput = console.nextInt();
						
						switch(userInput) {
							case 1:
								genre = "Action";
								break;
							case 2:
								genre = "Comedy";
								break;
							case 3:
								genre = "Documentary";
								break;
							case 4:
								genre = "Drama";
								break;
							case 5:
								genre = "Family";
								break;
							case 6:
								genre = "Horror";
								break;
							case 7:
								genre = "Romance";
								break;
							case 8:
								genre = "Sci-Fi";
								break;
						}
						userInput = -1;
						
						//call PurpleBox's searchByGenre() method
						listByGenre = PurpleBox.searchByGenre(allMovies, genre);
						
						makeSelectionMenu(listByGenre, cart);
						
						break;
					case 4:   //search by disc type
						userInput = -1;
						String format;
						ArrayList<Product> listByFormat = new ArrayList<Product>();
						
						System.out.println("Which disc format are you looking for?\n"
								+ "  1 -- DVD\n"
								+ "  2 -- Blu-Ray\n");
						System.out.print("Choose a number 1-2: ");
						int inputM = console.nextInt();
						
						switch(inputM) {
							case 1:
								format = "DVD";
								break;
							case 2:
								format = "Blu-Ray";
								break;
						}
						userInput = -1;
						
						//call PurpleBox's searchByGenre() method
						listByFormat = PurpleBox.searchByFormat(allMovies, format);
						
						makeSelectionMenu(listByFormat, cart);
						
						break;
					case 5:   //search by release date
						userInput = -1;
						
						break;
					case 6:   //search by meta score
						userInput = -1;
						
						break;
					
				} //end movieMenu switch
				
			case 2:
				userInput = -1;   //reset userInput
				ArrayList<Product> allGames = new ArrayList<Product>();
				allGames = PurpleBox.viewAllGames(allProducts);
				
				printGameMenu();
				
				System.out.print("\nMake selection, 1-6: ");
				userInput =  console.nextInt();
				
				switch(userInput) {   //game menu cases
					case 1:   //view all games
						userInput = -1;
						makeSelectionMenu(allGames, cart);
						break;
					case 2:   //search by name
						userInput = -1;
						
						break;
					case 3:   //search by genre
						userInput = -1;
						
						break;
					case 4:   //search by disc type
						userInput = -1;
						
						break;
					case 5:   //search by release date
						userInput = -1;
						
						break;
					case 6:   //search by meta score
						userInput = -1;
						
						break;
						
				} //end gameMenu switch
				
				break;
				
			case 3:  //Return movie/game
				userInput = -1;
				
				break;
				
			case 0:  //Admin menu
				userInput = -1;
				
				break;
				
		} //end mainMenu switch
		
		
		
	}

	public static void printMainMenu() {
		System.out.println("Welcome!\n"
				+ "  1 -- Rent a movie\n"
				+ "  2 -- Rent a game\n"
				+ "  3 -- Return a movie / game\n"
				+ "  0 -- Login as Admin");
	}
	
	public static void printMovieMenu() {
		System.out.println("Rent a Movie\n"
				+ "  1 -- View All Movies\n"
				+ "  2 -- Search by Name\n"
				+ "  3 -- Search by Genre\n"
				+ "  4 -- Search by Disc Type\n"
				+ "  5 -- Search by Release Date\n"
				+ "  6 -- Search by MetaScore\n");
	}
	
	public static void printGameMenu() {
		System.out.println("Rent a Game\n"
				+ "  1 -- View All Games\n"
				+ "  2 -- Search by Name\n"
				+ "  3 -- Search by Genre\n"
				+ "  4 -- Search by Disc Type\n"
				+ "  5 -- Search by Release Date\n"
				+ "  6 -- Search by MetaScore\n");
	}
	
	public static void printAdminMenu() {
		System.out.println("Admin Menu\n"
				+ "\n");
	}
	
	public static void makeSelectionMenu(ArrayList<Product> productList, ArrayList<Product> cart) {
		
		boolean flag = false;
		char userInput;
		String someTitle;
		Product foundProduct = null;
		
		while(true) {
			
			//print list of products
			System.out.println(productList);
			
			System.out.print("\nDid you find what you were looking for?\n"
					+ "Type 'Y' for 'Yes', 'N' for 'No': ");
			userInput = console.next().charAt(0);
			
			if(userInput == 'Y') {
				while(true) {
					System.out.print("\n\nOkay! Type in a title, then press Enter: ");
					someTitle = console.nextLine();
					
					//search productList for someTitle
					for(int i = 0; i < productList.size() - 1; i++) {
						if(someTitle.compareTo(productList.get(i).getName()) == 0) {
							foundProduct = productList.get(i);
							System.out.println("\n\nFound it! Add to cart?"
									+ "Type 'Y' for 'Yes', 'N' for 'No': ");
							userInput = console.next().charAt(0);
							
							if(userInput == 'Y') {
								//call PurpleBox's addToCart() method
								PurpleBox.addToCart(cart, foundProduct);
							}
							break;
						}
					} //end for loop
					
					if(foundProduct == null) {
						System.out.println("Oops! Title not found.\n");
					}
					
					foundProduct = null;
					
					System.out.println("Search for another title in this list?\n"
							+ "Type 'Y' for 'Yes', 'N' for 'No': ");
					userInput = console.next().charAt(0);
						
					if(userInput == 'N') {
						break;  //escape inner while loop
					}
					
				} //end inner while loop
			} //end if 'Y'
			
			System.out.print("\n\nOkay, would you like to return to the previous menu?\n"
					+ "Type 'Y' for 'Yes', 'N' for 'No': ");
			userInput = console.next().charAt(0);
			
			if(userInput == 'Y') {
				flag = true;
				break;   //escape outer while loop and return User to previous menu
			}
			
		} //end outer while loop
		
		
	}
}


