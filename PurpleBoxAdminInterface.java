package com.David.maven.PurpleBox;

public interface PurpleBoxAdminInterface {
	
	/**
	   * The Interface PurpleBoxUserInterface.
	   */
	   public interface PurpleBoxUserInterface {

	       /**
	       * Adds the movie.
	       *
	       * @param movie the movie
	       */
	       public void addMovie(Movie movie);

	       /**
	       * Removes the movie.
	       *
	       * @param movie the movie
	       */
	       public void removeMovie(Movie movie);

	       /**
	       * Removes the all movie.
	       */
	       public void removeAllMovie();

	       /**
	       * Checks if is movie available.
	       *
	       * @param movie the movie
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
	       * @param code the code
	       */
	       public void applyPromoCode(String code);

	       /**
	       * Adds the game.
	       *
	       * @param game the game
	       * @param type the type
	       */
	       public void addGame(Game game, String type);

	       /**
	       * Removes the game.
	       *
	       * @param game the game
	       * @param type the type
	       */
	       public void removeGame(Game game, String type);

	       /**
	       * Removes the all game.
	       */
	       public void removeAllGame();

	       /**
	       * Checks if is game available.
	       *
	       * @param game the game
	       * @param type the type
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
	       * Change price.
	       *
	       * @param 
	       */
	       public void changePrice(Item item);
	      
	       /**
	       * Volume discount.
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
	       * Disable unit.
	       *
	       * @param item the item
	       */
	       public void disableUnit(Item item);
	      
	       /**
	       * Enable unit.
	       *
	       * @param item the item
	       */
	       public void enableUnit(Item item);
	}