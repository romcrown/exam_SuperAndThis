import java.util.Scanner;

class animal {
	public animal() {

	}

	public animal(String name) {
		System.out.println("'" + name + "' 에 속하는 동물입니다.");
		System.out.print("동물 이름은 > ");

	}
}

// 포유류
class mammalia extends animal {

	public mammalia(int number, String a) {
		super(a);
		if(number == 1){
			System.out.println("코끼리 입니다.");
		}
		else if(number == 4) {
			System.out.println("호랑이 입니다.");
		}
		else
			System.out.println("사자 입니다.");
	}
	
}

// 파충류
class reptilia extends animal {

	public reptilia(int number, String a) {
		super(a);

		if(number == 2) {
			System.out.println("악어 입니다.");
		}
		else if(number == 7) {
			System.out.println("거북이 입니다.");
		}
		else 
			System.out.println("도마뱀 입니다.");
	}
}

// 양서류.
class amphibia extends animal {
	
	public amphibia(int number,String a) {
		super(a);
		System.out.println("개구리 입니다.");
	}
}

// 어류
class pisces extends animal {

	public pisces(int number, String a) {
		super(a);
		if (number == 9) {
			System.out.println("금붕어 입니다.");
		} else
			System.out.println("장어 입니다.");
	}
}

// 조류
class aves extends animal {

	public aves(int number, String a) {
		super(a);
		if (number == 6) {
			System.out.println("앵무새 입니다.");
		} else
			System.out.println("구관조 입니다.");
	}
}

public class super_exam02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int number;
		System.out.println("동물 앞의 번호를 입력하면 동물이 속한 '류' 를 보여줍니다. ");
		System.out.println("1.코끼리 2.악어 3.개구리 4.사자 5.호랑이 6.앵무새 7.거북이 8.구관조 9.금붕어 10.장어 11.도마뱀 ");
		number = sc.nextInt();

		if (number == 1 || number == 4 || number == 5) {
			String name = "포유류";
			mammalia ma = new mammalia(number, name);
		} else if (number == 11 || number == 2 || number == 7) {
			String name = "파충류";
			reptilia re = new reptilia(number, name);
		} else if (number == 3) {
			String name = "양서류";
			amphibia am = new amphibia(number, name);
		} else if (number == 9 || number == 10) {
			String name = "어류";
			pisces pi = new pisces(number, name);
		} else if (number == 6 || number == 8) {
			String name = "조류";
			aves av = new aves(number, name);

		}
	}
}
