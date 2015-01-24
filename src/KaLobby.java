package ka.server;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
public class KaLobby implements Runnable {
private int port;
private ArrayList<KaLiaison> liaisons;
private boolean keep_running;
//private ArrayList<Thread> lThreads;
public KaLobby(int portNumber) {
// TODO Auto-generated constructor stub
this.port = portNumber;
this.liaisons = new ArrayList<KaLiaison>();
}
@Override
public void run() {
// TODO Auto-generated method stub
try ( ServerSocket serverSocket = new ServerSocket(port);) {
this.keep_running = true;
try {
while(this.keep_running){
Socket new_client = serverSocket.accept();
KaLiaison new_liaison = new KaLiaison(new_client);
this.liaisons.add(new_liaison);
Thread new_lThread = new Thread(new_liaison);
//this.lThreads.add(new_lThread);
new_lThread.start();
//TODO - recieve new player to the playground
}
} finally {
for(KaLiaison kl : this.liaisons){
kl.sayGoodbye("Lobby closing or something idk");
}
}
} catch (IOException e) {
e.printStackTrace();
}
}
public static void main(String[] args) {
// TODO Auto-generated method stub
if (args.length != 1){
System.out.println(" input needed: <port number>");
}
int portNumber = Integer.parseUnsignedInt(args[0]);
Thread kl = new Thread(new KaLobby(portNumber));
kl.start();
}
}
