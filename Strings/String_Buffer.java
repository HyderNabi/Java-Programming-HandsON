package Strings;

public class String_Buffer {

	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer("My Name is HYDER NABI");
		System.out.println(buffer);
		buffer.append(" and I am a Good Boy !!!");
		System.out.println(buffer);
		buffer.insert(buffer.indexOf("I")+1," KHAN");
		System.out.println(buffer);
		buffer.replace(buffer.indexOf("KHAN"), buffer.indexOf("KHAN")+"KHAH".length(), "KHAH");
		System.out.println(buffer);
		buffer.delete(buffer.indexOf("KHAH"), buffer.indexOf("KHAH") + "KHAH ".length());
		System.out.println(buffer);
		String myName = buffer.substring(buffer.indexOf("HYDER"), buffer.indexOf("HYDER")+"HYDER NABI".length());
		System.out.println(myName);
	}

}
