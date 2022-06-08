package Java;

public class maxAnd2ndmaxno {

	public static void main(String[] args) {
		//*********find max no and 2nd max in array***********

		
				int a[]= {10,20,30,40,60,50};
				int m=a[0];
				
				for(int i=1;i<=a.length-1;i++)
				{
					if(m<a[i])
					{
						
						m=a[i];
						
					}
					
				}
				System.out.println(m+"is gretter ");
				int k=a[0];
				for(int i=1;i<=a.length-1;i++)
				{
					if(a[i]!=m)
					{
						if(a[i]>k)
						{
							k=a[i];
						}
					}
				}
				System.out.println("second largest no is :"+k);
			}

		}
	


