package chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	ServerSocket src;

	public static void main(String[] args) {
		Thread t = new ej();
		t.start();

	}

}

class ej extends Thread {
	public void run() {
		try {
			ServerSocket ssc = new ServerSocket(2015);
			Socket eu = ssc.accept();
			DataInputStream bc = new DataInputStream(eu.getInputStream());
			System.out.println(bc.readUTF());
			DataOutputStream bd = new DataOutputStream(eu.getOutputStream());
			System.out.println("sss");
			ssc.close();

		} catch (Exception b) {

		}

	}

}
