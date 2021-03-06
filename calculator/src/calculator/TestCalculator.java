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
	
	JTextField tf = new JTextField("",12);
	
	double num = 0;
	double total = 0.0;
	int operator = 4;
	int count = 0;

	
	public TestCalculator(){
		JPanel p1 = new JPanel();
		p1.add(btequal);
		
		JPanel p3 = new JPanel();
		p3.add(tf);
		
		JPanel p2 = new JPanel();
		p2.setLayout(new GridLayout(4,4,50,30));
		p2.add(bt7);
		p2.add(bt8);
		p2.add(bt9);
		p2.add(bttimes);
		p2.add(bt4);
		p2.add(bt5);
		p2.add(bt6);
		p2.add(btdivide);
		p2.add(bt1);
		p2.add(bt2);
		p2.add(bt3);
		p2.add(btminus);
		p2.add(btc);
		p2.add(bt0);
		p2.add(btpoint);
		p2.add(btplus);
			
		add(p1,BorderLayout.EAST);
		add(p2,BorderLayout.SOUTH);
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
			total = 0;
			count = 0;
			tf.setText("");
		}else if(e.getSource() == btplus){
			num = Double.parseDouble(input);
			if(count == 0){
				total = num;
			}else {
				switch(operator){
				case 0:
					total += num;
					break;
				case 1:	
					total -= num;
					break;
				case 2:
					total *= num; 
					break;
				case 3:
					total /= num;
					break;
				}
				
			}
			operator = 0;
			count++;
			System.out.print("total = " + total + "num = " + num + "" +  operator);
			tf.setText("");
		}else if(e.getSource() == btminus){
			num = Double.parseDouble(input);
			if(count == 0){
				total = num;
			}else{
				switch(operator){
				case 0:
					total += num;
					break;
				case 1:	
					total -= num;
					break;
				case 2:
					total *= num; 
					break;
				case 3:
					total /= num;
					break;
				}
			}	
			operator = 1;
			count++;
			System.out.print("total = " + total);
			tf.setText("");
		}else if(e.getSource() == bttimes){
			num = Double.parseDouble(input);
			if(count == 0){
				total = num;
			}else{
				switch(operator){
				case 0:
					total += num;
					break;
				case 1:	
					total -= num;
					break;
				case 2:
					total *= num; 
					break;
				case 3:
					total /= num;
					break;
				}
			}
			operator = 2;
			count++;
			tf.setText("");
		}else if(e.getSource() == btdivide){
			num = Double.parseDouble(input);
			if(count == 0){
				total = num;
			}else{
				switch(operator){
				case 0:
					total += num;
					break;
				case 1:	
					total -= num;
					break;
				case 2:
					total *= num; 
					break;
				case 3:
					total /= num;
					break;
				}
			}
			operator = 3;
			count++;
			tf.setText("");
		}else if(e.getSource() == btequal){
			num = Double.parseDouble(input);
		
			if(operator == 0){
				total += num;
			}else if(operator == 1){
				total -= num;
			}else if(operator == 2){
				total *= num;
			}else if(operator == 3){
				total /= num;
			}else{
				total = num;
			}
			tf.setText("" + total);
			System.out.print("total = " + total );
		} 
	}
	public static void main(String[] args){
		
		Passwords f1 = new Passwords();
		f1.setSize(300,80);
		f1.setVisible(true);
		f1.setTitle("Passwords");
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f1.setLocationRelativeTo(null);	
	}
}

class Passwords extends JFrame implements ActionListener{
	JButton btenter = new JButton("Enter");
	JTextField tf1 = new JTextField("",4);
	JFrame ff = new JFrame();
	String passwords = "0000";
	int pass = 0;
	
	public Passwords(){
		JPanel pp = new JPanel();
		pp.add(new JLabel("Enter passwords"));
		pp.add(tf1);
		pp.add(btenter);
		
		add(pp,BorderLayout.CENTER);
		btenter.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e){
		
		if(tf1.getText().equals(passwords)){
			TestCalculator frame = new TestCalculator();
			frame.setSize(700,400);
			frame.setTitle("Calculator");
			frame.setVisible(true);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setLocationRelativeTo(null);
		}else{
			tf1.setText("Wrong Passwords");
		}
	}
}


