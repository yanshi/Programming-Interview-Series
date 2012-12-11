
public class BSTVerify {
	//Verify if a tree is a binary search tree
	//                  Example:
	//                     5
//	                  2          7
//	                1   4       6  9  
//	                   3

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree tree = new Tree(5);
		tree.left = new Tree(2);
		tree.right = new Tree(7);
		tree.left.left = new Tree(1);
		tree.left.right = new Tree(4);
		tree.right.left = new Tree(6);
		tree.right.right = new Tree(9);
		tree.left.right.left = new Tree(3);
		System.out.println(verify(tree,Integer.MIN_VALUE,Integer.MAX_VALUE));

	}
	public static boolean verify(Tree t,int low, int high){
		
		if(t.left==null&&t.right==null){
			return true;
		}
		
		if(t.left==null&&t.right!=null){
			if(t.right.id>t.id){
				return verify(t.right,t.id,high);
			}
			else{
				return false;
			}
				
		} else if(t.left!=null&&t.right==null){
			if(t.left.id<t.id){
				return verify(t.left,low,t.id);
			}else{
				return false;
			}
		} else{
			if(t.left.id<t.id&&t.right.id>t.id){
				boolean left;
				left=verify(t.left,low,t.id);
				
				if(left){
					return verify(t.right,t.id,high);
				}else {
					return false;
				}
			} else {
				return false;
			}
		}
		
		
		
	}
	

}
