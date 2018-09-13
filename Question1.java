package 数啤酒瓶童谣;

public class Question1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String c = " ";
		String a = c;
		a = "123";
		System.out.println("a="+a +" "+ "c="+c);
		System.out.println(a.hashCode());
		System.out.println(c.hashCode());
		
	}
	
}
//测试结果： a=123 c= 
//       48690
//       32
       