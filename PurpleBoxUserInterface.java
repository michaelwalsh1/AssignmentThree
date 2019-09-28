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
	
	   /**
	   * Search product name in ArrayList<Product> alphabetically.
	   *
	   * @param String name
	   * @param ArrayList<Product> productList
	   *
	   * @returns the product list alphabetically.
	   */
	   public ArrayList<Product> sortByProductName(String name, ArrayList<Product> allProducts)
	
	   /**
	   * Search for product within ArrayList<Product> by name.
	   *
	   * @param String name
	   * @param ArrayList<Product>
	   *
	   * @returns the found product object.
	   */
	   public Product searchByName(ArrayList<Product> allProducts, String name)
	
           /**
	   * Search for product within ArrayList<Product> by genre.
	   *
	   * @param String genre
	   * @param ArrayList<Product>
	   *
	   * @returns a list of products of the desired genre
	   */
	   public ArrayList<Product> searchByGenre(ArrayList<Product> allProducts, String genre)
		   
           /**
	   * Search for product within ArrayList<Product> by format.
	   *
	   * @param String format
	   * @param ArrayList<Product>
	   *
	   * @returns a list of products of the desired format.
	   */
	   public ArrayList<Product> searchByFormat(ArrayList<Product> allProducts, String format)
		   
           /**
	   * Search for product within ArrayList<Product> by releaseDate.
	   *
	   * @param String releaseDate
	   * @param Node root
	   *
	   * @returns a list of products of the desired releaseDate.
	   */
	   public ArrayList<Product> searchByReleaseDate(Node root, String releaseDate)
		   
	   /**
	   * Search for product within BST by metaScore.
	   *
	   * @param int metaScore
	   * @param Node root
	   *
	   */
	   public Node searchByMetaScore(ArrayList<Product>, int metaScore)
		   
	   /**
	   * Traverse and print each element in the BST.
	   *
	   * @param String name
	   * @param Node n
	   *
	   */
	   public void inOrder(Node n, String name)
		   
           /**
	   * Traverse and print each element in the BST.
	   *
	   * @param Product movie
	   * @param Node n
	   *
	   */
	   public void inOrder(Node n, Product movie)
		   
           /**
	   * Traverse and print each element in the BST.
	   *
	   * @param Product game
	   * @param Node n
	   *
	   */
	   public void inOrder(Node n, Product game)
	
	}
