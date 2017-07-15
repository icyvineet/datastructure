package datastructure.list.singlylinkedlist;

public class Node {
	private int data;
	private Node link;

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getLink() {
		return link;
	}

	public void setLink(Node link) {
		this.link = link;
	}

	public Node(int data, Node link) {
		super();
		this.data = data;
		this.link = link;
	}

	public Node() {
		data = 0;
		link = null;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + ", link=" + link + "]";
	}

}
