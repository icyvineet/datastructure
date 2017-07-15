package datastructure.list.singlylinkedlist;

public class LinkedList {

	public static Node start;
	public static Node end;
	public static int size;

	// Display all the elements
	public static void display(LinkedList ll) {
		Node tmp;
		tmp = ll.start;
		while (tmp != null) {
			System.out.print(tmp.getData() + "\t");
			tmp = tmp.getLink();
		}

	}

	// implement insert at the beginning
	public static void insertAtBeginning(int input) {

		Node newNode = new Node();
		newNode.setData(input);
		if (start == null) {
			start = newNode;
			end = newNode;
		} else {
			newNode.setLink(start);
			start = newNode;
		}

	}
	
	//implement insert in the middle
	public static void insertInMiddle(int input, int location){
		//assuming the provided node number exist
		Node newNode = new Node();
		newNode.setData(input);
		int counter = 1;

		Node tmp = null;
		tmp = start;
		
		while(counter < location){
			tmp = tmp.getLink();
			counter++;
		}
		Node tmp2 = tmp.getLink();
		tmp.setLink(newNode);
		newNode.setLink(tmp2);
		//end = tmp;
		
	
	
	}

	// implement insert at last
	public static void insertAtLast(int input) {
		Node newNode = new Node();
		newNode.setData(input);
		if (start == null) {
			start = newNode;
			end = newNode;
		} else {
			Node tmp = null;
			tmp = start;
			
			while(tmp.getLink()!= null){
				tmp = tmp.getLink();
			}
			
			tmp.setLink(newNode);
			end = tmp;
			
		}
		
		
	}

	// implement delete from the end

	// implement delete from the beginning

	// implement delete from the middle

	// implement get

	//

	public static void main(String[] args) {
		LinkedList myLL = new LinkedList();
		myLL.insertAtLast(2);
		myLL.insertAtLast(1);
		myLL.insertAtLast(5);
		myLL.insertAtLast(9);

		myLL.display(myLL);
		System.out.println();
		myLL.insertAtBeginning(999);
		
		myLL.display(myLL);
		System.out.println();
		myLL.insertInMiddle(50,1);
		
		myLL.display(myLL);

	}

}
