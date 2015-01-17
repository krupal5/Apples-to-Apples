package ka.fgame;

import java.io.IOException;
import java.util.ArrayList;


public class KaGameServer implements Runnable{

	private KaDeck topicDeck;
	private KaDeck respoDeck;
	private int win_score;
	private ArrayList<KaPlayer> players;
	private int max_players;
	private String name;
	
	
	public KaGameServer(String name){
		this.name = name;
		//TODO load default decks from somewhere..
			//and other settings
	}
	
	public KaGameServer(KaDeck topics, KaDeck responses){
		
		this.topicDeck = topics;
		this.respoDeck = responses;
		this.win_score = 10;
		this.players = new ArrayList<KaPlayer>(8);
		
	}
	
	@Override
	public void run() {
		
		//TODO game init
		
		//wait until we recieve start from mod
		
		//TODO game start
		
		topicDeck.draw_card();
		respoDeck.draw_card();
		
	}

	public int getWin_score() {
		return win_score;
	}

	public void setWin_score(int win_score) {
		if(win_score > 0 && win_score < 20)
			this.win_score = win_score;
	}

	public ArrayList<String> getPlayersNames() {
		ArrayList<String> player_names = new ArrayList<String>(this.players.size());
		for(KaPlayer p : this.players){
			player_names.add(p.getName());
		}
		return player_names;
	}

	public int getMax_players() {
		return max_players;
	}

	public void setMax_players(int max_players) {
		this.max_players = max_players;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString(){
		return this.name + " (" + this.players.size() + "/" + this.max_players + ")";
	}
	
	public void endGame(){
		this.players.clear();
	}
	
}
