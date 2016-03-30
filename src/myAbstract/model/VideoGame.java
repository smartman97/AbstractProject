package myAbstract.model;

public abstract class VideoGame implements InternetThings
{
	//Three Data Members
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
	
	
}
