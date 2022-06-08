package Java;

public class program2 {

	public static void main(String[] args) {
		Object[] a = { 'A', 2244, "selenium", 'Z', 345 };
//		String str = "";

		for (int i = 0; i < a.length; i++) {
			String str = "";
			String element = a[i].toString();
			char[] xyz = element.toCharArray();

			for (int j = 0; j < xyz.length; j++) {

				if (Character.isDigit(xyz[j]))
					str = str + xyz[j];
			}
			System.out.println(str);
		}
	}

}
