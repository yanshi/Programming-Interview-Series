
public class StringPermutation {
	//print all the permutations of a given string

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stringPermutation("sorry");
	}
	
	private static void stringPermutation(String a){
		char[] input = a.toCharArray();
		char[] holder = new char[a.length()];
		for(int i=0;i<holder.length;i++){
			holder[i]='\0';
		}
		permutation(input,holder,0);
		
	}

	private static void permutation(char[] input, char[] holder, int focus) {
		// TODO Auto-generated method stub
		char[] copy = holder;
		for(int i=0;i<holder.length;i++){
			holder = copy.clone();
			if(holder[i]=='\0'){
				holder[i]=input[focus];
				
				if(focus==input.length-1){
					
					System.out.println(new String(holder));
					return;
				} else{
					permutation(input,holder,focus+1);
					
				}
				
				
			}
			
		}
	}
	
	

}
