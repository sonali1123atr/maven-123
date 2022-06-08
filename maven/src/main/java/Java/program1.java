package Java;

public class program1 {

	public static void main(String[] args) {
			String str = "Hello World";
			int a = 0;
			char[]xyz= str.toCharArray();
			
			for(int i = 0;i<str.length();i++)
			{
					for (int j=i+1;j<str.length();j++)
					{
						if(xyz[i]==xyz[j])
						{System.out.println(xyz[j]);
						a++;
						break;
						}
					}
					}


	}

}
