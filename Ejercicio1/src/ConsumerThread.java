
class ConsumerThread extends Thread {
   private Buffer buffer;
   
   ConsumerThread(Buffer b) { buffer = b; }
   
   public void run() {
     for(int i = 0; i < 10; i++) {
        try {
			buffer.get();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} }
   }
} 
