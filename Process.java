import java.util.concurrent.*;
import java.io.*;

public class Process extends Thread {
    String name;
    CPU[] cpu;
    int nCPU;

    public Process(String name, CPU[] cpu, int nCPU) {
        this.name = name;
        this.cpu = cpu;
        this.nCPU = nCPU;
    }

    public void run() {
        int CPUtaked = 0;
        int[] CPUget = new int[nCPU];
        while (CPUtaked < nCPU) {
            CPUtaked = 0;

            for (int i = 0; i < cpu.length; i++) {
                if (cpu[i].take(name)) {
                    CPUget[CPUtaked] = i;
                    CPUtaked++;

                    if (CPUtaked == nCPU) {
                        break;
                    }
                }
            }

            if (CPUtaked == nCPU) {
                for (int i = 0; i < nCPU; i++) {
                    cpu[CPUget[i]].run();
                }
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }

                for (int i = 0; i < nCPU; i++) {
                    cpu[CPUget[i]].release();
                }

            } else {
                for (int i = 0; i < CPUtaked; i++) {
                    cpu[CPUget[i]].release();
                }
            }
        }
    }
}