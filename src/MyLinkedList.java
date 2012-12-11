
    //for convenience to create a linkedlist

	public class MyLinkedList{
		private Node firstNode;
		public MyLinkedList(Object[] values){
			firstNode = new Node(values[0]);
			Node tempNode = firstNode;
			for(int i=1;i<values.length;i++){
				
				if(tempNode.next == null){
					tempNode.next = new Node(values[i]);
					tempNode = tempNode.next;
				}
				
			}
		}
		
		public void reverseList(){
			
			recursiveReverse(firstNode);
			
			
			
		}
		
		public Node getFirst(){
			return firstNode;
		}

		private Node recursiveReverse(Node currentNode) {
			// TODO Auto-generated method stub
			if(currentNode.next == null){
				firstNode = currentNode;
				return firstNode;
			} else{
				Node previousNode = recursiveReverse(currentNode.next);
				currentNode.next = null;
				while(previousNode.next!=null){
					previousNode = previousNode.next;
					
				}
				previousNode.next = currentNode;
			}
			return firstNode;
		}
		
			
			
	}
	
	
	
