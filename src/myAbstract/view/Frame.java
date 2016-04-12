package myAbstract.view;

import javax.swing.JFrame;

import myAbstract.controller.AbstractController;

/**
 * 
 * @author Colm Laro
 * @version 1.2 11/09/2015 Added a panel to the frame.
 *
 */

public class Frame extends JFrame
{
	private AbstractController baseController;
	private Panel basePanel;
	
	public Frame(AbstractController baseController)
	{
		this.baseController = baseController;
		basePanel = new Panel(baseController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel); //Must be the first line of setupFrame() -Installs panel in the frame.
		this.setSize(400, 400);			//Fine a good size for the application.
		this.setTitle("Simple GUI");
		this.setResizable(true);		//Advisable not required.
		this.setVisible(true);			//Must be the last line of setupFrame()
	}
	
	public AbstractController getBaseController()
	{
		return baseController;
	}
}