package myAbstract.controller;

import java.util.ArrayList;
import myAbstract.model.BicycleDardDeck;
import myAbstract.model.CallofDuty;
import myAbstract.model.InternetThings;
import myAbstract.model.MountainDew;
import myAbstract.view.Frame;

public class AbstractController
{
	private ArrayList<InternetThings> InternetThings; 
	private CallofDuty cod;
	private BicycleDardDeck card;
	private MountainDew dew;
	private Frame baseFrame;
	
	public AbstractController()
	{
		baseFrame = new Frame(this);
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
			InternetThings.get(i).meme();
			InternetThings.get(i).clickBait(3);
			InternetThings.get(i).cat();
		}
	}
}
