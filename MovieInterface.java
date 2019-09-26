package com.David.maven.PurpleBox;

public interface MovieInterface {

	public String getTitle();

	public void setTitle(String title);

	public String getGenre();

	public void setGenre(String genre);

	public MyDate getDate();

	public void setDate(MyDate date);

	public boolean getIsBluRay();

	public void setIsBluRay(boolean bluRay);

	public double getPrice();

	public void setPrice(double price);

	public int getQuantity();

	public void setQuantity(int quantity);

	public String toSring();
}
