
public class TheLongerSubArray {

	public static void main(String[] args) {
		 int[] arr = {1,1,1,3,4, 5,5,5, 3,3};
		 	 
		 int bestI = 0;		 	 
		 int bestL = 1;
		 int newI = 0;		 	 
		 int newL = 1;		 		 
		 int i = 0;
		 	// array loop
		 do { 					 	 
			 i++;
			 	// sequence loop
			 while (i< arr.length && arr[i] == arr[i-1]) {
				 newL++;
				 i++;   // out of bounds danger
			 } // i points to the beginning of the next sequence
			  	System.out.print("trace of i  ");	 
			  	System.out.println(i);
			  	
			 if (newL>= bestL){
				 bestL = newL;
				 bestI = newI;
			 }   else  if ( i == arr.length){
		break; // end of array??
			 } 
			 	// initialize the new sequence
			 newL=1;
			 newI=i;			 		 
		 } while (i< arr.length);
		 		
		 System.out.println("bestI  "+ bestI);
	}
}


