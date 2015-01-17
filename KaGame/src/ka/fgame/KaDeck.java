package ka.fgame;

public interface KaDeck {
	
	KaCard draw_card();
	void shuffle_deck();
	
	void add_to_deck(KaDeck other);
	void add_to_deck(KaCard kcar);
}
