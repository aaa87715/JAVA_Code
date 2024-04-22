package Socket;
import java.io.IOException;
import java.net.Socket;

public class ClientSocket {

    public static Socket socket;

    public ClientSocket(Socket socket){
        this.socket = socket;
    }
    public void sendMsg(String msg){
        ClientSend  send= new ClientSend(socket);
        send.sendMsg(msg);
    }



}

