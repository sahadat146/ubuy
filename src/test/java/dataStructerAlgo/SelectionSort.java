package dataStructerAlgo;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arry[]= {100,3,4,5,34,576,356};
		int min,temp=0;
		for(int i=0;i<arry.length;i++) {
			 min=i;
			for(int j=i+1;j<arry.length;j++) {
				if(arry[j]<arry[min]) {
					min=j;
				}
			}
				//Sweping
				temp=arry[i];
				arry[i]=arry[min];
				arry[min]=temp;
				
			
		}
		
		
		for(int i=0;i<arry.length;i++) {
			System.out.println(arry[i]+"min");
		}
	}

}
