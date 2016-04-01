package myAbstract.controller;

import java.util.ArrayList;

import myAbstract.model.BicycleDardDeck;
import myAbstract.model.CallofDuty;
import myAbstract.model.InternetThings;
import myAbstract.model.MountainDew;

public class AbstractController
{
	private ArrayList<InternetThings> InternetThings; 
	private CallofDuty cod;
	private BicycleDardDeck card;
	private MountainDew dew;
	
	public AbstractController()
	{
		InternetThings = new ArrayList<InternetThings>();
		
		cod = new CallofDuty();
		card = new BicycleDardDeck();
		dew = new MountainDew();
		
		InternetThings.add(cod);
		InternetThings.add(card);
		InternetThings.add(dew);
	}
	
	public void start()
	{
		for(int i = 0; i < InternetThings.size(); i++)
		{
			InternetThings.get(i).troll(2);
		}
	}
}
