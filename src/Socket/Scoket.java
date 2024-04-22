package Socket;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

import File.FileCreate;

public class Scoket {
    private static final int  port = 4465;
    public static ServerSocket sockt;

    public static void acceptMsg(){



    }
    public static void run(){



        while(true){

            try {
                sockt = new ServerSocket(port);

                Socket clientSocket = sockt.accept();

                InetAddress inetAddress = clientSocket.getInetAddress();
                FileCreate.prepareMsg(inetAddress.getHostAddress(),inetAddress.getHostName());
                FileCreate.writeFile();

            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    } 
   


}
