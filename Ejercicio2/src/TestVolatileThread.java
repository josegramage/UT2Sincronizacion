
public class TestVolatileThread extends Thread {
	boolean keepRunning = true;
	//añado volatile a la variable count
	volatile long count=0;

    public void run() {
    //    long count=0;
        while (keepRunning) {
            count++;
        }

        System.out.println("Thread terminated."+count);
    }
}
