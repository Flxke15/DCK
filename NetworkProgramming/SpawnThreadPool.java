import java.util.concurrent.*;

public class SpawnThreadPool implements Runnable{
   
    public void run(){

    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        long startTime = System.currentTimeMillis();

        ExecutorService executor = Executors.newSingleThreadExecutor();
        for( int i=0; i<n; i++){
            SpawnThreadPool s = new SpawnThreadPool();
            executor.execute(s);
        }
        
        executor.shutdown();
        while(!executor.isTerminated()){}
        long stopTime = System.currentTimeMillis();
        System.out.println("Time usage : " + (stopTime - startTime) + (" ms"));

    }
}
