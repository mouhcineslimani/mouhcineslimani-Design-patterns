package org.mql.dp.abstract_factory;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; 

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel; 
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo; 

/*
 * Les look and feels : LAF 
 */
public class KnownUses  extends JFrame implements ActionListener{
	 
	private static final long serialVersionUID = 1L;
	private LookAndFeelInfo laf[];
	
	
	public KnownUses() {
		extractLookAndFeels();
		ex01(); 
 	}
	
	private void extractLookAndFeels() {
		laf = UIManager.getInstalledLookAndFeels();
		for (LookAndFeelInfo lookAndFeelInfo : laf) {
			System.out.println(lookAndFeelInfo.getName()+" => Concrete Factory : "+lookAndFeelInfo.getClassName());
		}
	}
	
	private void ex01() { 
		JPanel p = new JPanel();
		p.add(new JLabel("Look and feel : "));
		for (LookAndFeelInfo f : laf) {
			JButton b = new JButton(f.getName());
			b.setName(f.getClassName());
			b.addActionListener(this);
			p.add(b); 
		}
		setContentPane(p);
		pack();
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private void changeLookAndFeel(String factoryName) {
		try {
			UIManager.setLookAndFeel(factoryName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SwingUtilities.updateComponentTreeUI(this);
	}
	
	
	public static void main(String[] args) {
		new KnownUses();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton source = (JButton) e.getSource();
		changeLookAndFeel(source.getName());
	}
}
