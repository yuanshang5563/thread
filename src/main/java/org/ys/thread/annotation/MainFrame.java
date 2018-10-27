package org.ys.thread.annotation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MainFrame {
	@ActionListenerFor(listener=OkListener.class)
	private JButton okButton = new JButton("ok");
	@ActionListenerFor(listener=CancelListener.class)
	JButton cancelButton = new JButton("cancel");
	
	private void init() throws Exception {
		JFrame jframe = new JFrame();
		jframe.setBounds(100, 100, 300, 300);
		JPanel jpanel = new JPanel();
		jpanel.add(okButton);
		jpanel.add(cancelButton);
		
		new AnnotationProcessor().processAnnotation(this);
		
		jframe.add(jpanel);
		jframe.addWindowListener(new MyCloseListener());
		jframe.pack();
		jframe.setVisible(true);
	}
	
	public static void main(String[] args) throws Exception {
		new MainFrame().init();
	}
}

class MyCloseListener extends WindowAdapter{

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
}	

class OkListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "单击了OK");
	}
}

class CancelListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "单击了Cancel");
	}
}
