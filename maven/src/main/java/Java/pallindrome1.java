package Java;

public class pallindrome1 {

	public static void main(String[] args) {
		int org=1991;
		int rev=0;
		if(org!=0) {
			rev=rev*10+org%10;
			org=org/10;
			
		}

		if(rev==org) {
			System.out.println(org+"is pallindrome" );
			
		}
		else {
			System.out.println(org+"is not pallindrome");
		}
	}
	

}
