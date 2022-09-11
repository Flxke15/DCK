import java.io.*;

public class JavaBinaryCopy {
    public static void main(String[] args){
        if(args.length > 2){
            System.out.println("Usage : java JavaBinaryCopy <source file> <destination file>");
        }else {
        try {
            int n;
            byte[] b = new byte[16];
            File f1 = new File(args[0]);
            File f2 = new File(args[1]);
            FileInputStream fin = new FileInputStream(f1);
            FileOutputStream fout = new FileOutputStream(f2);
            while((n = fin.read(b)) > 0){
                String data = new String(b ,0,n);
                byte[] i = data.getBytes();
                fout.write(i);
            }
            fout.close();
            fin.close();
        } catch (Exception e) {
            //System.out.println("1 Usage : java JavaBinaryCopy <source file> <destination file>"); 
            e.printStackTrace();
        }
    }
    }
}