package PacoteJava;

import java.util.Scanner;

public class Vetor1 {
	public static void main(String[] args)
	{
		Scanner entrada = new Scanner(System.in);
		
		int [] arrayUm = {12,3,5,68,9,6,73,44,456,65,321};
		int [] arrayDois = {43,42,4,8,55,21,2,45};
		
		float[] nota=new float[5];
		
		//tamanho do array
		if (arrayDois.length >8) {
			System.out.println("Tamanho do ArrayDois - maior 8!");
		} else {
			System.out.println("Tamanho do ArrayDois - menor 8!");
		}
		System.out.println("Tamanho do ArrayUm = "+arrayUm.length);
		
		//utilizando do for-each e uma e volu��o do for com ele n�o precisa dizer quanto o for tem que para no array 
		
		String[] cars = {"volvo","","Ford","Mada"};
		
		for (String i : cars) {
			System.out.println(i);
		}
		
		//populando um array 
		for (int i=0;i<5;i++) 
		{
			System.out.println("Entre com uma nota: ");
			nota[i]= entrada.nextFloat();
		}
		//apresentando um array 
		for(int i=0;i<5;i++)
		{
			System.out.println("Nota " +i+1+"="+nota[i]);
		}
		
	}

}
