package lt.and.pac.treerecursion;

public class StaticTreeCreator {

	
	public Node getRootNode(){
		
		Node node = new Node(1);
		
		node.getNodeList().add(new Node(2));
		node.getNodeList().add(new Node(3));
		
		node.getNodeList().get(0).getNodeList().add(new Node(4));
		node.getNodeList().get(1).getNodeList().add(new Node(5));
		node.getNodeList().get(1).getNodeList().add(new Node(6));
		node.getNodeList().get(1).getNodeList().add(new Node(7));
		
		node.getNodeList().get(1).getNodeList().get(0).getNodeList().add(new Node(8));
		node.getNodeList().get(1).getNodeList().get(1).getNodeList().add(new Node(9));
		node.getNodeList().get(1).getNodeList().get(2).getNodeList().add(new Node(10));
		
		node.getNodeList().get(1).getNodeList().get(1).getNodeList().get(0).getNodeList().add(new Node(11));
		
		//node.getNodeList().get(1).getNodeList().get(1).getNodeList().get(0).getNodeList().get(0).getNodeList().add(new Node(12));
		
		System.out.println("StaticTreeCreator.getRootNode(): Static tree was built");
		
		return node;
	}
}
