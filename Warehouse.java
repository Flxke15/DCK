public class Warehouse {
    volatile int productID;
    volatile boolean empty = true;

    public synchronized void put(int productID) {
        if (!empty) {
            try {
                wait();
            } catch (Exception e) {
            }
        }
        this.productID = productID;
        empty = false;
        notify();
    }

    public synchronized int take() {
        if (empty) {
            try {
                wait();
            } catch (Exception e) {
            }
        }
        int result = this.productID;
        empty = true;
        notify();
        return result;
    }
}
