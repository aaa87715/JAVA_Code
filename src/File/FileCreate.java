package File;
import java.io.*;

public class FileCreate {
    public static final String  PATH="C:\\Users\\20230226\\IdeaProjects\\service\\out\\artifacts\\service_jar\\loggg.txt";
    private static String clientMsg ;
    public static void writeFile(){

        BufferedWriter buffWri = null;
        try {
            buffWri = new BufferedWriter(new FileWriter(PATH));

            buffWri.write(clientMsg);
            buffWri.flush();
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file:");
            e.printStackTrace();
        } finally {
            // 確保關閉 BufferedWriter
            if (buffWri != null) {
                try {
                    buffWri.close();
                } catch (IOException e) {
                    // 處理關閉錯誤
                    System.err.println("An error occurred while closing the BufferedWriter:");
                    e.printStackTrace();
                }
            }
        }

    }
    public  static void  prepareMsg(String... Msg){
        
        StringBuffer sb = new StringBuffer();
        for (String s : Msg) {
            sb.append(s);
        }
        clientMsg =  sb.toString();
    }
}
