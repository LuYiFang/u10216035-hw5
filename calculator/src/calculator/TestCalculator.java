package calculator;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class TestCalculator extends JFrame implements ActionListener {
	JButton bt1 = new JButton("1");
	JButton bt2 = new JButton("2");
	JButton bt3 = new JButton("3");
	JButton bt4 = new JButton("4");
	JButton bt5 = new JButton("5");
	JButton bt6 = new JButton("6");
	JButton bt7 = new JButton("7");
	JButton bt8 = new JButton("8");
	JButton bt9 = new JButton("9");
	JButton bt0 = new JButton("0");
	JButton btc = new JButton("C");
	JButton btplus = new JButton("+");
	JButton btminus = new JButton("-");
	JButton bttimes = new JButton("x");
	JButton btdivide = new JButton("/");
	JButton btpoint = new JButton(".");
	JTextField tf = new JTextField();
	
	bt1.addActionListener(this);
	bt2.addActionListener(this);
	bt3.addActionListener(this);
	bt4.addActionListener(this);
	bt5.addActionListener(this);
	bt6.addActionListener(this);
	bt7.addActionListener(this);
	bt8.addActionListener(this);
	bt9.addActionListener(this);
	bt0.addActionListener(this);
	btpoint.addActionListener(this);
	btplus.addActionListener(this);
	btminus.addActionListener(this);
	bttimes.addActionListener(this);
	btdivide.addActionListener(this);
	
	@Override
	public void actionPerformed(ActionEvent e){
		String input = tf.getText();
		
		if(e.getSource() == bt1){
			tf.setText(input + "1");
		} 
		}
	}

}
