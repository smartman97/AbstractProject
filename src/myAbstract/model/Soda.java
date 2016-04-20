package myAbstract.model;

public abstract class Soda implements InternetThings, Comparable
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
	
//	public String toString()
//	{
//		String description = "This is a " + this.getClass() + " and its meme is: " + meme() + "\n"; 
//		
//		return description;
//	}
	
	public String toString()
	{
		String description = "This is a " + this.getClass()
				+ " and the number of cats it has is: " + cat() + "\n";

		return description;
	}
	
	/**
	 * If the supplied variable compared comes before the calling variable return -1
	 * If the supplied variable is after the calling variable return 1
	 * Elseif they are the same, return 0
	 * @param compared
	 * @return
	 */
	public int compareTo(Object compared)
	{
		int comparedValue = Integer.MIN_VALUE;
		
		if(compared instanceof InternetThings)
		{
			if(this.cat() > ((InternetThings) compared).cat())
			{
				comparedValue = 1;
			}
			else if(this.cat() < ((InternetThings) compared).cat())
			{
				comparedValue = -1;
			}
			else
			{
				comparedValue = 0;
			}
		}
		
		return comparedValue;
	}
}
