package Socket;
import java.util.HashMap;
import java.util.Map;

import Servise.Servise;
import Servise.service1;

public class SoketFactory {



    public static final Map<SocketType , Servise> soketTypeMap = init();

    static Map<SocketType, Servise> init() {
        Map<SocketType, Servise> map = new HashMap<SocketType, Servise>();
        map.put(SocketType.SERVICE1, new service1());

        return map;
    }

    public static Servise getService(SocketType Type){
      return  soketTypeMap.get(Type);
    }



}
   