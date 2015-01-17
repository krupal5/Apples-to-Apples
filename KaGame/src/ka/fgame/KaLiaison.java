package ka.fgame;

import java.net.Socket;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingQueue;

public class KaLiaison implements Runnable {

	private Socket mySock;
	private LinkedBlockingQueue<String> outGoingMsges;
	
	public KaLiaison(Socket client){
		this.mySock = client;
		this.outGoingMsges = new LinkedBlockingQueue<String>();
	}

//	private boolean addToQueue(String msg){//no need to synchronize since using blocking queue
//		return false;//actually idk if i need this... i thought i did.
//	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub

	}
	
	/*
	 * methods below only add to queue, sending will be done through run()
	 */
	
	
	public void sendTables(ArrayList<KaGameServer> tables){
		
	}
	
	
	public void sayGoodbye() {
		// TODO Auto-generated method stub
		
	}
	

}
