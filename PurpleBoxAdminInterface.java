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
	       public void removeProductFromInventory(Product someProduct);

	       /**
	       * This method allows the admin to remove all movies from the purplebox.
	       */
	       public void removeAllFromInventory();

		   
	       /**
	       * This method allows thse admin to change the price of any product.
	       *
	       * @param item
	       */
	       public void changePrice(Product someProduct);
	      
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
	       public void setPromoCodes(ArrayList<String> codes);
	      
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
