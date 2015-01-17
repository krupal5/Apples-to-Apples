package ka.fgame;

import java.io.Serializable;

public interface KaCard extends Serializable {

	public enum CardType {
		TOPIC, RESPONSE
	}
	
	String get_title();
	CardType get_type();
	
	
}
