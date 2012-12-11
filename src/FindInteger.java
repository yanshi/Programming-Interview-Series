
public class FindInteger {
	//find the first index of a number in a sorted array allow duplication.

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={1,2,3,3,3,4,5,6,6,6,7,8,9};
		System.out.println(find(a,0,a.length,5));
	}
	
	public static int find(int[] array,int min, int max, int target){
		if(min == max){
			return min;
		}
		int mid=(min+max)/2;
		if(array[mid]<target){
			return find(array,mid+1,max,target);
		}else if(array[mid]==target){
			return find(array,min,mid,target);
		}else{
			return find(array,min,mid-1,target);
		}
	}

}
