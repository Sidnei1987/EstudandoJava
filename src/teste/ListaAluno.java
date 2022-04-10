package teste;

import java.util.HashSet;
import java.util.Set;

public class ListaAluno {
	public static void main (String args[])
	{
		Set<Aluno> conjunto = new HashSet<Aluno>();
		Aluno a= new Aluno("Sidnei Mendes", "JAVA", 9.7);
		Aluno b= new Aluno("Gabi Mendes", "POO", 8.7);
		Aluno c= new Aluno("Luan Mendes", "FLUTTER", 7.7);
		Aluno d= new Aluno("Jonas Teixeira", "SO", 6.2);
		
		conjunto.add(a);
		conjunto.add(b);
		conjunto.add(c);
		conjunto.add(d);
		
		System.out.println(conjunto);
	}

}
