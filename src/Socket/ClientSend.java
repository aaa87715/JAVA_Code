package Socket;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientSend {
    public static Socket socket;


    public  ClientSend(Socket socket){
        this.socket = socket;
    }
    

    public void sendMsg(String msg){
        PrintWriter sender = null;
        try {
            sender = new PrintWriter(socket.getOutputStream() ,true);
        } catch (IOException e) {
            if (sender != null) {
                sender.close();
            }
        }
        sender.println(msg);
    }
}
