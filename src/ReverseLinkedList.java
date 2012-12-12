


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
//		print(ml);
//		ml.reverseList();
//		print(ml);
		System.out.println(ml.toString());
		ml.reverseList();
		System.out.println(ml.toString());
		

	}

	


}
