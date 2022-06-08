package Java;

public class program3 {

	public static void main(String[] args) {
		Object[] a = { 'A', 2244, "selenium", 'Z', 345 };
		for (int i = 0; i < a.length; i++) {
			if (a[i].getClass() == Integer.class) {
				System.out.println("integer value is "+a[i]);
			}
	
			else if(a[i].getClass()==Character.class)
			{
				System.out.println("character value is "+a[i]);
			}
			else if(a[i].getClass()==String.class)
			{
				System.out.println("String value is "+a[i]);
			}
		}

	}

}
