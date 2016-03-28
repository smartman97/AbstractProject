package myAbstract.model;

public abstract class VideoGame
{
	//Three Data Members
	private String gameName;
	private int players;
	private String publisher;
	
	public String getGameName()
	{
		return gameName;
	}
	public int getPlayers()
	{
		return players;
	}
	public String getPublisher()
	{
		return publisher;
	}
	public void setGameName(String gameName)
	{
		this.gameName = gameName;
	}
	public void setPlayers(int players)
	{
		this.players = players;
	}
	public void setPublisher(String publisher)
	{
		this.publisher = publisher;
	}
	
	
}
