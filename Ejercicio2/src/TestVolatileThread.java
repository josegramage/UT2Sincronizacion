
public class TestVolatileThread extends Thread {
	boolean keepRunning = true;
	//a�ado volatile a la variable count
	volatile long count=0;

    public void run() {
    //    long count=0;
        while (keepRunning) {
            count++;
        }

        System.out.println("Thread terminated."+count);
    }
}
