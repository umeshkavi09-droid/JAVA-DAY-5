package ROLEX;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class PC extends ss{
	public static void main(String[] args) {
		JFrame f= new JFrame("HELLO");
		JCheckBox checkbox = new JCheckBox("I Agree");
		checkbox.setBounds(30,60,100,20);
		f.add(checkbox);
		String[]courses = {"java","python","C++","HTML"};
		JList<String>courseList = new JList<>(courses);
		JScrollPane pl = new JScrollPane(courseList);
		pl.setBounds(340,110,100,60);
		f.add(pl);
		JRadioButton male = new JRadioButton("Male");
		male.setBounds(340,70,200,30);
		JRadioButton female = new JRadioButton("Female");
		female.setBounds(440,70,200,30);
		f.add(male);
		f.add(female);
		JTextArea textarea = new JTextArea("Enter Description here");
		JScrollPane scrollpane = new JScrollPane(textarea);
		scrollpane.setBounds(30,90,200,200);
		f.add(scrollpane);
		DefaultMutableTreeNode root = new DefaultMutableTreeNode("Languages");
		DefaultMutableTreeNode java = new DefaultMutableTreeNode("java");
		DefaultMutableTreeNode python = new DefaultMutableTreeNode("python");
		root.add(java);
		DefaultMutableTreeNode sw = new DefaultMutableTreeNode("swing");
		java.add(sw);
		root.add(python);
		JTree tree = new JTree(root);
		JScrollPane treeScroll = new JScrollPane(tree);
		treeScroll.setBounds(650,100,150,100);
		f.add(treeScroll);
		JButton b = new JButton("click me");
		b.setBounds(350,500,200,20);
		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JDialog d = new JDialog(f,"hello",true);
				JLabel l = new JLabel("UMESH");
				l.setBounds(30,30,50,10);
				d.add(l);
				d.setSize(200,100);
				d.setLayout(null);
				d.setVisible(true);
				
			}});
		f.add(b);
		
		f.setLayout(null);
		f.setSize(1000,800);
		f.setVisible(true);
		
		
		
}

}