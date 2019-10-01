package com.David.maven.PurpleBox;

import java.util.ArrayList;

public interface PurpleBoxUserInterface {
	  /**
	   * This method adds a product to the user's cart.
	   *
	   * @param ArrayList<Product> cart
	   * @param Product someProduct to be added to User's cart.
	   * 
	   * @require Product must exist.
	   * @ensure Product is added to User's cart.
	   */
	   public void addToCart( ArrayList<Product> cart, Product someProduct );

	  /**
	   * This method removes a product from the user's cart.
	   *
	   * @param ArrayList<Product> cart
	   * @param Product someProduct to be removed from User's cart.
	   *
	   * @require Product isAvailable
	   * @ensure Product is removed from User's cart.
	   */
	   public void removeFromCart( ArrayList<Product> cart, Product someProduct );

	  /**
	   * Removes all products from User's cart.
	   *
	   * @param ArrayList<Product> cart
	   * 
	   * @require Number of products in cart to be >= 0.
	   * @ensure User's cart is empty.
	   */
	   public void emptyCart( ArrayList<Product> cart );

	  /**
	   * Checks if product is available.
	   *
	   * @param Product someProduct
	   * @return boolean, if someProduct is available
	   * @ensure result == (true || false)
	   */
	   public boolean isProductAvailable(Product someMovie);

	   /**
	   * Checkout Products from User's cart.
	   *
	   * @param ArrayList<Product> cart
	   * 
	   * @ensure commencement of all methods related to checkout.
	   */
	   public void checkout(ArrayList<Product> cart);

	  /**
	   * Make payment.
	   *
	   * @param getPaymentInformation
	   */
	   public void makePayment(String method);
	
	  /**
	   * Apply promo code.
	   *
	   * @param String code
	   * @return double totalCost
	   */
	   public double applyPromoCode(double totalCost, String code);

	  /**
	   * View all Movie Products.
	   *
	   * @param ArrayList<Product> allProducts
	   *
	   * @return ArrayList<Product> of format 'dvd' or 'bluray'
	   */
	   public ArrayList<Product> viewAllMovies(ArrayList<Product> allProducts);
	
	  /**
	   * View all Game Products.
	   *
	   * @param ArrayList<Product> allProducts
	   *
	   * @return ArrayList<Product> of format 'ps4' or 'xbox'
	   */
	   public ArrayList<Product> viewAllGames(ArrayList<Product> allProducts);
	
	  /**
	   * Sort ArrayList<Product> alphabetically by name.
	   *
	   * @param ArrayList<Product> allProducts
	   *
	   * @ensure ArrayList<Product> allProducts sorted alphabetically by name.
	   */
	   public void sortByName(ArrayList<Product> allProducts);
	
	  /**
	   * Sort ArrayList<Product> chronologically by releaseDate.
	   *
	   * @param ArrayList<Product> allProducts
	   *
	   * @ensure ArrayList<Product> allProducts sorted chronologically by releaseDate.
	   */
	   public void sortByReleaseDate(ArrayList<Product> allProducts);
	
	  /**
	   * Sort ArrayList<Product> numerically by metaScore.
	   *
	   * @param ArrayList<Product> allProducts
	   *
	   * @ensure the ArrayList<Product> allProducts sorted numerically by metaScore.
	   */
	   public void sortByMetaScore(ArrayList<Product> allProducts);
	
	  /**
	   * Search for product within ArrayList<Product> by name.
	   *
	   * @param String name
	   * @param ArrayList<Product>
	   *
	   * @return the found Product object.
	   */
	   public Product searchByName(ArrayList<Product> allProducts, String name);
	
          /**
	   * Search for product within ArrayList<Product> by genre.
	   *
	   * @param String genre
	   * @param ArrayList<Product>
	   *
	   * @return ArrayList<Product> of the desired genre.
	   */
	   public ArrayList<Product> searchByGenre(ArrayList<Product> allProducts, String genre);
		   
          /**
	   * Search for Product within ArrayList<Product> by format.
	   *
	   * @param String format
	   * @param ArrayList<Product>
	   *
	   * @return ArrayList<Product> of the desired format.
	   */
	   public ArrayList<Product> searchByFormat(ArrayList<Product> allProducts, String format);
	
          /**
	   * Search for Product within ArrayList<Product> by releaseDate.
	   *
	   * @param String releaseDate
	   * @param Node root
	   *
	   * @return ArrayList<Product> of the desired releaseDate.
	   */
	   public ArrayList<Product> searchByReleaseDate(ArrayList<Product> allProducts, String releaseDate);
		   
	  /**
	   * Search for Product within ArrayList<Product> by metaScore.
	   *
	   * @param int metaScore
	   * @param ArrayList<Product>
	   *
	   * @return ArrayList<Product> of the desired metaScore.
	   */
	   public ArrayList<Product> searchByMetaScore(ArrayList<Product> allProducts, int metaScore);
		   
	
	
	}
