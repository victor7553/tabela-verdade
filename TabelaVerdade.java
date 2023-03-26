package fundamentos;

public class TabelaVerdade {
	
	public static void main(String[] args) {
		
		boolean condicao1 = 5 > 3; // true
		boolean condicao2 = 3 > 7; // false

		System.out.println(true && true); // true
		System.out.println(true && false);// false
		System.out.println(false && true);// false
		System.out.println(false && false);// false

		System.out.println(true || true);// true
		System.out.println(true || false);// true
		System.out.println(false || true);// true
		System.out.println(false || false);// false

		System.out.println(true ^ true);// false
		System.out.println(true ^ false);// true
		System.out.println(false ^ true);// true
		System.out.println(false ^ false);// false

		System.out.println(!true);// false
		System.out.println(!false);// true
		
	}


}
