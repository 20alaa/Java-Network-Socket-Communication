package activity8;

import java.net.*;
import java.io.*;

public class SimpleClient {
	public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 6789);
            
            System.out.println("Connected to server");
            
            PrintWriter PW = new PrintWriter(socket.getOutputStream(), true);
            
            BufferedReader BF = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            
            BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
            
            System.out.print("Enter a message to send to the server: ");
            
            String Message = read.readLine();
            PW.println(Message);
            
            String serverResponse = BF.readLine();
            System.out.println("Response from Server: " + serverResponse);
            
            socket.close();
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}


