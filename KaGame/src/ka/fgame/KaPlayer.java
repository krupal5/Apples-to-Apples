package ka.fgame;

import java.net.Socket;

public class KaPlayer {
	
	private KaLiaison con;
	private String name;
	private boolean isMod;
	private int points;
	
	public KaPlayer(KaLiaison player_socket){
		this.con = player_socket;
	}

	public KaLiaison getCon() {
		return con;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isMod() {
		return isMod;
	}

	public void setMod(boolean isMod) {
		this.isMod = isMod;
	}

	public int getPoints() {
		return points;
	}

	public void addPoint() {
		this.points++;
	}

}
