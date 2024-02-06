
public class VarEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int score=100;
		boolean power=true;
		byte b=127;
		
		int oct=010;
		int hex=0x10;
		
		long l=1000_000_000;
		
		float f=3.14f;
		double d=3.14;
		
		char ch='A';
		int i='A';
		
		String str="";
		String str2="ABCD";
		String str3="123";
		String str4=str2 + str3;
		System.out.println(str4);
		System.out.println(7+7+"");
		System.out.println(""+7+7);
		System.out.println(ch);
		System.out.println(i);
		System.out.println(power);
		System.out.println(oct);
		System.out.println(hex);
		System.out.println(10.);
		System.out.println(.10);
		System.out.println(10f);
		System.out.println(1e3);
	}

}
