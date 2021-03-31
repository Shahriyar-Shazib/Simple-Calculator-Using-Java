import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener
{
	JLabel label;
	JButton Off,Ac,Back,m1,m2,Mc,Mr,Div,Add,Mul,Sub,One,Two,Three,Four,Five,Six,Seven,Eight,Nine,Zero,Point,Equal;
	JPanel panel;
	Color myColor;
	Font myFont;
	public Calculator()
	{
		super("Calculator");
		this.setSize(450, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myColor = new Color(0, 0, 0);

		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(myColor);

		label = new JLabel();
		label.setBounds(50,50,300,60);
		label.setBackground(Color.CYAN);
		label.setOpaque(true);
		panel.add(label);

		


		Off = new JButton("OFF");
		Off.setBounds(45, 150, 100, 40);
		Off.setBackground(Color.RED);
		Off.addActionListener(this);
		panel.add(Off);

		Ac = new JButton("AC");
		Ac.setBounds(180, 150, 100, 40);
		Ac.setBackground(Color.WHITE);
		Ac.addActionListener(this);
		panel.add(Ac);

		Back = new JButton("<");
		Back.setBounds(310, 150, 50, 40);
		Back.setBackground(Color.WHITE);
		Back.addActionListener(this);
		panel.add(Back);

		m1 = new JButton("M+");
		m1.setBounds(35, 220, 55, 55);
		m1.setBackground(Color.RED);
		panel.add(m1);
		
		m2 = new JButton("M-");
		m2.setBounds(35, 310, 55, 55);
		m2.setBackground(Color.RED);
		panel.add(m2);

		Mc = new JButton("MC");
		Mc.setBounds(35, 390, 55, 55);
		Mc.setBackground(Color.RED);
		panel.add(Mc);

		Mr = new JButton("MR");
		Mr.setBounds(35, 470, 55, 55);
		Mr.setBackground(Color.RED);
		panel.add(Mr);

		Seven = new JButton("7");
		Seven.setBounds(110, 220, 55, 55);
		Seven.setBackground(Color.WHITE);
		Seven.addActionListener(this);
		panel.add(Seven);

		Four = new JButton("4");
		Four.setBounds(110, 310, 55, 55);
		Four.setBackground(Color.WHITE);
		Four.addActionListener(this);
		panel.add(Four);

		//One = new JButton("1");
		One = new JButton("1");
		One.setBounds(110, 390, 55, 55);
		One.setBackground(Color.WHITE);
		One.addActionListener(this);
		panel.add(One);

		Zero = new JButton("0");
		Zero.setBounds(110, 470, 55, 55);
		Zero.setBackground(Color.WHITE);
		Zero.addActionListener(this);
		panel.add(Zero);

		Eight = new JButton("8");
		Eight.setBounds(185, 220, 55, 55);
		Eight.setBackground(Color.WHITE);
		Eight.addActionListener(this);
		panel.add(Eight);

		Five = new JButton("5");
		Five.setBounds(185, 310, 55, 55);
		Five.setBackground(Color.WHITE);
		Five.addActionListener(this);
		panel.add(Five);


		//Two = new JButton("2");
		Two = new JButton("2");
		Two.setBounds(185, 390, 55, 55);
		Two.setBackground(Color.WHITE);
		Two.addActionListener(this);
		panel.add(Two);

		Point = new JButton(".");
		Point.setBounds(185, 470, 55, 55);
		Point.setBackground(Color.WHITE);
		Point.addActionListener(this);
		panel.add(Point);

		Nine = new JButton("9");
		Nine.setBounds(260, 220, 55, 55);
		Nine.setBackground(Color.WHITE);
		Nine.addActionListener(this);
		panel.add(Nine);

		Six = new JButton("6");
		Six.setBounds(260, 310, 55, 55);
		Six.setBackground(Color.WHITE);
		Six.addActionListener(this);
		panel.add(Six);


		Three = new JButton("3");
		Three.setBounds(260, 390, 55, 55);
		Three.setBackground(Color.WHITE);
		Three.addActionListener(this);
		panel.add(Three);

		Equal = new JButton("=");
		Equal.setBounds(260, 470, 55, 55);
		Equal.setBackground(Color.WHITE);
		Equal.addActionListener(this);
		panel.add(Equal);

		Div = new JButton("/");
		Div.setBounds(335, 220, 55, 55);
		Div.setBackground(Color.GREEN);
		Div.addActionListener(this);
		panel.add(Div);

		Mul = new JButton("*");
		Mul.setBounds(335, 310, 55, 55);
		Mul.setBackground(Color.GREEN);
		Mul.addActionListener(this);
		panel.add(Mul);


		Sub = new JButton("-");
		Sub.setBounds(335, 390, 55, 55);
		Sub.setBackground(Color.GREEN);
		Sub.addActionListener(this);
		panel.add(Sub);

		//Add = new JButton("+");
		Add = new JButton("+");
		Add.setBounds(335, 470, 55, 55);
		Add.setBackground(Color.GREEN);
		Add.addActionListener(this);
		panel.add(Add);

		this.add(panel);

	}

	

	public void actionPerformed(ActionEvent ae)
	{
		String command = ae.getActionCommand();
		
		if(Off.getText().equals(command))
		{
			System.exit(0);		
		}

		else if(Ac.getText().equals(command))
		{
			label.setText("");
		}
		else if(One.getText().equals(command))
		{
			String text = label.getText() + One.getText();
			label.setText(text);
		}

		else if(Two.getText().equals(command))
		{
			String text = label.getText() + Two.getText();
			label.setText(text);
		}

		else if(Three.getText().equals(command))
		{
			String text = label.getText() + Three.getText();
			label.setText(text);
		}

		else if(Four.getText().equals(command))
		{
			String text = label.getText() + Four.getText();
			label.setText(text);
		}

		else if(Five.getText().equals(command))
		{
			String text = label.getText() + Five.getText();
			label.setText(text);
		}

		else if(
			Six.getText().equals(command))
		{
			String text = label.getText() + Six.getText();
			label.setText(text);
		}

		else if(Seven.getText().equals(command))
		{
			String text = label.getText() + Seven.getText();
			label.setText(text);
		}

		else if(Eight.getText().equals(command))
		{
			String text = label.getText() +Eight.getText();
			label.setText(text);
		}

		else if(Nine.getText().equals(command))
		{
			String text = label.getText() + Nine.getText();
			label.setText(text);
		}

		else if(Zero.getText().equals(command))
		{
			String text = label.getText() + Zero.getText();
			label.setText(text);
		}

		else if(Add.getText().equals(command))
		{
			String text = label.getText() + Add.getText();
			label.setText(text);
		}

		else if(Mul.getText().equals(command))
		{
			String text = label.getText() + Mul.getText();
			label.setText(text);
		}

		else if(Sub.getText().equals(command))
		{
			String text = label.getText() + Sub.getText();
			label.setText(text);
		}

		else if(Div.getText().equals(command))
		{
			String text = label.getText() + Div.getText();
			label.setText(text);
		}
		else if(Point.getText().equals(command))
		{
			String text = label.getText() + Point.getText();
			label.setText(text);
		}

		else if(Equal.getText().equals(command))
		{
			String text = label.getText() + Equal.getText();
			
               

			String r = label.getText();
			for (int i=0;i<r.length();i++)
			{
				if (r.charAt(i)=='+')
				{
					int a=r.indexOf("+");


					String value1=r.substring(0,a);
					String value2=r.substring(a+1,r.length());
			
					double v1=Double.parseDouble(value1);
					double v2=Double.parseDouble(value2);
					double result= v1+v2;
					label.setText(result+"");
				}
				else if(r.charAt(i)=='-')
				{
					int a=r.indexOf("-");
					String value1=r.substring(0,a);
					String value2=r.substring(a+1,r.length());
			
					double v1=Double.parseDouble(value1);
					double v2=Double.parseDouble(value2);
					double result= v1-v2;
					label.setText(result+"");
				}

				if (r.charAt(i)=='*')
				{
					int a=r.indexOf("*");


					String value1=r.substring(0,a);
					String value2=r.substring(a+1,r.length());
			
					double v1=Double.parseDouble(value1);
					double v2=Double.parseDouble(value2);
					double result= v1*v2;
					label.setText(result+"");
				}
				else if(r.charAt(i)=='/')
				{
					int a=r.indexOf("/");
					String value1=r.substring(0,a);
					String value2=r.substring(a+1,r.length());
			
					double v1=Double.parseDouble(value1);
					double v2=Double.parseDouble(value2);
					double result= v1/v2;
					label.setText(result+"");
				}
			}
					



					

		}

		
	
		else
		{

		}

	}
}