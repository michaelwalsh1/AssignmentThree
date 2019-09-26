package com.David.maven.PurpleBox;

public interface PurpleBoxUserInterface {

	   /**
	   * This method adds a product to the user's cart.
	   *
	   * @param ArrayList
	   * @param Product
	   */
	   public void addToCart( ArrayList<Product> cart, Product someProduct );

	   /**
	   * Removes the movie.
	   *
	   * @param 
	   */
	   public void removeFromCart( ArrayList<Product> cart, Product someProduct );

	   /**
	   * Removes the all movie.
	   */
	   public void emptyCart( ArrayList<Product> cart );

	   /**
	   * Checks if is movie available.
	   *
	   * @param 
	   * @return true, if is movie available
	   */
	   public boolean isMovieAvailable(Movie movie);

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
