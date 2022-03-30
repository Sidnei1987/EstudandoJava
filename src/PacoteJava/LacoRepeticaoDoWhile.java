package PacoteJava;

import java.util.Scanner;

public class LacoRepeticaoDoWhile {
	public static void main (String args [])
	{
		Scanner entra = new Scanner (System.in);
		int idade;
		
		
		//while com DO a diferencia que ela sai soinho ao termino e ja chama de novo pra uma nova entrada!!
		
		do
		{
			System.out.printf("\nEntre com a sua idade:");
			idade = entra.nextInt();
		System.out.printf("\nSua idade: %d",idade );	
		if(idade>=18) 
		{
		  System.out.printf("\nVocê e de maior....");	
		}
		
		else
		{
			System.out.printf("\nvocê e meno de idade....");
		  }
		
		
		}while(idade>=1);
		
	}

}