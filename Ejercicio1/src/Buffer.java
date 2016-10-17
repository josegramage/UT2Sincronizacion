
class Buffer {
   private char [] buffer;
   private int count = 0, in = 0, out = 0;

   Buffer(int size)
   {
      buffer = new char[size];
   }
 
   public synchronized void put(char c) throws InterruptedException {
	   //a�ado wait()
     while(count == buffer.length)wait() ;
     System.out.println("Produciendo " + c + " ...");
     buffer[in] = c; 
     in = (in + 1) % buffer.length; 
     count++;
     //a�ado notifyAll()
     notifyAll();
   }
    
   public synchronized char get() throws InterruptedException {
	   //a�ado wait()
     while (count == 0)wait() ;
     char c = buffer[out]; 
     out = (out + 1) % buffer.length;
     count--;
     System.out.println("Consumiendo "+ c + " ...");
     //a�ado notifyAll()
     notifyAll();
     return c;
   }
}
     
