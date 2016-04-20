package myAbstract.model;

public abstract class VideoGame implements InternetThings, Comparable
{
	// Three Data Members
	private String gameName;
	private int players;
	private String developer;

	public String getGameName()
	{
		return gameName;
	}

	public int getPlayers()
	{
		return players;
	}

	public String getDeveloper()
	{
		return developer;
	}

	public void setGameName(String gameName)
	{
		this.gameName = gameName;
	}

	public void setPlayers(int players)
	{
		this.players = players;
	}

	public void setDeveloper(String developer)
	{
		this.developer = developer;
	}

//	public String toString()
//	{
//		String description = "This is a " + this.getClass()
//				+ " and its meme is: " + meme() + "\n";
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
	 * If the supplied variable compared comes before the calling variable
	 * return -1 If the supplied variable is after the calling variable return 1
	 * Elseif they are the same, return 0
	 * 
	 * @param compared
	 * @return
	 */
	public int compareTo(Object compared)
	{
		int comparedValue = Integer.MIN_VALUE;

		if (compared instanceof InternetThings)
		{
			if (this.cat() > ((InternetThings) compared).cat())
			{
				comparedValue = 1;
			}
			else if (this.cat() < ((InternetThings) compared).cat())
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
