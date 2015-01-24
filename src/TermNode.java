/*
public class TermNode {
	private Node head;
	private int listCount;
	
	public TermNode(){
		head = new Node(null,null,null,null);
		listCount =0;
	}
	public void add(String _term,String _syn1, String _syn2, String _syn3) {
		Node temp = new Node(_term,_syn1,_syn2,_syn3);
		Node current = head;
		while(current.getNext() != null){
			current = current.getNext();
		}
		current.SetNext(temp);
		listCount++;
	}
	public void add(String _term,String _syn1, String _syn2, String _syn3, int index){
		Node temp = new Node(_term,_syn1,_syn2,_syn3);
		Node current = head;
		
		for (int i)
	}
}
*/

/*
class Node {
	Node next;
	
	String term;
	String syn1;
	String syn2;
	String syn3;
	
	public Node(String _term,String _syn1, String _syn2, String _syn3, Node _next){
		next = _next;
		term = _term;
		syn1 = _syn1;
		syn2 = _syn2;
		syn3 = _syn3;
	}
	public Node(String _term,String _syn1, String _syn2, String _syn3){
		term = _term;
		syn1 = _syn1;
		syn2 = _syn2;
		syn3 = _syn3;
		next = null;
	}*/
/*
	public String getTerm(){
		return term;
	}
	public String getSynonyms(){
		return syn1 + "," + syn2 + "," + syn3;
	}
	public Node getNext(){
		return next;
	}
	public void SetNext(Node _next){
		next = _next;
	}
	*/
}
