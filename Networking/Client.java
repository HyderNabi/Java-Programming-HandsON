import java.net.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
class UserInterfaceI extends JFrame{
	JPanel panelUp,panelDown;
	JTextField input;
	JButton send;
	public UserInterfaceI()
	{
		this.setSize(500, 700);
		this.setTitle("CLIENT");
		this.setLayout(new BorderLayout());
		
		
		panelUp = new JPanel(new GridLayout(0, 1));
		panelDown = new JPanel();
		
		
		
		input = new JTextField(20);
		send = new JButton("SEND");
		
		
		panelDown.add(input);
		panelDown.add(send);
		
	
		
		
		JScrollPane sp = new JScrollPane(panelUp);
		sp.setPreferredSize(new Dimension(500, 500));
		
		this.add(sp,BorderLayout.CENTER);
		this.add(panelDown,BorderLayout.PAGE_END);
		this.setVisible(true);
	}
	
	public Insets getInsets()
	{
		return new Insets(0,30,10,30);
	}
}




class TheClient implements Runnable
{
	public  int buffer_size = 1024;
	public  int Client_Port;
	public  int Server_Port;
	public  byte[] buffer1,buffer2;
	public  DatagramSocket socket;
	public  DatagramPacket packet1,packet2;
	public  Thread thread;
	public  UserInterfaceI ui;
	
	public TheClient(String name,DatagramSocket socket,int c,int s,UserInterfaceI ui) throws Exception
	{
		buffer1 = new byte[buffer_size];
		buffer2 = new byte[buffer_size];
		this.socket = socket; 
		this.Client_Port = c;
		this.Server_Port = s;
		this.ui = ui;
		this.thread = new Thread(this,name);
		thread.start();
	}

	@Override
	public void run() {
		try {
			if(thread.getName() == "SEND")
				Send();
			else if(thread.getName() == "RECIEVE")
				Recieve();
			}catch(Exception e)
			{}
		if(socket.isClosed())
		{
			if(thread.getName() == "SEND")
				System.out.println("Socket Closed !!! : SENDING THREAD");
			else
				System.out.println("Socket Closed !!! : RECIEVING THREAD");
		}
		
	}
	
		public void Send() throws Exception
		{
			packet1 = new DatagramPacket(buffer1, buffer_size, InetAddress.getLocalHost(),Server_Port);
			ui.send.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					String msg = ui.input.getText();
					ui.input.setText("");
					if(!msg.isEmpty())
					{
						for(int i=0;i<msg.length();i++) {
							buffer1[i] = (byte)msg.charAt(i);
						}
						
						JLabel lab = new JLabel(msg,SwingConstants.RIGHT);
						lab.setFont(new Font("Courier",Font.BOLD,20));
						ui.panelUp.add(lab);
						ui.revalidate();
						
						packet1.setLength(msg.length());
						try {
							socket.send(packet1);
						} catch (IOException e1) {}
					}
				}
			});
		}
		
		public void Recieve() throws Exception
		{
			while(true) {
				packet2 = new DatagramPacket(buffer2, buffer2.length);
				socket.receive(packet2);
				int length = packet2.getLength();
				
				JLabel lab = new JLabel(new String(packet2.getData(),0,length),SwingConstants.LEFT);
				lab.setFont(new Font("Courier",Font.BOLD,20));
				
				ui.panelUp.add(lab);
				ui.revalidate();
			}
		}
		
	
}
public class Client {
	public static void main(String args[]) throws Exception {
		int Client_Port = 998;
		int Server_Port = 903;
		UserInterfaceI uf = new UserInterfaceI();
		DatagramSocket socket = new DatagramSocket(Client_Port);
		TheClient client1 = new TheClient("SEND", socket,Client_Port,Server_Port,uf);
		TheClient client2 = new TheClient("RECIEVE",socket,Client_Port,Server_Port,uf);
	}
	
}
