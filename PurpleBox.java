package com.David.maven.PurpleBox;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PurpleBox implements PurpleBoxUserInterface, PurpleBoxAdministratorInterface {

	Scanner console = new Scanner(System.in);
	
	@Override
	public void addToCart(ArrayList<Product> cart, Product someProduct) {
		cart.add(someProduct);
	}

	@Override
	public void removeFromCart(ArrayList<Product> cart, Product someProduct) {
		for(int i = 0; i < cart.size(); i++) {
			if(cart.get(i) == someProduct) {
				cart.remove(i);
				break;
			}
		}
	}
	
	@Override
	public void emptyCart(ArrayList<Product> cart) {
		cart.clear();
	}

	@Override
	public boolean isProductAvailable(Product someProduct) {
		if(someProduct.isAvailable() == true) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void checkout(ArrayList<Product> cart) throws Exception {
		int userInput = -1;
		double totalCost = 0;
		String method = "";
		
		for(int i = 0; i < cart.size(); i++) {
			totalCost += cart.get(i).getPrice();
		}
		
		do {
			try {
				System.out.print("What's your payment method?\n"
						+ "  1 -- Debit\n"
						+ "  2 -- Credit\n");
				System.out.print("Make a selection: ");
				userInput = console.nextInt();
				
				if(userInput < 1 || userInput > 2) {
					throw new Exception();
				}
				
				System.out.println();
				
				break;
				
			} catch(InputMismatchException e) {
				System.out.println("** Enter a number 1-2 **");
				console.nextLine();
			} catch(Exception e) {
				System.out.println("** Enter a number 1-2 **");
			}
		} while(true);
		
		switch(userInput) {
			case 1:
				method = "debit";
				break;
			case 2:
				method = "credit";
				break;
		}
		
		makePayment(method);
		
		
	}

	@Override
	public void makePayment(String method) {
		
	}

	@Override
	public double applyPromoCode(double totalCost, String code) {
		
		return 0;
	}

	public void sortByName(ArrayList<Product> allProducts) {
		
	}

	public void sortByReleaseDate(ArrayList<Product> allProducts) {
		
	}
	
	public void sortByMetaScore(ArrayList<Product> allProducts) {
		
	}
	
	public ArrayList<Product> viewAllMovies(ArrayList<Product> allProducts) {
		return null;
	}
	
	public ArrayList<Product> viewAllGames(ArrayList<Product> allProducts) {
		return null;
	}
	
	public Product searchByName(ArrayList<Product> allProducts, String name) {
		for(Product info: allProducts) {
        		System.out.println(info.getName());
        	}
	}

	public ArrayList<Product> searchByGenre(ArrayList<Product> allProducts, String genre) {
		for(Product info: allProducts) {
        		System.out.println(info.getGenre());
        	}
		return null;
	}

	public ArrayList<Product> searchByFormat(ArrayList<Product> allProducts, String format) {
		for(Product info: allProducts) {
        		System.out.println(info.getFormat());
        	}
		return null;
	}

	public ArrayList<Product> searchByReleaseDate(ArrayList<Product> allProducts, String releaseDate) {
		for(Product info: allProducts) {
        		System.out.println(info.getReleaseDate());
        	}
		return null;
	}

	public ArrayList<Product> searchByMetaScore(ArrayList<Product> allProducts, int metaScore) {
		for(Product info: allProducts) {
        		System.out.println(info.getMetaScore());
        	}
		return null;
	}

	public void addProductToInventory(Product someProduct) {
		
	}

	public boolean removeProductFromInventory(Product someProduct) {
		return false;
	}

	public void removeAllFromInventory() {
		
	}

	public void changePrice(Product product, double newPrice) {
		
	}

	public double changeDVDPrice(ArrayList<Product> allProducts, double newDVDPrice) {
							String format = "dvd";
		for(i=0; i< allProducts.length(); i++) {
			if i.getMediaType.equals(format)) {
				i.setPrice(newDVDPrice);
			}
		}
	}
						
	public double ChangeBlu-RayPrice(ArrayList<Product> allProducts, double newBlu-RayPrice) {
		String format = "blu-ray";
		for(i=0; i< allProducts.length(); i++) { 
			if i.getMediaType.equals(format)) {
				i.setPrice(newBlu-RayPrice);
			}
		}
	}
	
	public double changeGamesPrice(ArrayList<Product> allProducts, double newGamesPrice) {
		String format1 = "xbox";
		String format2 = "ps4"
		for(i=0; i< allProducts.length(); i++) { 
			if i.getMediaType.equals(format1)|| i.getMediaType.equals(format2)) {
				i.setPrice(newGamesPrice);
			}
		}
	} 
	
	public void setVolumeDiscount(double discount) {
		
	}

	public void setPromoCodes(String codes) {
		
	}

	public void disableUnit() {
		isPurpleBoxDisabled = true;
	}

	public void enableUnit() {
		isPurpleBoxDisabled = false;
	}
	
	public boolean checkUnitStatus(boolean isPurpleBoxDisabled){
		if(isPurpleBoxDisabled = true) {
			return true;
			System.out.println("Unit disabled. Try again later.");
		}
		return false;
	}

}
