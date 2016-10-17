
class ProducerThread extends Thread {
   private Buffer buffer;
     
   ProducerThread(Buffer b) { buffer = b; }
   public void run() {
     for(int i = 0; i < 10; i++) {
        try {
			buffer.put((char)('A'+ i%26 ));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} }
   }
}  
