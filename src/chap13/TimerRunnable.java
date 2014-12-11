package chap13;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class TimerRunnable implements Runnable {
	JLabel timerLabel;
	
	public TimerRunnable(JLabel timerLaber){
		this.timerLabel = timerLabel;
	}
	public void run(){
		int n=0;
		while(true){
			timerLabel.setText(Integer.toString(n));
			n++;
			try {
				Thread.sleep(1000);
			
			}
			catch(InterruptedException e){
				return;
			}
		}
	}
public class ThreadInterruptEx extends JFrame {
	Thread th;
	
	public ThreadInterruptEx(){
		setTitle("ThreadInterruptEx ¿¹Á¦");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel timerLaber = new JLabel();
		timerLaber.setFont(new Font("Gothic",Font.ITALIC,80));
		
		TimerRunnable runnable = new TimerRunnable(timerLabel);
		th = new Thread(runnable);
		c.add(timerLabel);
		
		JButton btn = new JButton("kill Timer");
		btn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				th.interrupt();
				JButton btn = (JButton)e.getSource();
				btn.setEnabled(false);
			}
		});
		c.add(btn);
		setSize(300,150);
		setVisible(true);
		
		th.start();
	}
}
	public static void main(String[] args) {
		new ThreadInterruptEx();

	}

}
