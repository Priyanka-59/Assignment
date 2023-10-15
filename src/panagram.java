//Check if the input is pangram or not. (A pangram is a sentence that contains all the alphabets from A to Z)

import java.util.Scanner;

public class panagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your String: ");
		String s = sc.nextLine() ;
		//String s = "abcdefghijklMNopqrstuvwxyz";
		
		s=s.toLowerCase();
		boolean allLetterPres=true;
		
		for(char ch ='a'; ch <= 'z'; ch++) {
			if(!s.contains(String.valueOf(ch))){
		    allLetterPres=false; 
		    break;
			}
		}
		if(allLetterPres) {
			System.out.println("This string is Panagram");
		}else {
			System.out.println("This string is not Panagram");
		}
		
		sc.close();
	}

}
