package 数啤酒瓶童谣;

public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int N = 99;
		for(;N>0;N--)
		{
			if(N==1)
			{
				System.out.println(N+" bottle of beer on the wall,"+N+" bottle of beer.");
			}
			else
			{
				System.out.println(N+" bottles of beer on the wall,"+N+" bottles of beer.");
			}
			System.out.println("Take one down.");
			System.out.println("Pass it around.");
			if(N-1 <=1)
			{
				if(N-1 ==1)
				{
					System.out.println(N-1+" bottle of beer on the wall.");
				}
				else
				{
					System.out.println("No more bottles of beer on the wall.");
				}
			}
			else
			{
				System.out.println(N-1+" bottles of beer on the wall.");
			}
			System.out.println();
			
		}
	}

}
