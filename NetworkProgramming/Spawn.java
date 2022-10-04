public class Spawn implements Runnable {
    
    public void run(){}

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        long startTime = System.currentTimeMillis();
        for( int i=0; i<n; i++){
            Spawn s = new Spawn();
            Thread t = new Thread(s);
            t.start();
            try {
                t.join();
            } catch (Exception e) {
                //TODO: handle exception
            }
        }

        long stopTime = System.currentTimeMillis();
            System.out.println("Time usage : " + (stopTime - startTime) + " ms");
    }
}
