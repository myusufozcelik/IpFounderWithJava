import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;


public class UrlClass {
	public static void main(String[] args) throws UnknownHostException{  
		
		try {
			URL url = new URL("http://www.google.com/filename");
			InetAddress ip = InetAddress.getByName("www.google.com");
		
			System.out.println("Host Name : "+ip.getHostName());
			System.out.println("IP Address : "+ip.getHostAddress());
			System.out.println("Protocol : "+url.getProtocol());
			System.out.println("Host Name : "+url.getHost());
			System.out.println("Port Number : "+url.getDefaultPort());
			System.out.println("File Name : "+url.getFile());
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
