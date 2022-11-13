import java.applet.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.JOptionPane;
class TicTacToe extends Canvas
{
	public String Cross_OR_Not;
	Font font;
	static int Whos_Turn = 0 ;
	static int flushCount = 0;
	static int Rounds = 1;
	TicTacToe()
	{
		font = new Font("Casteller",Font.BOLD,40);
		setBackground(Color.DARK_GRAY);
		setForeground(Color.WHITE);
		Cross_OR_Not = "";
		addMouseListener(new MouseEvents());
	}
	public void paint(Graphics g)
	{
		setFont(font);
		g.drawString(Cross_OR_Not,getWidth()/2-10,getHeight()/2+10);
	}
	
	class MouseEvents extends MouseAdapter
	{
		@Override
		public void mouseClicked(MouseEvent me)
		{
			
			if(Cross_OR_Not.isEmpty()) {
				
				if(Whos_Turn == 0) {
					Cross_OR_Not = "X";
					Whos_Turn = 1;
					flushCount++;
				}else {
					Cross_OR_Not = "0";
					Whos_Turn = 0;
					flushCount++;
				}
				repaint();
			}
		}
	}
}
public class Week10_a extends Applet{
	String Player_Name[];
	TicTacToe cell[];
	Font f;
	@Override 
	public void init()
	{
		f = new Font("Ariel",Font.BOLD,15);
		setBackground(Color.LIGHT_GRAY);
		setLayout(new GridLayout(3,3,10,10));
		Player_Name = new String[2];
		Player_Name[0] = JOptionPane.showInputDialog("ENTER NAME OF FIRST PLAYER.");
		Player_Name[1] = JOptionPane.showInputDialog("ENTER NAME OF SECOND PLAYER.");
		cell = new TicTacToe[9];
		for(int i=0;i<9;i++)
		{
			cell[i] = new TicTacToe();
			add(cell[i]);
		}
		addMouseListener(new flushEvent());
	}
	
	@Override 
	public void paint(Graphics o)
	{
		setFont(f);
		o.drawString("::: TWO PLAYER TIC TAC TOE :::",(getWidth()/2)-100,20);
		o.drawString("NEXT TURN : "+Player_Name[TicTacToe.Whos_Turn], 30, 40);
		o.drawString("LEVEL : "+TicTacToe.Rounds, 30, 60);
		o.drawString("DOUBLE CLICK THE MOUSE OUTSIDE THE TABLE TO RESET THE GAME ...", 30, 80);
	}
	
	public Insets getInsets()
	{
		return new Insets(250, 100, 10, 100);
	}
	class flushEvent extends MouseAdapter
	{
		public void mouseClicked(MouseEvent me)
		{
			if(me.getClickCount() == 2)
			{
				int count = 0;
				for(int i=0;i<cell.length;i++)
				{
					if(cell[i].Cross_OR_Not != "") {
						cell[i].Cross_OR_Not = "";
						cell[i].repaint();
						count++;
					}
					
				}
				if(count!=0)
					TicTacToe.Rounds++;
			}
		}
	}
}
//<applet code = Week10_a width = 500 height = 600></applet>