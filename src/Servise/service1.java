package Servise;

import java.io.IOException;
import java.net.Socket;

public class service1 implements Servise {

    @Override
    public  Socket getSoket() {
        try {
            return new Socket("localhost",4465);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }



}
