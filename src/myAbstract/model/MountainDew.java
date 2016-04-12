package myAbstract.model;

import javax.swing.JOptionPane;

public class MountainDew extends Soda
{

	public MountainDew()
	{
		this.setBrand("MountainDew");
		this.setColor("green");
		this.setLiters(-1);
	}

	public MountainDew(double liters)
	{
		this.setBrand("MountainDew");
		this.setColor("green");
		this.setLiters(liters);
	}

	@Override
	public int cat()
	{

		return 0;
	}

	@Override
	public void troll(int troll)
	{
		JOptionPane.showMessageDialog(null, "Troll by MountainDew TM");
	}

	@Override
	public String meme()
	{

		return "Doritos";

	}

	@Override
	public void clickBait(int hate)
	{
		while (hate > 0)
		{
			JOptionPane.showMessageDialog(null, "BUY MOUNTAIN DEW TODAYYYY");
			hate--;
		}
		JOptionPane.showMessageDialog(null, "BUY IT OR SUFFER");
	}
	
	public String toString()
	{
		String description = "This is a " + this.getClass() + " and its meme is: " + meme(); 
		
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
