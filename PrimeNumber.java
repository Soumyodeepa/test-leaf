package week1.day1.assignments;
public class PrimeNumber {
	
	public static void main (String [] args) {
		int input = 12;
		
		boolean flag = false;
		
		for (int i=2;i<= input/2; i++){
		
		if (input % i == 0) {
			
			flag = true;
			break;
			
		}
		
		}
		if (flag==false){
			System.out.println("is Prime Number");
		}
			else {
				System.out.println("is not a Prime Number");
				
				}
	}

}

	
		
		