import java.io.*;
import java.net.*;
public class TestSocket {
    public static void main(String[] args) {
        try{
                Socket socket = new Socket("127.0.0.1",80);
        }catch(UnknownHostException unknownEx){
            unknownEx.printStackTrace();
        }catch(IOException ioEx){
            ioEx.printStackTrace();
        }
    }
}
