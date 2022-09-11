import java.io.*;
import java.util.concurrent.*;
import java.lang.module.ResolutionException;

public class CPU {
    String pName = "--";
    boolean taked = false;
    boolean run = false;

    public String getProcess() {
        if (run)
            return pName;
        else
            return "--";
    }

    public void run() {
        run = true;
    }

    public synchronized boolean take(String pName) {
        if (taked == false) {
            this.pName = pName;
            taked = true;
            return true;
        }
        return false;
    }

    public synchronized void release() {
        pName = "--";
        run = false;
        taked = false;

    }
}