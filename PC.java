package ROLEX;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.*;

public class PC extends ss{
public static void main(String[] args) {
	JFrame f=new JFrame("multi Layout");
	JPanel toppanel=new JPanel();
	JLabel l1=new JLabel("Login Page");
	l1.setForeground(Color.green);
	l1.setFont(new Font("Arial",Font.BOLD,20));
	toppanel.add(l1);
	toppanel.setLayout(new FlowLayout());
	
	JPanel midpanel=new JPanel();
	JButton b1=new JButton("Swiggy");
	JButton b2=new JButton("Zomato");
	JButton b3=new JButton("Filpkart");
	JButton b4=new JButton("Amazon");
	midpanel.add(b1);
	midpanel.add(b2);
	midpanel.add(b3);
	midpanel.add(b4);
	midpanel.setLayout(new GridLayout(2,2));
	
	JPanel bottompanel=new JPanel();
	bottompanel.setLayout(new BoxLayout(bottompanel,BoxLayout.X_AXIS));
	JButton f1=new JButton("search");
	JButton f2=new JButton("window");
	JButton f3=new JButton("chrome");
	JButton f4=new JButton("copilot");
	bottompanel.add(f1);
	bottompanel.add(f2);
	bottompanel.add(f3);
	bottompanel.add(f4);
	
	f.setLayout(new BorderLayout());
	f.add(toppanel, BorderLayout.NORTH);
	f.add(midpanel, BorderLayout.CENTER);
	f.add(bottompanel, BorderLayout.SOUTH);

	f.setSize(1000,800);
	f.setVisible(true);
}
}