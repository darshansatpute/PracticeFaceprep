package com.darshanit;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter first number");
		int number1=scan.nextInt();
		
		System.out.println("Please enter second number \n");
		int number2=scan.nextInt();
	    //Took input from your Number 1 and Number 2

		
		System.out.println(" Please choose any one from  following options   \r\n"
				+ "1 -  Add the two numbers\r\n"
				+ "\r\n"
				+ "2 - Subtract the two numbers\r\n"
				+ "\r\n"
				+ "3 - Multiply the two numbers\r\n"
				+ "\r\n"
				+ "4 - Divide the two numbers \r\n");
		int Option=scan.nextInt();
		
		if(Option==1)
		{
		   int sum=number1+number2;
		   System.out.println("Addition is: "+sum);
		}
		else if(Option==2)
		{
		   int result=number1-number2;
		   System.out.println("Substraction is: "+result);
		}
		else if(Option==3)
		{
		   int result=number1*number2;
		   System.out.println("Multiplication result is: "+result);
		}
		else if(Option == 4)
		{
			if(number2==0)
			{
				System.out.println("Cannot be device by 0");
			}
			else
			{
		       int result=number1/number2;
		      System.out.println("Division result is: "+result);
			}
		}
		else {
			System.out.println("Please enter optiona 1 to 4");
		}
		
	}

}
