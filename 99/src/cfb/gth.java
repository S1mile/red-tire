package cfb;

public class gth {
	public static void main(String[]args)
	{ 
		int i;
		long j=1;
		long k=0;
		for(i=1;i<=100;i++)
		{
		j=i*j;
		k=k+j;
		}
		System.out.print("前	一百位相加的值为"+k);
	}
}
