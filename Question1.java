package ��ơ��ƿͯҥ;

public class Question1 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		String c = " ";
		String a = c;
		a = "123";
		System.out.println("a="+a +" "+ "c="+c);
		System.out.println(a.hashCode());
		System.out.println(c.hashCode());
		
	}
	
}
//���Խ���� a=123 c= 
//       48690
//       32
       