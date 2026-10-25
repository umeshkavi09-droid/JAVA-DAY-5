package ROLEX;
import java.awt.GridLayout;
import javax.swing.*;

public class my extends ss{
public static void main(String[] args) {
	JFrame f=new JFrame("hiii");
	JPanel p=new JPanel();
	p.setLayout(new BoxLayout(p,BoxLayout.X_AXIS));
	JButton  l1=new JButton ("File");
	p.add(l1);
	JButton  l2=new JButton ("Folder");
	p.add(l2);
	JButton  l3=new JButton ("Menu");
	p.add(l3);
	JButton  l4=new JButton ("Edit");
	p.add(l4);
	JButton  l5=new JButton ("Animation");
	p.add(l5);
	JButton  l6=new JButton ("new");
	p.add(l6);
	f.add(p);
	f.setSize(1000,800);
	f.setVisible(true);
}

	}


