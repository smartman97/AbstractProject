package myAbstract.model;

import javax.swing.JOptionPane;

public class CallofDuty extends VideoGame
{
	public CallofDuty()
	{
		this.setGameName("Modern Warfare 2");
		this.setDeveloper("Infinity Ward");
		this.setPlayers(4);
	}
	
	public int cat()
	{
		return 0;
	}
	
	public String meme()
	{
		String meme = "Me Gusta";
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
			JOptionPane.showMessageDialog(null, "Learn to 360 no-scope in 3 easy Steps! >>>>");
		}
	}
}
