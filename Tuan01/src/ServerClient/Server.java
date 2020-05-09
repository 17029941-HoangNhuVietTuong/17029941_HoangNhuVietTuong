package ServerClient;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) throws IOException {
		System.out.println("Server is running... !");
		ServerSocket ss = new ServerSocket(5000);
		Socket sc = ss.accept();
		DataOutputStream dos = new DataOutputStream(sc.getOutputStream());
		DataInputStream dis = new DataInputStream(sc.getInputStream());
		dos.write(dis.read());
		System.out.println("Finished!");
		
		
	}
}
