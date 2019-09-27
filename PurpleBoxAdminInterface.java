package com.David.maven.PurpleBox;

public interface PurpleBoxAdminInterface {
	
	/**
	* The Interface PurpleBoxUserInterface.
	*/
	public interface PurpleBoxUserInterface {

		/**
		* This method allows the admin to add a product to the purplebox.
		*
		* @param Product to be added to inventory BST.
		*/
		public void addProductToInventory(Product someProduct);
		
		/**
		* This method allows the admin to remove a product from the purplebox.
		*
		* @param Product to be removed from inventory BST.
		*/
		public void removeProductFromInventory(Product someProduct);
		
		/**
		* This method allows the admin to remove all Products from the purplebox.
		* 
		* @ensure all Products removed from inventory BST.
		*/
		public void removeAllFromInventory();
		
		/**
		* This method allows the admin to change the price of any Product.
		*
		* @param BST inventory of all Products.
		* @param Movie price to be changed.
		*/
		public void changeDVDPrice(BST inventory, double newPrice);
		
		/**
		* This method allows the admin to change the price of any Product.
		*
		* @param BST inventory of all Products.
		* @param Movie price to be changed.
		*/
		public void changeBluRayPrice(BST inventory, double newPrice);
		
		/**
		* This method allows the admin to change the price of any Product.
		*
		* @param BST inventory of all Products.
		* @param Game price to be changed.
		*/
		public void changeGamePrice(BST inventory, double newPrice);
		
		/**
		* This method allows the admin to make set the volume discount.
		*
		* @param double discount is percentage (ex. 0.5 for 50%) of discount.
		*/
		public void setVolumeDiscount(double discount);
		
		/**
		* Adds the promo codes.
		*
		* @param ArrayList<String> of promo codes.
		*/
		public void setPromoCodes(ArrayList<String> codes);
		
		/**
		* This method allows the admin to disable the entire unit.
		*
		* @param 
		*/
		public void disableUnit();
		
		/**
		* This method allows the admin to enable the entire unit.
		*
		* @param 
		*/
		public void enableUnit();
	}
