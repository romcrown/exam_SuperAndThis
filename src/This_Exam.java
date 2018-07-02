class this_C {

	int A, W, H;
	String str;
	// 메소드명과 클래스명이 동일. 그러므로 this()사용이 가능하다.
	// this() 는 생성자 바로 뒤에서만 사용이 가능.
	
	public this_C() {
		this(27, 79, 183);
	}

	public this_C(int age, int w, int h) {
		this.A = age;
		this.H = h;
		this.W = w;
	}
	
	public this_C(String a) {
		this.str = a;
	}
}

public class This_Exam {

	/*
	 * 생성자는 메소드명이 클래스명과 동일하고 리턴자료형이 없는것. 1. 클래스명과 메소드명이 동일하다. 2. 리턴타입을 정의하지 않는다.
	 * public class a {
	 * 
	 * public a() { << 생성자.
	 * 
	 * }
	 * 
	 * } * public This_Exam() { this("a", 1); }
	 */

	public static void main(String[] args) {
		
		int A = 99;
		int B = 77;
		int C = 88;
		
		System.out.println(A+" "+B+" "+C);
		
		this_C sample = new this_C(10,20,30);
		this_C sample2 = new this_C();
		System.out.println(sample.A+" "+sample.W + " " + sample.H); 
		System.out.println(sample2.A+" "+sample2.W + " " + sample2.H);
	}
}
