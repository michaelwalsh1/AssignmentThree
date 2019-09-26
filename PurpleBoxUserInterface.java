package com.David.maven.PurpleBox;

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
	   public boolean isMovieAvailable(Product someMovie);

	   /**
	   * Checkout products from User's cart.
	   *
	   * @param ArrayList<Product> cart
	   *
	   */
	   public void checkout(ArrayList<Product> cart);

	   /**
	   * Make payment.
	   *
	   * @param 
	   */
	   public void makePayment(String method);

	   /**
	   * Return products.
	   *
	   * @return the array list
	   */
	   public ArrayList<Product> returnProduct();

	   /**
	   * Apply promo code.
	   *
	   * @param String code
	   * @return double totalCost
	   */
	   public double applyPromoCode(double totalCost, String code);
	
	   

	
	}
