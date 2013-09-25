package edu.asu.soda.calcul8;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class UIManager extends JFrame {

	//really this should go elsewhere; this is just a temporary measure
	public static void main(String[] args){
		UIManager instance = new UIManager();
		instance.setVisible(true);
	}
	
	//some class variables
	private JTextArea numberPane;
	private JButton zero, one, two, three, four, five, six, seven, eight, nine, clear, add, subtract, multiply, divide, clearEverything;	//i am so sorry
	private JPanel buttonPanel;
	
	//handles formatting and display
	public UIManager(){
		this.setSize(300, 400);
		this.setResizable(false);
		this.initializeSubelements();
	}
	
	//responsible for setting up what's visible
	public void initializeSubelements(){
		this.setLayout(new BorderLayout());
		
		//add the number pane for display
		numberPane = new JTextArea("0", 1, 12);
		numberPane.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 24));
		
		buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(4, 4));
		
		//configure the buttons
		zero = new JButton("0");
		one = new JButton("1");
		two = new JButton("2");
		add = new JButton("+");
		three = new JButton("3");
		four = new JButton("4");
		five = new JButton("5");
		subtract = new JButton("-");
		six = new JButton("6");
		seven = new JButton("7");
		eight = new JButton("8");
		multiply = new JButton("*");
		nine = new JButton("9");
		clear = new JButton("C");
		clearEverything = new JButton("CE");
		divide = new JButton("/");
		
		//add the buttons to the button panel
		buttonPanel.add(zero);
		buttonPanel.add(one);
		buttonPanel.add(two);
		buttonPanel.add(add);
		buttonPanel.add(three);
		buttonPanel.add(four);
		buttonPanel.add(five);
		buttonPanel.add(subtract);
		buttonPanel.add(six);
		buttonPanel.add(seven);
		buttonPanel.add(eight);
		buttonPanel.add(multiply);
		buttonPanel.add(nine);
		buttonPanel.add(clear);
		buttonPanel.add(clearEverything);
		buttonPanel.add(divide);
		
		//put the number pane and button panel into the main view
		this.add(numberPane, BorderLayout.NORTH);
		this.add(buttonPanel, BorderLayout.CENTER);
		
	}
	
	
}