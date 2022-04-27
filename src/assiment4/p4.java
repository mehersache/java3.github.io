package assiment4;

public class p4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] arr=new int[] {1,2,3,4,5,6,7,8,9};
			int[] newarr=new int[] {1,2,8,9,12,46,76,82,15,20,30};
			  for(int i=0;i<=arr.length-1;i++) {
				  for(int j=0;j<=newarr.length-1;j++) {
				if(newarr[j]%arr[i]==0) {
				 	  int count=0;
				 	   	count++;
				 	  
				System.out.println(newarr[j]+ ":" +arr[i]);
				}
				
				}
						  }
				
			  }
			  }
				

