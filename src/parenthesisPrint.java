
public class parenthesisPrint {
	//print all valid combinations of groups of parenthesis

	/**
	 * @param args
	 */
	static int count;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printParenthesis("",3,3);
	}
	
	public static void printParenthesis(String s,int left, int right){
				
		if(right == 0){
			System.out.println(s);
			return;
		}
		if(left>right){
			System.out.println("invalid input");
			return;
		} else if(left == right){
			s=s+"(";
			printParenthesis(s,left-1,right);
		} else if(right>left){
			if(left == 0){
				printParenthesis(s+")",left,right-1);
			} else {
				printParenthesis(s+")",left,right-1);
				printParenthesis(s+"(",left-1,right);
			}
			
			
				
		
		}
		
	}

}
