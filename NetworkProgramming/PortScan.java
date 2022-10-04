import java.net.*;
import java.io.*;
public class PortScan {
    public static void main(String[] args) {
        if(args.length != 1){
            System.out.println("Usage : java PortScan <hostname/IP>");
        }else{
            for(int i=70; i<=100; i++){
                try {
                    Socket socket = new Socket();
                    socket.connect(new InetSocketAddress(args[0],i), 1000);
                    System.out.println("Port "+ i +" : open");
                    socket.close();
                } catch (UnknownHostException e) {
                    System.out.println("Error: unknownhost or IP address");
                } catch (IOException r){
                   
                }
            }
        }
       
    }
}
