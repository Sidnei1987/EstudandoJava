package teste;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Colecoes {
	public static void main  (String args [])
	{
		Collection<String> nomes = new ArrayList();
		nomes.add("Sidnei");
		nomes.add("Gabi");
		nomes.add("Luan");
		nomes.add("Lucia");
		
		
		for(String name : nomes)
		{
			System.out.println("Lista de nomes:" +name);
		}
		
		
		
//		Collection<String> nomes2 = Arrays.asList("Jo�o", "Pereira");
//		nomes.addAll(nomes2);
//		
//		System.out.println("Lista de nomes:" +nomes);
		
//		System.out.println("Cont�m o nome Sidnei?" +nomes.contains("Sidnei"));
//		System.out.println("Lista" +nomes);
		
//		System.out.println("Lista de nomes:" +nomes);
//		nomes.clear();
//		System.out.println("Lista de nomes:" +nomes);
//		System.out.println("Lista de nomes:" +nomes);
//		nomes.remove("Sidnei");
//		System.out.println("Lista de nomes:" +nomes);
//		if(nomes.isEmpty())
//		{
//			System.out.println("Lista vazia....");
//			
//		}
//		else
//		{
//			System.out.println("Lista de nomes:" +nomes);
//		}
//		
//		System.out.println("Lista de nomes:" +nomes);
	}

}
