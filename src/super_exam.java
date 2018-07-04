import java.util.Scanner;

class par {

	String dad_name, child_name;

	par() {
		dad_name = "Dad";
		child_name = "Child";
	}
	
	par(String dad_name) {
		this.dad_name = dad_name;
		System.out.println("일때 아버지 이름은 > "+dad_name);
	}
	
	par(String dad_name, String child_name) {
		this.dad_name = dad_name;
		this.child_name = child_name;
	}

}

class child extends par {

	child(String child_name) {
		super();
		System.out.print("자식 이름 > " + child_name);
	}
}

public class super_exam {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	
		System.out.println("아버지 이름은 ?");
		String dad_name = sc.next();
		System.out.println("자식의 이름은 ?");
		String child_name = sc.next();
		
		child ch = new child(child_name);
		par pa = new par(dad_name);

	}
}
