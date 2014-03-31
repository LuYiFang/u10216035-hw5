package calculator;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class TestCalculator extends JFrame implements ActionListener {
	private JButton bt1 = new JButton("1");
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
	JButton btequal = new JButton("=");
	JButton btplus = new JButton("+");
	JButton btminus = new JButton("-");
	JButton bttimes = new JButton("x");
	JButton btdivide = new JButton("/");
	JButton btpoint = new JButton(".");
	JTextField tf = new JTextField();
	
	Double num = 0.0;
	double total = 0.0;
	
	public TestCalculator(){
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(4,3,10,10));
		
		for(int i = 9;i > 0;i--){
			p1.add(new JButton("" + i));
		}	
		p1.add(btc);
		p1.add(bt0);
		p1.add(btpoint);
		
		JPanel p3 = new JPanel();
		p3.setLayout(new GridLayout(4,1,10,10));
		p3.add(bttimes);
		p3.add(btdivide);
		p3.add(btminus);
		p3.add(btplus);
			
		JPanel p2 = new JPanel();
		p2.add(btequal);
			
			add(tf,BorderLayout.NORTH);
			add(p1,BorderLayout.WEST);
			add(p2,BorderLayout.EAST);
			add(p3,BorderLayout.CENTER);
	
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
			btequal.addActionListener(this);
			btc.addActionListener(this);
	
	}
	@Override
	public void actionPerformed(ActionEvent e){
		String input = tf.getText();
		
		
		if(e.getSource() == bt1){
			tf.setText(input + "1");
		}else if(e.getSource() == bt2){
			tf.setText(input + "2");
		}else if(e.getSource() == bt3){
			tf.setText(input + "3");
		}else if(e.getSource() == bt4){
			tf.setText(input + "4");
		}else if(e.getSource() == bt5){
			tf.setText(input + "5");
		}else if(e.getSource() == bt6){
			tf.setText(input + "6");
		}else if(e.getSource() == bt7){
			tf.setText(input + "7");
		}else if(e.getSource() == bt8){
			tf.setText(input + "8");
		}else if(e.getSource() == bt9){
			tf.setText(input + "9");
		}else if(e.getSource() == bt0){
			tf.setText(input + "0");
		}else if(e.getSource() == btpoint){
			tf.setText(input + ".");
		}else if(e.getSource() == btc){
			tf.setText("");
		}else if(e.getSource() == btplus){
			num = Double.parseDouble(input);
			total += num;
			tf.setText("");
		}else if(e.getSource() == btminus){
			num = Double.parseDouble(input);
			total -= num;
			tf.setText("");
		}else if(e.getSource() == bttimes){
			num = Double.parseDouble(input);
			total *= num; 
			tf.setText("");
		}else if(e.getSource() == btdivide){
			num = Double.parseDouble(input);
			total /= num;
			tf.setText("");
		}else if(e.getSource() == btequal){
			tf.setText("" + total);
		}
	} 
	public static void main(String[] args){
		TestCalculator frame = new TestCalculator();
		frame.setSize(500,400);
		frame.setTitle("Calculator");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
	}
}


