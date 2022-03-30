package PacoteJava;

import java.util.Scanner;

public class LacoRepeticao2 {
	public static void main (String args [])
	{
		Scanner entra = new Scanner (System.in);
		int idade;
		System.out.printf("\nEntre com a sua idade:");
		idade = entra.nextInt();
		
		while(idade>=1)
		{
		System.out.printf("\nSua idade: %d",idade );	
		if(idade>=18) 
		{
		  System.out.printf("\nVocê e de maior....");	
		}
		
		else
		{
			System.out.printf("\nvocê e meno de idade....");
		  }
		System.out.printf("\nEntre com a sua idade:");
		idade = entra.nextInt();
		}
	}

}
