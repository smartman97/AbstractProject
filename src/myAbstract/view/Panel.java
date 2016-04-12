package myAbstract.view;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SpringLayout;

import myAbstract.controller.AbstractController;

public class Panel extends JPanel
{
	private AbstractController baseController;
	private JButton firstButton;
	private JTextArea firstArea;
	private SpringLayout baseLayout;

	public Panel(AbstractController baseController)
	{
		this.baseController = baseController;

		baseLayout = new SpringLayout();
		firstButton = new JButton("Press Button");
		firstArea= new JTextArea("");
		
		setupPanel();
		setupLayout();
		setupListeners();
	}

	/**
	 * Helper method to load all GUI components into the panel
	 */
	private void setupListeners()
	{
		
	}

	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, firstButton, 6, SpringLayout.SOUTH, firstArea);
		baseLayout.putConstraint(SpringLayout.NORTH, firstArea, 25, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, firstArea, 50, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, firstArea, -50, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, firstArea, -50, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.EAST, firstButton, -161, SpringLayout.EAST, this);
	}

	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(firstButton);
		this.add(firstArea);
	}

}
