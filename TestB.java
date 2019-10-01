package com.David.maven.PurpleBox;

public class Test {

	public static void main(String[] args) {
		System.out.print("Welcome to PurpleBox, please select an option:/n "
				+ "1: Search for a movie/n"
				+ "2: Search for a game/n"
				+ "3: Add product to cart/n"
				+ "4: Remove product from cart/n"
				+ "5: Checkout"
				+ "0: Exit");
		
		switch
		
		case 1:
			System.out.print("How would you like to search:/n"
					+ "1: Search by name/n"
					+ "2: Search by genre/n"
					+ "3: Search by release date/n"
					+ "4: Search by metaScore/n"
					+ "5: Search by Type/n"
					+ "0: Exit");
			switch (searchSwitch) {
				case 1: //name search
					break;
				case 2: //genre search
					break;
				case 3: //release date search
					break;
				case 4: //metaScore search
					break;
				case 5: //type search
					System.out.print("How would you like to search:/n"
							+ "1: Search for DVD/n"
							+ "2: Search for Blu-ray");
					
					switch (movieTypeSwitch) {
						case 1://dvd search
							break;
						case 2: //blu-ray search
							break;
						case 0: //exit switch	
							break;
					}
				case 0: //exit
					break;
				
			
		case 2:
			System.out.print("How would you like to search:/n"
					+ "1: Search by name/n"
					+ "2: Search by genre/n"
					+ "3: Search by release date/n"
					+ "4: Search by metaScore/n"
					+ "5: Search by Type/n"
					+ "0: Exit");
			switch (gameSearchSwitch) {
				case 1: //name search
					break;
				case 2: //genre search
					break;
				case 3: //release date search
					break;
				case 4: //metaScore search
					break;
				case 5: //type search
					System.out.print("How would you like to search:/n"
							+ "1: Search for PS/n"
							+ "2: Search for Xbox");
					
					switch (gameTypeSwitch) {
						case 1://dvd search
							break;
						case 2: //blu-ray search
							break;
						case 0: //exit
							break;
					}
				case 0: //exit switch
					break;
			}
			break;
			
		case 3:
			System.out.print("Add Product to cart");
			break;
			
		case 4:
			System.out.print("Remove product from cart");
			break;
			
		case 5:
			System.out.print("Checkout");
			break;
			
		case 0:
			break;

	}

}
