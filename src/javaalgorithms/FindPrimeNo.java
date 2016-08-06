package javaalgorithms;

public class FindPrimeNo {

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		
		int m = n/2;
		
		boolean isPrime = true;
		
		for(int i=2; i<m;i++){
			if(n%i == 0){
				isPrime = false;
				break;
			}
		}
		
		System.out.println(n + " is Prime status " + isPrime);

	}

}
