package self_assessment_task1;

public class Primes {

	public static void main(String[] args) {
		int nValues = 50;
		integersToTest: for (int i=2; i <= nValues; i++) {
			for (int j=2; j<=Math.sqrt(i);j++) {
				if(i%j == 0) 
					continue integersToTest;
				
			}
			System.out.println(i);
		}
	}
}
