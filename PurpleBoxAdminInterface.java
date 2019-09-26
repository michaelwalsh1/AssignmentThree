package com.David.maven.PurpleBox;

public interface PurpleBoxAdminInterface {
	
	/**
	   * The Interface PurpleBoxUserInterface.
	   */
	   public interface PurpleBoxUserInterface {

	       /**
	       * This method allows the admin to add a product to the purplebox.
	       *
	       * @param some product
	       */
	       public void addProductToInventory(Product someProduct);

	       /**
	       * This method allows the admin to remove a product from the purplebox.
	       *
	       * @param 
	       */
	       public void removeMovie(Movie movie);

	       /**
	       * This method allows the admin to remove all movies from the purplebox.
	       */
	       public void removeAllMovie();

	       /**
	       * This method checks if a movie is available.
	       *
	       * @param 
	       * @return true, if movie is available
	       */
	       public boolean isMovieAvailable(Movie movie);

	       /**
	       * Checkout.
	       *
	       * @param 
	       */
	       //public void checkout(String email);

	       /**
	       * Make payment.
	       *
	       * @param 
	       */
	       //public void makePayment(String method);

	       /**
	       * Return movies.
	       *
	       * @return the array list
	       */
	       public ArrayList<Movie> returnMovies();

	       /**
	       * Apply promo code.
	       *
	       * @param 
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
	       * Removes the all game.
	       */
	       public void removeAllGame();

	       /**
	       * Checks if is game available.
	       *
	       * @param 
	       * @param 
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
	      
	       /**
	       * Adds the movie to inventory.
	       *
	       * @param 
	       */
	       public void addMovieToInventory(Movie movie);
	      
	       /**
	       * Removie movie to inventory.
	       *
	       * @param 
	       */
	       public void removieMovieToInventory(Movie movie);
	      
	       /**
	       * This method allows th user to change the price of any product.
	       *
	       * @param item
	       */
	       public void changePrice(Item item);
	      
	       /**
	       * This method allows the admin to make changes to the volume discount.
	       *
	       * @param 
	       */
	       public void volumeDiscount(double amount);
	      
	       /**
	       * Adds the promo codes.
	       *
	       * @param 
	       */
	       public void addPromoCodes(ArrayList<String> codes);
	      
	       /**
	       * This method allows the admin to disable the entire unit.
	       *
	       * @param 
	       */
	       public void disableUnit(Item item);
	      
	       /**
	       * This method allows the admin to enable the entire unit.
	       *
	       * @param 
	       */
	       public void enableUnit(Item item);
	}
