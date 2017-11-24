package lt.and.pac.treerecursion;

import java.util.ArrayList;
import java.util.List;

public class Node {

	private int name;
	private List<Node> nodeList;
	
	public Node(int nameIn){
		this.name = nameIn;
		this.nodeList = new ArrayList<Node>();
	}
	
	public int getName(){
		return name;
	}
	
	public List<Node> getNodeList(){
		return nodeList;
	}
}
