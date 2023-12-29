import java.io.*;

class Account implements Serializable 
{
String username="Deep";
transient String password="Pass@123";
}

class CostumizedSerializationDemo99
{
	public static void main(String[] args) throws Exception
	{
	Account a1=new Account();
	System.out.println(a1.username+"---"+a1.password);
		
	FileOutputStream fos =new FileOutputStream("abc.ser");
	ObjectOutputStream oos = new ObjectOutputStream(fos);
	oos.writeObject(a1);

	
	FileInputStream fis =new FileInputStream("abc.ser");
	ObjectInputStream ois = new ObjectInputStream(fis);
	Account a2=(Account)ois.readObject();	
	
	System.out.println(a2.username+"---"+a2.password);	
	}
}