package Java;

public class pallindrome {

	public static void main(String[] args) {
		
			int a=141,n=0;
			int i=0,j=0;
			n=a;
			while(a>0){
			i=a%10;
			j=(j*10)+i;
			a=a/10;
			}
			if(n==j){
			System.out.println("palindrome number");
			}else{
			System.out.println("Not a palindromenumber....");
			}
			}


	}


