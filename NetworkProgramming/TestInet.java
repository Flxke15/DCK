import java.net.*;
public class TestInet{
    public static void main(String[] args){
        try {
            InetAddress ad = InetAddress.getByName("www.facebook.com");
            System.out.println("IP = " + ad.getHostAddress());
        } catch (Exception e) {
            e.printStackTrace();
            // TODO: handle exception
        }
    }
}