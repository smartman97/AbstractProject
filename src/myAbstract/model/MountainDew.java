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
		while(hate > 0)
		{
			JOptionPane.showMessageDialog(null, "BUY MOUNTAIN DEW TODAYYYY");
			hate--;
		}
		JOptionPane.showMessageDialog(null, "BUY IT OR SUFFER");
	}
}
