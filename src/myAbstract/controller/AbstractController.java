package myAbstract.controller;

import java.util.ArrayList;
import myAbstract.model.BicycleDardDeck;
import myAbstract.model.CallofDuty;
import myAbstract.model.InternetThings;
import myAbstract.model.MountainDew;
import myAbstract.view.Frame;

public class AbstractController
{
	private ArrayList<InternetThings> internetThings; 
	private CallofDuty cod;
	private BicycleDardDeck card;
	private MountainDew dew;
	private Frame baseFrame;
	
	public AbstractController()
	{
		baseFrame = new Frame(this);
		internetThings = new ArrayList<InternetThings>();
		
		cod = new CallofDuty();
		card = new BicycleDardDeck();
		dew = new MountainDew();
		
		internetThings.add(cod);
		internetThings.add(card);
		internetThings.add(dew);
	}
	
	public void start()
	{
		for(int i = 0; i < internetThings.size(); i++)
		{
			internetThings.get(i).troll(2);
			internetThings.get(i).meme();
			internetThings.get(i).clickBait(3);
			internetThings.get(i).cat();
		}
	}
	
	private void swap(int firstLocation, int secondLocation)
	{
		InternetThings temp = internetThings.get(firstLocation);
		internetThings.set(firstLocation, internetThings.get(secondLocation));
		internetThings.set(secondLocation, temp);
	}
	
	public void insertionSort()
	{
		for(int outerLoop = 1; outerLoop < internetThings.size(); outerLoop++)
		{
			int innerLoop = outerLoop;
			while(innerLoop > 0 && internetThings.get(innerLoop - 1).compareTo(internetThings.get(innerLoop)) > 0)
			{
				swap(innerLoop, innerLoop-1);
				innerLoop--;
			}
		}
	}
}
