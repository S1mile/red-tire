package cfb;

import java.util.Scanner;
public class qbnq {
	public static void main(String[]args)
	{
		System.out.print("输入九月份的一个日期：");
		Scanner m=new Scanner(System.in);
		int n=m.nextInt();
		int i;
		i=n%7;
		switch(i)
		{
		case 1:
		System.out.print("今天是星期五");
		break;
		case 2:
			System.out.print("今天是星期六");
			break;
		case 3:
			System.out.print("今天是星期天");
			break;
		case 4:
			System.out.print("今天是星期一");
			break;
		case 5:
			System.out.print("今天是星期二");
			break;
		case 6:
			System.out.print("今天是星期三");
			break;
		case 0:
			System.out.print("今天是星期四");
			break;
		}
		}
}

