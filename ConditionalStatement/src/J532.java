import java.util.*;
public class J532 {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			
			if(a >= 4.0 && b >= 4.0)
				System.out.println("A");
			else if(a >= 3.0 && b >= 3.0)
				System.out.println("B");
			else
				System.out.println("C");
		}

	}

}
