
public class CoffeeStore {
	    private String lastClient;
	    private int soldCoffees;
	     
	    private void someLongRunningProcess() throws InterruptedException {
	    	//reduzco el tiempo (de 3.000 a 1.000) para que no tarde tanto
	        Thread.sleep(1000);
	    }
	     
	    //añado el método snychronized
	    public synchronized void buyCoffee(String client) throws InterruptedException {
	        someLongRunningProcess();
	        lastClient = client;
	        soldCoffees++;
	        System.out.println(client + " bought some coffee");
	    }
	     
	    public int countSoldCoffees() {return soldCoffees;}
	     
	    public String getLastClient() {return lastClient;}
}
