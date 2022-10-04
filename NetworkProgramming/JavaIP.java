import java.net.*;
import java.io.*;
public class JavaIP {
    public static void main(String[] args) {
        if(args.length != 1){
            System.out.println("Usage : java JavaIP <hostname/IP> ");
        }else {
            try {
                InetAddress ad = InetAddress.getByName(args[0]);
                System.out.println("Host : " + ad.getHostName());
                System.out.println("IP : "+ ad.getHostAddress());
            } catch (UnknownHostException e) {
                System.out.println("Error: unknownhost or IP address");
            }
        }
    }
}
