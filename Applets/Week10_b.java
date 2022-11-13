import java.applet.*;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import java.awt.*;
import java.awt.event.*;

import javax.swing.BoxLayout;
import javax.swing.JOptionPane;
public class Week10_b extends Applet implements ActionListener{
	TextField tf;
	Button bt[],clear;
	public static String labels[][] = {
			{"1","2","3","+"},{"4","5","6","-"},{"7","8","9","*"},{".","0","/","="}
	};
	ScriptEngineManager sem;
	ScriptEngine se; 
	Panel outside;
	Panel top,inside;
	String Expression = "";
	@Override 
	public void init()
	{
		sem = new ScriptEngineManager();
		se = sem.getEngineByName("JavaScript");
		outside = new Panel(new BorderLayout());
		tf = new TextField("hello",20);
		tf.setText(Expression);
		tf.setFont(new Font(Font.SANS_SERIF,Font.BOLD,30));
		inside = new Panel(new GridLayout(4,4));
		clear = new Button("Clear");
		clear.addActionListener(this);
		bt = new Button[16];
		int c=1;
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				bt[i] = new Button(labels[i][j]); 
				bt[i].setPreferredSize(new Dimension(50,100));
				bt[i].setFont(new Font(Font.SANS_SERIF,Font.BOLD,24));
				bt[i].addActionListener(this);
				inside.add(bt[i]);
			}
		}
		top = new Panel();
		top.add(tf);
		top.add(clear);
		outside.add(top,BorderLayout.PAGE_START);
		//outside.add(tf,BorderLayout.PAGE_START);
		outside.add(inside,BorderLayout.CENTER);
		add(outside);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand() == "=" && Expression != "") {
			try{
				Expression = se.eval(Expression).toString();
				tf.setText(Expression);
			}catch(ScriptException c) {}
		}else if(e.getActionCommand() == "=" && Expression == ""){
			Expression = "";
			tf.setText(Expression);
		}else if(e.getActionCommand() == "Clear"){
			Expression = "";
			tf.setText(Expression);
		}else{
			Expression+=e.getActionCommand();
			tf.setText(Expression);
		}
	}
	
	
	

}
//<applet code = Week10_b width = 500 height = 600></applet>