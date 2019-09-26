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
	   public boolean isProductAvailable(Product someProduct);

	   /**
	   * Checkout.
	   *
	   * @param 
	   */
	   public void checkout(String email);

	   /**
	   * Make payment.
	   *
	   * @param 
	   */
	   public void makePayment(String method);

	   /**
	   * Return movies.
	   *
	   * @return the array list
	   */
	   public ArrayList<Movie> returnMovies();

	   /**
	   * Apply promo code.
	   *
	   * @param apply the code
	   */
	   public void applyPromoCode(String code);

	   /**
	   * Adds the game.
	   *
	   * @param 
	   * @param 
	   */
	   public void addGame(Game game, String type);

	   /**
	   * Removes the game.
	   *
	   * @param 
	   * @param 
	   */
	   public void removeGame(Game game, String type);

	   /**
	   * Removes all games.
	   */
	   public void removeAllGame();

	   /**
	   * Checks if is game available.
	   *
	   * @param type of game
	   * @return true, if is game available
	   */
	   public boolean isGameAvailable(Game game, String type);

	   /**
	   * Return games.
	   *
	   * @return the array list
	   */
	   public ArrayList<Game> returnGames();

	   /**
	   * Check user account.
	   *
	   * @return the array list
	   */
	   public ArrayList<Item> checkUserAccount();

	}
