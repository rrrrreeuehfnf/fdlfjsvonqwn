import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;


public class Client {

	public static void main(String[] args) {
		try {
			Socket a= new Socket("200.1.4.214",2015);
			DataOutputStream bd = new DataOutputStream(a.getOutputStream());
			System.out.println("±è¿µ¼ö¹Ùº¸¶Ë¸ÛÃ»ÀÌ");
			DataInputStream bc = new DataInputStream(a.getInputStream());
			System.out.println(bc.readUTF());

			
		} catch (UnknownHostException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
