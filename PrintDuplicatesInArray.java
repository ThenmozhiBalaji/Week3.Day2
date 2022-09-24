package Week3.day2;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]={14,12,13,11,15,14,18,16,17,19,18,17,20};
		 int end = a.length;

		    for (int i = 0; i < end; i++) {
		        for (int j = i + 1; j < end; j++) {
		            if (a[i] == a[j]) {                  
		                int shiftLeft = j;
		                for (int k = j+1; k < end; k++, shiftLeft++) {
		                    a[shiftLeft] = a[k];
		                }
		                end--;
		                j--;
		            }
		        }
		    }
	        
		    int[] arrlist = new int[end];
		    for(int i = 0; i < end; i++){
		        arrlist[i] = a[i];
	//	        System.out.println(arrlist[i]);
				}
		   
		    for (int i = 0; i < arrlist.length; i++) {     
	            for (int j = i+1; j < arrlist.length; j++) {     
	               if(arrlist[i] > arrlist[j]) {    
	                   int temp = arrlist[i];    
	                   arrlist[i] = arrlist[j];    
	                   arrlist[j] =temp;    
	               }     
	            }     
	        }  
		    System.out.println("The Array without duplicate is :");
		    for (int i = 0; i < arrlist.length; i++) {     
	            System.out.print(+arrlist[i] + " ");    
	        }    
}
}
