package myAbstract.model;

import javax.swing.JOptionPane;

public class Halo3 extends VideoGame
{
	public Halo3()
	{
		this.setGameName("Halo 3");
		this.setDeveloper("Bungie");
		this.setPlayers(4);
	}
	
	public int cat()
	{
		return 0;
	}
	
	public String meme()
	{
		String meme = "Red vs Blue";
		return meme;
	}
	
	public void troll(int troll)
	{
		for(int i = 0; i < troll; i++)
		{
			JOptionPane.showMessageDialog(null, "You've been teabagged!");
		}
	}
	
	public void clickBait(int hate)
	{
		for(int i = 0; i < hate; i++)
		{
			JOptionPane.showMessageDialog(null, "How to find the energy sword in 3 easy Steps! >>>>");
		}
	}
}
