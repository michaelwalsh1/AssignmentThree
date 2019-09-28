package com.David.maven.PurpleBox;

import java.util.ArrayList;

public interface PurpleBoxAdminInterface {
	/**
	* This method allows the admin to add a product to the purplebox.
	*
	* @param Product to be added to ArrayList<Product>.
	*/
	public void addProductToInventory(Product someProduct);
	
	/**
	* This method allows the admin to remove a product from the purplebox.
	*
	* @param Product to be removed from inventory ArrayList<Product>.
	* @returns true if product was removed.
	*/
	public boolean removeProductFromInventory(Product someProduct);
	
	/**
	* This method allows the admin to remove all Products from the purplebox.
	* 
	* @ensure all Products removed from ArrayList<Product>.
	*/
	public void removeAllFromInventory();

	
	/**
	* This method allows the admin to change the price of any Product.
	*
	* @param ArrayList<Product> of all Products.
	* @param Game price to be changed.
	*/
	public void changePrice(Product product, double newPrice);
	
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
