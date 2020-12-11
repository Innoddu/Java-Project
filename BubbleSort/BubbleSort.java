
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr =  new int[]{7,4,5,1,3,10,9,6,8,2};
		
		BubbleSort.Sort(arr);
		 for(int i =0; i<10; i++)
		 {
			 System.out.print(arr[i]);
		 }
		
		
	}

	public static void Sort(int[] arr) {
		int save;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<9; j++)
	   if(arr[j]> arr[j+1])
	   {
		   save=arr[j+1];
		   arr[j+1] = arr[j];
		   arr[j] = save;
		  
	   }
			
		}
	}



}
