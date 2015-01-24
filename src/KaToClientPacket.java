package ka.server;
//import java.io.Serializable;
public class KaToClientPacket {//implements Serializable {
public enum PackTag {
ALL_TABLES, TABLE_INFO, CHAT_MSG, GOOD_BYE, PING
}
public static final String TAG_SEPARATOR = ":";
private PackTag type;
private String data;
private KaToClientPacket(){
this.type = PackTag.PING;
}
private KaToClientPacket(PackTag t){
this.type = t;
}
public PackTag getType(){
return this.type;
}
public static KaToClientPacket getGoodbyePacket(String reason){
KaToClientPacket ktcp = new KaToClientPacket(PackTag.GOOD_BYE);
ktcp.data = reason; // (Object) reason;
return ktcp;
}
public String toString(){
return this.type.toString() + KaToClientPacket.TAG_SEPARATOR + data;
}
}