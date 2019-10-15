package com.Exercise10Searches.app;

import java.util.Random;
import java.util.Scanner;

public class binarySearches {

	public static void main(String[] args)
	{
		
		
		//Constants declaration
	
		final int ELEMENTS_ARRAY=10;
		
		//Variables declaration
	
		int numberToFind=0;
		int indexFound=-1;
		
		int limInf=0;
		int limSup=ELEMENTS_ARRAY-1;
		int pivotal=limInf+(limSup-limInf)/2;
		int temp=0;
		
		
		//Object construction
	
		Random randomNumbers = new Random(System.nanoTime());
		Scanner input = new Scanner(System.in);
		
		
		
		//Array declaration	
	
		int[] miArraycito = new int [ELEMENTS_ARRAY];
		
		//Initializacion
		
			for(int i=0; i<ELEMENTS_ARRAY;i++)
			{
				miArraycito[i] = randomNumbers.nextInt(101);
			}
		
		//Array visualization
		for(int i=0;i<ELEMENTS_ARRAY; i++)
		{
			System.out.print(miArraycito[i]+"");
		}
		
		System.out.println("");
			
		//Sorting algorithm
		
		System.out.println("");

				for(int i=0; i<ELEMENTS_ARRAY; i++)
				{
					for(int j=0; j<ELEMENTS_ARRAY-1; j++)
					{
						if(miArraycito[j]>miArraycito[j+1])
						{
							temp=miArraycito[j+1];
							miArraycito[j+1]=miArraycito[j];
							miArraycito[j] = temp;
						}
					}
				}
				
				System.out.println("");
				
				
		
			
			//Array visualization
			for(int i=0;i<ELEMENTS_ARRAY; i++)
			{
				System.out.print(miArraycito[i]+"");
			}
			
			System.out.println("");
		
		//Ask the user for the number to find
	
		do
		{
			System.out.println("Input the number to find inside the Array(0-100)");
			numberToFind = input.nextInt();
			
			if(numberToFind<0)
			{
				System.out.println("Number must be zero or positive value!!");
			}
			
		}while(numberToFind<0);
		
		
		
		//Binary Search Algorithm
		
		while(limInf<=limSup)
		{
			pivotal=limInf+(limSup-limInf)/2;
			
			if(numberToFind==miArraycito[pivotal])
			{
				indexFound=pivotal;
				break;
			}
			else if(numberToFind>miArraycito[pivotal]) 
			{
				limInf =pivotal+1;
			}
			else if(numberToFind<miArraycito[pivotal])
			{
				limSup=pivotal-1;
			}
		}
		
		if(indexFound!=-1)
		{
			System.out.println("Element found at index:"+indexFound);
		}
		else
		{
			System.out.println("Element not present in the Array!!");
		}
		
		

	}

}
