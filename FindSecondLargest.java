package Week3.day2;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={3,2,11,4,6,7};
		int temp;  
		int total = a.length;
		for (int i = 0; i < total; i++)   
		        {  
		            for (int j = i + 1; j < total; j++)   
		            {  
		                if (a[i] > a[j])   
		                {  
		                    temp = a[i];  
		                    a[i] = a[j];  
		                    a[j] = temp;  
		                }  
		            }  
		        }  
		
		System.out.println("The Second Largest number is :" +a[total-2]);
		System.out.println(a[total-2]);
	}

}
