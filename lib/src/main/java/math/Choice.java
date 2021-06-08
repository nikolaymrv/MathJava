package math;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Choice {

		public int choice(Scanner sc) {
			int figure = 0;
			//boolean flag = true;
		
			for (int i = 0; i < 3; i++) {
//			while (flag) {
			System.out.println("Enter the number of figure");
			System.out.println("1 = Triangle");
			System.out.println("2 = Square");
			System.out.println("3 = Circle");
			System.out.println("4 = Right Triangle");
			System.out.println("5 = Rectangular");
		
			
			try {
				List<Integer> paramList = new ArrayList<>();
				String input = sc.next();
				figure = Integer.parseInt(input);
				
				
//				flag = false;
				paramList.add(figure);
				break;
				
				} catch (NumberFormatException e) {
					System.out.println("Please, enter again (incorrect data entered)");
				System.out.println("Catch Exception:" + e.getMessage() + " " + e.toString());
//				choice(sc);
			}
			}
			
			
			
			return figure;
			
		}
}
