package myAbstract.model;

import javax.swing.JOptionPane;

public class BicycleDardDeck extends Cards
{

	public BicycleDardDeck()
	{
		this.setAmount(52);
		this.setCardName("Bicycle Cards");
		this.setItAGoodDeck(true);
		this.setPrice(10.99);
	}

	public int cat()
	{

		return amount;

	}

	public void troll(int Troll)
	{
		for (int spot = 10; spot == Troll; spot--)
		{
			JOptionPane.showMessageDialog(null, "There is " + Troll + " cards");
		}
	}

	public String meme()
	{
		return cardName;
	}

	public void clickBait(int hate)
	{
		JOptionPane.showMessageDialog(null,
				"SAVE THE CATS!!! CLICK HEAR NOW!!!!");
		JOptionPane.showMessageDialog(null,
				"YOU JUST WON A FREE I PAD CLICK NOW!!!");
		JOptionPane.showMessageDialog(null, "Top 10 projects about programing");
		JOptionPane.showMessageDialog(null,
				"Click hear to know a trick that teachers hate!!! ");

	}

	public String toString()
	{
		String description = "This is a " + this.getClass()
				+ " and its meme is: " + meme();

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
