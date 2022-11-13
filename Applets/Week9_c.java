import java.applet.Applet;
import java.awt.*;
public class Week9_c extends Applet {
	String labels[];
	int Student_roll[];
	Font font; 
	@Override
	public void init()
	{
		font = new Font("sans ms",Font.BOLD,12);
		Student_roll = new int[2];
		labels = new String[2];
		//Student_roll[0] = Integer.parseInt(getParameter("male"));
		//Student_roll[1] = Integer.parseInt(getParameter("female"));
		//labels[0] = getParameter("maleLabel");
		//labels[1] = getParameter("femaleLabel");
		Student_roll[0] = 400;
		Student_roll[1] = 175;
		labels[0] = "MCA MALE";
		labels[1] = "MCA FEMALE";
	}
	@Override
	public void paint(Graphics o)
	{
		o.setFont(font);
		int x = 120;
		int y = 120;
		int width;
		int height =  100;
		o.drawString("BAR CHART TO DISPLAY THE NO OF MALE AND FEMALE STUDENTS ENROLLED IN MCA", 300, 30);
		for(int i=0;i<2;i++) {
			width = Student_roll[i];
			o.drawString(labels[i], x-75, y+50);
			o.setColor(Color.gray);
			o.fillRect(x,y,width,height);
			o.setColor(Color.black);
			o.drawString(Integer.toString(width) + " Students", x+width+10, y+50);
			y += height + 40;
		}
	}
}
/*
 <applet code = Week9_c width = 900 height = 600></applet>
  */
 