package Java;

public class removeDuplicate {

	public static void main(String[] args) {
		int a[]= {10,20,10,40,20,50,90,45};
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length-1;j++){
				if (a[i]==a[j]) {
					System.out.println(a[i]);
				}
			}
		}

	}

}
