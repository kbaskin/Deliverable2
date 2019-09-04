import java.util.Scanner;

public class Deliverable2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		String userWord;
		String userWord2;
		int sum1 = 0;
		int sum2 = 0;

		System.out.println("Please enter 1 word.");

		userWord = scan.nextLine();
		System.out.println("Please enter another word.");
		userWord2 = scan.nextLine();
		for (int i = 0; i < userWord.length(); i++) {
			System.out.println(userWord.charAt(i) + " " + (int) userWord.charAt(i));
			
			sum1 = sum1 + (int) userWord.charAt(i);

		}



		for (int j = 0; j < userWord2.length(); j++) {
			System.out.println(userWord2.charAt(j) + " " + (int) userWord2.charAt(j));
			
			sum2 = sum2 + (int) userWord2.charAt(j);
		}
	
		
		int difference = Math.abs(sum1 - sum2);


		System.out.println("Absolute Value of both words: " + difference);

	}


	}

