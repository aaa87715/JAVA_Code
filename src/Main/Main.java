package Main;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Servise.Servise;
import Socket.ClientSocket;
import Socket.SocketType;
import Socket.SoketFactory;

public class Main {
    public static void main(String[] args) {
        run();
    }
    public static void run(){
    	
    	Servise service = SoketFactory.getService(SocketType.SERVICE1);
    	ClientSocket  clientSoket = new ClientSocket(service.getSoket());
    	
    	while(true){
    		System.out.println("Please enter your message.");
    		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    		
    		String input = "defalt";
    		try {
    			input = reader.readLine();
    			
    		} catch (IOException e) {
    			throw new RuntimeException(e);
    		}
    		clientSoket.sendMsg(input);
    	}
    	
    }
}
	
	
