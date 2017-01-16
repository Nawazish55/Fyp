package pk.ciit.sc;

public class Calculator implements Icalc{
	public int findmax(int num1,int num2,int num3){
		int[] arr={num1,num2,num3};
		int max=0;
		for(int i=0; i<arr.length;i++){
			
		if(arr[i]>max)
			max=arr[i];
			
		}
		return max;
		
		}
	
	
	public int square(int num) throws IllegalArgumentException{
		int result=0;
		if(num>0&&num<10){
			
			result=num*num;
			
		}else
		{
			throw new IllegalArgumentException();
			
		}
		
		
		return result;
		
		
		
	}


	public int cube(int num) {
		// TODO Auto-generated method stub
		return num*num*num;
	}

}
