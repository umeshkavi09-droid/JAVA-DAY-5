package ROLEX;

import java.awt.GridLayout;
import javax.swing.*;

public class uu extends ss{
public static void main(String[] args) {
	JFrame f=new JFrame("hiii");
	JButton  l1=new JButton ("swiggy");
	f.add(l1);
	JButton  l2=new JButton ("zomato");
	f.add(l2);
	JButton  l3=new JButton ("Amazon");
	f.add(l3);
	JButton  l4=new JButton ("Filpkart");
	f.add(l4);
	JButton  l5=new JButton ("Meesho");
	f.add(l5);
	JButton  l6=new JButton ("myntra");
	f.add(l6);
	f.setLayout(new GridLayout(2,3));
	f.setSize(1000,800);
	f.setVisible(true);
}


	}


