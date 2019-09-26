package com.David.maven.PurpleBox;

public interface PurpleBoxUserInterface {

	   /**
	   * Adds the movie.
	   *
	   * @param 
	   */
	   public void addMovie(Movie movie);

	   /**
	   * Removes the movie.
	   *
	   * @param 
	   */
	   public void removeMovie(Movie movie);

	   /**
	   * Removes the all movie.
	   */
	   public void removeAllMovie();

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