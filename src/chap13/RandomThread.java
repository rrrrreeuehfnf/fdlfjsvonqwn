package chap13;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RandomThread extends Thread {
	Container contentPane;
	boolean flag=false;
	
	public RandomThread(Container contentPane){
		this.contentPane = contentPane;
	}
	
	void finish() {
		falg = true;
	}
	
	public void run(){
		while(true) {
			int x = ((int)(Math.random()*contentPane.getWidth()));
			int y = ((int)(Math.random()*contentPane.getHeight()));
			JLabel label = new JLabel("Java");
			label.setSize(80,30);
			label.setLocation(x, y);
			contentPane.add(label);
			contentPane.repaint();
			try {
				Thread.sleep(300);
				if(flag==true){
					contentPane.removeAll();
					label = new JLabel("finish");
					label.setSize(80,30);
					label.setLocation(100, 100);
					label.setForeground(Color.RED);
					contentPane.add(label);
					contentPane.repaint();
					return;
				}
			}
			catch(InterruptedException e) {return;}
		}
	}
}
public class ThreadFinishFlagEx extends JFrame {
	RandomThread th;
	
	public ("ThreadFinishFlagEx ����");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Container c = getContentPane();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
