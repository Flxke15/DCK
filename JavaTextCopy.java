import java.io.*;

public class JavaTextCopy {
   public static void main(String[] args) {
    if(args.length > 2){
        System.out.println("Usage : java JavaBinaryCopy <source file> <destination file>");
    }else {
    try {
        String data;
       File f1 = new File(args[0]);
       File f2 = new File(args[1]);
        
       BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(f1)));
       FileOutputStream fout = new FileOutputStream(f2);
       PrintWriter pout = new PrintWriter(fout);
       while((data = br.readLine()) != null){
        pout.println(data);
        pout.flush();
       
       }
       fout.close();
    } catch (Exception e) {
        System.out.println("Usage : java JavaBinaryCopy <source file> <destination file>");  
    }
}
   }
}
