import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		try {
			int be= sc.nextInt();
			System.out.println(be);
			sc.close();
		} catch (InputMismatchException e) {
			System.out.println("Hibás formátum!");
			sc.close();
		}
		sc.close();

	}

}
