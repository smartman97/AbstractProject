package myAbstract.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SpringLayout;

import myAbstract.controller.AbstractController;
import myAbstract.model.InternetThings;

public class Panel extends JPanel
{
	private AbstractController baseController;
	private JButton sortButton;
	private JButton memeButton;
	private JTextArea firstArea;
	private SpringLayout baseLayout;

	public Panel(AbstractController baseController)
	{
		this.baseController = baseController;

		baseLayout = new SpringLayout();
		sortButton = new JButton("Sort Button");
		memeButton = new JButton("Dank Memes");
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
		sortButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{	
				baseController.insertionSort();
				
				firstArea.setText(baseController.showCats());
			}
		});
		
		memeButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{			
				firstArea.setText(baseController.showMemes());
			}
		});
	}

	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, sortButton, 6, SpringLayout.SOUTH, firstArea);
		baseLayout.putConstraint(SpringLayout.NORTH, firstArea, 25, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, firstArea, 50, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, firstArea, -50, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, firstArea, -50, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.EAST, sortButton, -161, SpringLayout.EAST, this);
	}

	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(sortButton);
		this.add(memeButton);
		this.add(firstArea);
	}
}
