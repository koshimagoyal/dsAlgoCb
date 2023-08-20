package lec8;

public class Global_demo {
	
	static int global = 1000;
	static int a = 500;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		System.out.println("Main vala:"+a);
		System.out.println(global);
		System.out.println(a);
		System.out.println(Global_demo.a);
//		global+=10;
		fun();
//		System.out.println(global);
	}
	
	public static void fun() {
		int a = 5;
		System.out.println("Fun vala:"+a);
		System.out.println(global);
		global+=100;
		System.out.println(a);
	}

}
