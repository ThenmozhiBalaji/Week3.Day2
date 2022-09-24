package Week3.day2;

public class MissingElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1,2,3,4,5,6,8};
		int total = a.length;
		int temp = 0;
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
		for(int i=0;i<total;i++)
			System.out.println(a[i]);
		
		for (int i = 0; i <total-1; i++)   
		        {  
		            
		              if (a[i] +1 != a[i+1])   
		                {  
		                    temp=a[i]+1; 
		                    break;
		                } 
		             
		            }
		System.out.println("The Missing number is :"+temp);        	
	}

}
