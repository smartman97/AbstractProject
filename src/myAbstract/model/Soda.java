package myAbstract.model;

public abstract class Soda implements InternetThings
{
	private String brand;
	private String color;
	private double liters;

	public String getBrand()
	{
		return brand;
	}

	public void setBrand(String brand)
	{
		this.brand = brand;
	}

	public String getColor()
	{
		return color;
	}

	public void setColor(String color)
	{
		this.color = color;
	}

	public double getLiters()
	{
		return liters;
	}

	public void setLiters(double liters)
	{
		this.liters = liters;
	}
}
