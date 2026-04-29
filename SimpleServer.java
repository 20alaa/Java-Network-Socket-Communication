package activity8;

import java.net.*;
import java.io.*;

public class SimpleServer {
	public static void main(String[] args) {
		try {
			ServerSocket serverSocket = new ServerSocket(6789);
	            
	        System.out.println("Server is waiting for client...");
	            
	        Socket socket = serverSocket.accept();
	            
	        System.out.println("Client connected!");
	            
	        BufferedReader BF= new BufferedReader(new InputStreamReader(socket.getInputStream()));
	            
	        PrintWriter PW= new PrintWriter(socket.getOutputStream(), true);
	            
	        String clientMessage = BF.readLine();
	        System.out.println("Message from Client: " + clientMessage);
	            
	        PW.println("Hello Client! I received your message.");
	            
	        socket.close();
	        serverSocket.close();
	        System.out.println("Server closed.");
	        } catch (Exception e) {
	        	System.out.println("Error: " + e.getMessage());
	        	}
		}
	}
	


