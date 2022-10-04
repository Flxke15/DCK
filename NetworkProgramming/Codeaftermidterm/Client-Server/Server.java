import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        ServerSocket servSocket = null;

        try {
            servSocket = new ServerSocket(10000);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

        while(true){
            try {
                Socket s = servSocket.accept();
                BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
                PrintWriter pw = new PrintWriter(s.getOutputStream());
                String msg = br.readLine();

                pw.println("Welcome");
                pw.flush();
                pw.close();
                br.close();
                s.close();
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
}
