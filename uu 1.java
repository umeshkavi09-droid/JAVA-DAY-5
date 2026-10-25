package ROLEX;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
public class uu extends ss{
public static void main(String[] args) {
	JFrame f=new JFrame("students");
	JLabel l1=new JLabel("umesh");
	f.add(l1);
	JLabel l2=new JLabel("muksid");
	f.add(l2);
	JLabel l3=new JLabel("srinithyan");
	f.add(l3);
	JLabel l4=new JLabel("manikandan");
	f.add(l4);
	JLabel l5=new JLabel("pradeep");
	f.add(l5);
	f.setLayout(new FlowLayout());
	f.setSize(1000,800);
	f.setVisible(true);
}
}


