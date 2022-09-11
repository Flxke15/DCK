import java.util.concurrent.*;
import java.io.*;

public class FileThreadPool implements Runnable {
    int id;

    public FileThreadPool(int id) {
        this.id = id;
    }

    public void run() {
        int buffer[] = new int[50000000];
        try {
            Thread.sleep(2000);
            System.out.println(id + " -> " + id * id);
        } catch (Exception e) {
        }
    }

    public static void main(String[] args) {
        try {
            int x;
            String msg;
            File input = new File(args[0]);
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(input)));
            ExecutorService es = Executors.newFixedThreadPool(3);
            while ((msg = br.readLine()) != null) {
                x = Integer.parseInt(msg);
                FileThreadPool c = new FileThreadPool(x);
                es.execute(c);
            }
            es.shutdown();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}