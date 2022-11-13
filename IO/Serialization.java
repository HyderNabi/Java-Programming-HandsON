package IO;
import java.io.*;
class employee implements Serializable{
	int empId;
	double salary;
	String name;
	public employee(int id,double s,String name) {
		this.empId = id;
		this.salary  = s;
		this.name = name;
	}
}
public class Serialization {

	public static void main(String[] args) {
		try {
			FileOutputStream fout = new FileOutputStream("D:\\data.txt");
			ObjectOutputStream obj = new ObjectOutputStream(fout);
			obj.writeObject(new employee(102,25000,"Hyder Nabi"));
			
			obj.flush();
			obj.close();
			fout.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
