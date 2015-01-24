package ka.server;
import java.util.HashMap;
import java.util.concurrent.LinkedBlockingQueue;
public class KaTableManager implements Runnable {
protected Thread myRunningThread; //started when getInstance() is first called
protected LinkedBlockingQueue<String> tasks; //TODO table manager tasks String????
protected HashMap<Integer, KaTable> tables;
protected KaTableManager(){
this.tasks = new LinkedBlockingQueue<String>();
}
@Override
public void run() {
}
}