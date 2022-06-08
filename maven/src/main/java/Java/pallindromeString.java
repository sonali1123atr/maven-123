package Java;

public class pallindromeString {

	public static void main(String[] args) {
		String str="sonali";
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
			
		}
     System.out.println(rev);
     //compare string.str
     if(str.equals(rev)) {
    	 System.out.println(str+"is pallindrome string"); 
     }
     else {
    	 System.out.println(str+"is not pallindrome string");
     }
	}
	

}
