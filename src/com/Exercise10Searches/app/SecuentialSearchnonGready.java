package com.Exercise10Searches.app;

import java.util.Random;
import java.util.Scanner;



public class SecuentialSearchnonGready {

	public static void main(String[] args)
	
	{
		//Constants declaration
		
		final int ELEMENTS_ARRAY=10;
		
		
		//Variable declaration
		
		int numberToFind=0;
		int indexfound=-1;
		boolean isFound=false;
		
		
		
		//Array declaration
		int[] vector = new int[ELEMENTS_ARRAY];
		
		Random numbers =new Random(System.nanoTime());
		Scanner input = new Scanner(System.in);
		
		for(int i=0;i<ELEMENTS_ARRAY;i++)
		{
			vector[i] = numbers.nextInt(101);
		}
		
		for(int i=0; i<ELEMENTS_ARRAY; i++)
		{
			System.out.print(vector[i]+" ");
		}
		
		do
		{
			System.out.println("Input the value to find inside the element:");
			
			numberToFind=input.nextInt();
			if(numberToFind<0)
			{
				System.out.println("Number must be greater than or equal to Zero!!");
			}
				
		} while(numberToFind<0);
		
		for(int i=0; i<ELEMENTS_ARRAY; i++)
		{
			if (numberToFind==vector[i])
				
			{
				indexfound=i;
				break;
				
				}
			
		}
		
		if (indexfound!=-1)
		{
			System.out.println("element found at index"+indexfound);
		}
		
		else
		{
			System.out.println("element not found");
		}
		
		
		
		int i=0;
		while(isFound==false && i<ELEMENTS_ARRAY)
		{
			if(numberToFind==0) 
				{
					indexfound=i;
					isFound=true;
				}i++;
		}
		
		
		if (indexfound!=-1)
		{
			System.out.println("element found at index"+indexfound);
		}
		
		else
		{
			System.out.println("element not found");
		}
		
		input.close();
		
	}

}
