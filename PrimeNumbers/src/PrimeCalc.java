import java.util.ArrayList;
public class PrimeCalc {
	static int numba = 1000;
	
	static ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
	static ArrayList<Integer> notPrimes = new ArrayList<Integer>();

	public static void main(String[] args) {
		for(int i = 1; i <= numba; i++){
		isPrimeNumber(i);
		}
		System.out.println("Prime number list from numbers 1 - " + numba + " is: " + primeNumbers);
	}
	
	public static void isPrimeNumber(int number){
		int one = 1;
		int nextPossiblePrime;
		int index = 0;
		int primeCount = primeNumbers.size();
		
		if(number != one){
			if(primeCount == 0){
			primeNumbers.add(number);
			}
			else{
			nextPossiblePrime = number;
			System.out.println("Next number is " + nextPossiblePrime);
				while(index <= primeCount){
						if(nextPossiblePrime % primeNumbers.get(index) != 0){
							index++;
							if(index == primeCount){
								primeNumbers.add(number);
								return;
						}
						}
						else{
							notPrimes.add(nextPossiblePrime);
						
							return;
						}
				}
			}
		}
		else{
			notPrimes.add(number);
			}
		}

}
