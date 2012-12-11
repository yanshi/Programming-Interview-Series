


public class ReverseLinkedList {
	//reverse a linked list

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "a";
		String b = "b";
		String c = "c";
		String[] list = {a,b,c};
		MyLinkedList ml = new MyLinkedList(list);
		print(ml);
		ml.reverseList();
		print(ml);
		

	}

	private static void print(MyLinkedList ml) {
		// TODO Auto-generated method stub
		Node temp = ml.getFirst();
		for(temp=ml.getFirst();temp.next!=null;temp=temp.next){
			System.out.println(temp.getValue().toString());
		}
		System.out.println(temp.getValue().toString());
	}
	


}
