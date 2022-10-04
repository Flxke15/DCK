public class NoSpawn {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        long startTime = System.currentTimeMillis();
        for(int i=0; i<n; i++){
            
        }
        long stopTime = System.currentTimeMillis();
        System.out.println("Time usage : " + (stopTime - startTime) + " ms");
    }
}
