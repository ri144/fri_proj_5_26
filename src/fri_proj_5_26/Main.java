package fri_proj_5_26;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		String name, num;
		String tax; 
		double sales, total;
		do{
			System.out.println("What is the customer's number?");
			num = sc.next();
			System.out.println("What is their name?");
			name = sc.next();
			System.out.println("What was the sales amount?");
			sales = sc.nextDouble();
			
			System.out.println("What is the corresponding tax code?");
			
			tax = sc.next();
			
			boolean invalid = false;
			do{
				invalid = false;
				if (!tax.equals("NRM") && !tax.equals("NPF") && !tax.equals("BIZ")){
					System.out.println("Invalid tax code, please try again");
					invalid = true;
					tax = sc.next();
				}
				
			}while(invalid);
			if (tax.equals("NRM")){
				total = sales * 1.06;
			}
			else if(tax.equals("NPF")){
				total = sales;
			}
			else{
				total = sales * 1.045;
			}
			DecimalFormat df = new DecimalFormat();
			df.setMaximumFractionDigits(2);
			System.out.printf("Total amount due: $" + df.format(total) + "\n");
			System.out.println("Do you want to enter another record? (Y/N)");
			if(sc.next().equals("N")){
				flag = false;
			}
			
		}while(flag);
	}
}
