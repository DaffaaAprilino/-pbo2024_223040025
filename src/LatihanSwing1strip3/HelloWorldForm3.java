package LatihanSwing1strip3;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloWorldForm3 extends JFrame implements ActionListener //1
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel label; //2
	private JButton button;
	//3
	public HelloWorldForm3()
	{
		label = new JLabel();
		label.setText("Hello world!");
		button = new JButton ("Klik Me!");
		button.addActionListener(this);
		
		setLayout(new GridLayout(2,1));
		add(label);
		add(button);
		setTitle("My First Program");
		setVisible(true);
		setSize(300, 200);
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		label.setText("hallo Dunia!");
	}
}