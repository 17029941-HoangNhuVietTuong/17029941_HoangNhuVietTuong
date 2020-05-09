package ServerClient;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket sc = new Socket("localhost",5000);

		String str = "This is data !";
	   
		DataOutputStream dos = new DataOutputStream(sc.getOutputStream());
		DataInputStream dis = new DataInputStream(sc.getInputStream());
		dos.writeUTF(str);
		   System.out.println(str);
	}
}
