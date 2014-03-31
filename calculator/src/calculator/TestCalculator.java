package calculator;
import java.awt.*;
import java.awt.event.*;

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
	JButton btenter = new JButton("Enter");
	JTextField tf = new JTextField("Enter passwords",12);
	
	Double num = 0.0;
	double total = 0.0;
	String passwords = "0000";
	
	public TestCalculator(){
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(4,3,10,10));
		p1.add(bt7);
		p1.add(bt8);
		p1.add(bt9);
		p1.add(bt4);
		p1.add(bt5);
		p1.add(bt6);
		p1.add(bt1);
		p1.add(bt2);
		p1.add(bt3);
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
		p2.setLayout(new GridLayout(2,1));
		p2.add(btenter);
		p2.add(btequal);
		
		JPanel p4 = new JPanel();
		p4.add(tf);
			
			add(p4,BorderLayout.NORTH);
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
			btenter.addActionListener(this);
	
	}
	@Override
	public void actionPerformed(ActionEvent e){
		String input = tf.getText();
		int operation = 0;
		boolean first = true;
		
		if(e.getSource() == btenter)
		passwords = input;
		
		
		
	if(input == "0000"){
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
			total = 0;
			first = true;
			tf.setText("");
		}else if(e.getSource() == btplus){
			if(first){
				num = Double.parseDouble(input);
				total = num;
			}else {
				total += num;
			}
			operation = 0;
			first = false;
			System.out.print("total = " + total + "num = " + num + operation);
			tf.setText("");
		}else if(e.getSource() == btminus){
			num = Double.parseDouble(input);
			if(first){
				total = num;
			}else{
				total -= num;
			}
			operation = 1;
			first = false;
			System.out.print("total = " + total + "num = " + num + operation);
			tf.setText("");
		}else if(e.getSource() == bttimes){
			num = Double.parseDouble(input);
			if(first){
				total = num;
			}else{
				total *= num; 
			}
			operation = 2;
			first = false;
			System.out.print("total = " + total + "num = " + num + operation);
			tf.setText("");
		}else if(e.getSource() == btdivide){
			if(first){
				num = Double.parseDouble(input);
				total = num;
			}
			operation = 3;
			first = false;
			num = Double.parseDouble(input);
			total /= num;
			System.out.print("total = " + total + "num = " + num + operation);
			tf.setText("");
		}else if(e.getSource() == btequal){
			num = Double.parseDouble(input);
			if(operation == 0){
				total += num;
			}else if(operation == 1){
				total -= num;
			}else if(operation == 2){
				total *= num;
			}else if(operation == 3){
				total /= num;
			}
			tf.setText("" + total);
			System.out.print("total = " + total + "num = " + num + operation);
		}
	}else{
		tf.setText("Wrong passwords");
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


