package session1_assignment3;

import java.util.Scanner;

public class BitwiseAndLogicalAnd {

	public static void main(String[] args) {
		
		byte x;
		byte y;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the values of 'x' and 'y' with '0' or '1'");
		x = s.nextByte();
		y = s.nextByte();
		
		if(x == 0 && y== 0){
			System.out.println("LOGICAL AND value is '0'");	
		}
		else if(x == 0 && y == 1){
			System.out.println("LOGICAL AND value is '0'");
		}
		else if(x == 1 && y == 0){
			System.out.println("LOGICAL AND value is '0'");
		}
		else if(x == 1 && y == 1){
			System.out.println("LOGICAL AND value is '1'");
		}
		
		if(x == 0 & y== 0){
			System.out.println("BITWISE AND value is '0'");	
		}
		else if(x == 0 & y == 1){
			System.out.println("BITWISE AND value is '0'");
		}
		else if(x == 1 & y == 0){
			System.out.println("BITWISE AND value is '0'");
		}
		else if(x == 1 & y == 1){
			System.out.println("BITWISE AND value is '1'");
		}
		
		s.close();
	}

}
