package PacoteJava;

import java.util.Scanner;

public class Condicional1 {
	public static void main (String args[])
	{
		Scanner ler = new Scanner (System.in);
		int idade;
		String nome;
		
		System.out.printf("Entre com sua idade:");
		idade = ler.nextInt();
		ler.nextLine();
		System.out.printf("Entre com o seu nome:");
		nome = ler.nextLine();
		System.out.printf("\nSeu nome:%s",nome);
		System.out.printf("\nSua idade e:%d",idade);
		// if agt para fazer uma confirma��o ou compara��o 
		if(idade >=18)
		{
			System.out.printf("\nVoc� e maior de idade....");
		}
		else if(idade>=1 && idade<18)
		{
			System.out.printf("\nVoc� e menor de idade....");
		}
		else
		{
			System.out.printf("\n Voc� entro com um idade invalida....");
		}
	}
}
