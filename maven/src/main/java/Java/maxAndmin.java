package Java;

public class maxAndmin {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		int max1=a[0];
		for(int i=1;i<=a.length-1;i++) {
			if(max1<a[i]) {
				max1=a[i];
				
			}
			
		}
		int max2=a[0];
		for(int i=1;i<=a.length-1;i++) {
			if((a[i]!=max1)&&(a[i]>max2)) {
				max2=a[i];
			}
					
		}
		System.out.println(max2);
		
		int max3=a[0];
		for(int i=1;i<=a.length-1;i++) {
			if((a[i]!=max1)&&(a[i]!=max2)&&(a[i]>max3)) {
				max3=a[i];
	}
	
		}
		System.out.println(max3);
			
		}
}
