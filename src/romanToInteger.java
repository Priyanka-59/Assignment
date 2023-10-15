//2. Enter a Roman Number as input and convert it to an integer. (Example: IX = 9)

import java.util.HashMap;
import java.util.Scanner;

public class romanToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc  = new Scanner(System.in);
		System.out.print("Enter Roman Number : ");
		String s = sc.nextLine();
		
		HashMap<Character, Integer> m = new HashMap<>();
		
		m.put('I',1);
		m.put('V',5);
		m.put('X',10);
		m.put('L',50);
		m.put('C',100);
		m.put('D',500);
		m.put('M',1000);
		
		int result = m.get(s.charAt(s.length()-1));
		
		for(int i = s.length()-2; i>=0; i--) {
			if(m.get(s.charAt(i))< m.get(s.charAt(i+1))){
				result = result - m.get(s.charAt(i));
			}else {
				result = result + m.get(s.charAt(i));
			}
		}
		
		System.out.println("The Integer number of a given roman number is " + result);
		sc.close();
	}

}
