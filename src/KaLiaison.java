package ka.server;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.io.ObjectInputStream;
//import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.concurrent.LinkedBlockingQueue;
public class KaLiaison implements Runnable {
protected Socket mySock;
protected LinkedBlockingQueue<KaToClientPacket> packetQueue;
protected boolean keepAlive;
protected String username;
public KaLiaison(Socket clientSocket){
this.mySock = clientSocket;
this.packetQueue = new LinkedBlockingQueue<KaToClientPacket>();
}
private void listenToClient() {
while(this.keepAlive){
// try( ObjectInputStream in = new ObjectInputStream(this.mySock.getInputStream())){
try( BufferedReader in = new BufferedReader(
new InputStreamReader(
this.mySock.getInputStream()))){
} catch (IOException e) {
e.printStackTrace();
}
}
}
@Override
public void run() {
if(this.mySock == null){
return;
}
Thread cListener = new Thread(this::listenToClient);
this.keepAlive = true;
cListener.start();
while(this.keepAlive){
// try(ObjectOutputStream out = new ObjectOutputStream(this.mySock.getOutputStream())){
try(PrintWriter out = new PrintWriter(this.mySock.getOutputStream(), true)){
KaToClientPacket nextPack = this.packetQueue.take();
//maybe use JSON? idk.
out.println(nextPack);
} catch (IOException e) {
e.printStackTrace();
} catch (InterruptedException e) {
e.printStackTrace();
}
}
}
public void sayGoodbye(String reason) {
this.packetQueue.add(KaToClientPacket.getGoodbyePacket(reason));
}
public void sayGoodbyeASAP(String reason){
this.packetQueue.clear();
sayGoodbye(reason);
}
