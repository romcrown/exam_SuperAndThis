import java.util.Scanner;

public class This_Exam02 {

	public static void main(String[] args) {

		per_info in = new per_info();
		input inpu = new input();

		System.out.println("아래와 같은 형식으로 입력해주세요.");
		System.out.println("나이 : " + in.Age);
		System.out.println("몸무게 : " + in.Weight);
		System.out.println("키 : " + in.Height);
		System.out.println("성별 : " + in.Gender);
		System.out.println("=========================");

		System.out.print("나이 > ");
		inpu.age();
		System.out.print("몸무게 > ");
		inpu.weight();
		System.out.print("키 > ");
		inpu.height();
		System.out.print("성별 > ");
		inpu.gender();

		per_info in2 = new per_info(inpu.Age, inpu.Weight, inpu.Height, inpu.Gender);
		System.out.println("=================");
		System.out.println("나이 : " + in2.Age);
		System.out.println("몸무게 : " + in2.Weight);
		System.out.println("키 : " + in2.Height);
		System.out.println("성별 : " + in2.Gender);

	}

}

class input {
	Scanner sc = new Scanner(System.in);
	int Age, Weight, Height;
	String Gender;

	void enter() {
		System.out.println();
	}

	void age() {
		Age = sc.nextInt();
	}

	void weight() {
		Weight = sc.nextInt();
	}

	void height() {
		Height = sc.nextInt();
	}

	void gender() {
		Gender = sc.next();
	}
}

class per_info {

	int Age, Weight, Height;
	String Gender;

	per_info() {
		this(27, 79, 183, "M");
	}

	per_info(int age, int weight, int height, String gender) {
		this.Age = age;
		this.Weight = weight;
		this.Height = height;
		this.Gender = gender;

	}

}
