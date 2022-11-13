package IO;
import java.io.*;
public class DeSerialization {

	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("D:\\data.txt");
			ObjectInputStream obj = new ObjectInputStream(fin);
			employee emp = (employee)obj.readObject();
			System.out.println(emp.empId);
			System.out.println(emp.name);
			System.out.println(emp.salary);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
