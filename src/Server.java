import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.LinkedList;

public class Server {
	
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file1 = new File("Partyset-Red.txt");
		File file2 = new File("Partyset-Green.txt");
		try {
		Scanner redApple = new Scanner(file1);
		Scanner greenApple = new Scanner(file2);
		}catch(Exception e){
			System.out.println(e);
		}
		//ArrayList<String> arrlst = new ArrayList();
		//int count = 0;
		//while (redApple.hasNext()){
			//arrlst.add(redApple.next());
			//count ++;
			//System.out.println(arrlst);
			//if (count == 4) return;
		//}

	}
	public LinkedList parse() {
		LinkedList myList = new LinkedList();
		Node nod1 = new Node("firstcard","syn1","syn2","syn3");
		myList.add(nod1);
		System.out.println(myList);
		return null;
	}
	

	}

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
	}
}
