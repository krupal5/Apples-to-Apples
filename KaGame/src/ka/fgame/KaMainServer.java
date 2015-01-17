package ka.fgame;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.LinkedList;

public class KaMainServer {
	
	private int port;
	private boolean keep_running;
	private LinkedList<KaLiaison> liaisons;
	private LinkedList<Thread> lThreads;
	private ArrayList<KaGameServer> tables;
	
	public KaMainServer(int port_number){
		this.port = port_number;
		this.keep_running = false;
		this.liaisons = new LinkedList<KaLiaison>();
		this.lThreads = new LinkedList<Thread>();
		this.tables = new ArrayList<KaGameServer>();
	}
	
	public void start(){
		
		try ( ServerSocket serverSocket = new ServerSocket(port);) {
			this.keep_running = true;
			
			try {
				while(this.keep_running){
					Socket new_client = serverSocket.accept();
					KaLiaison new_liaison = new KaLiaison(new_client);
					
					this.liaisons.add(new_liaison);
					Thread new_lThread = new Thread(new_liaison);
					this.lThreads.add(new_lThread);
					new_lThread.start();
					
					//TODO - recieve new player to the playground

				}

			} finally {
				for(KaLiaison kl : this.liaisons){
					kl.sayGoodbye();
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
		//TODO the whole thing
		
		if(args.length == 0){
			System.out.println("Usage: java KaMainServer <port-num>");
			return;
		}
		
		KaMainServer myKaServer = new KaMainServer(Integer.parseUnsignedInt(args[0]));
		myKaServer.start();
	}
	
	
}
