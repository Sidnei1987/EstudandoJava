package teste;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class MapaAluno {
	public static void main(String args[])
	{
		Map<String,Aluno> mapa = new TreeMap<String,Aluno>();
		
		Aluno a= new Aluno("Sidnei Mendes", "JAVA", 9.7);
		Aluno b= new Aluno("Gabi Mendes", "POO", 8.7);
		Aluno c= new Aluno("Luan Mendes", "FLUTTER", 7.7);
		Aluno d= new Aluno("Jonas Teixeira", "SO", 6.2);
		
		
		mapa.put("Sidnei Mendes",a);
		mapa.put("Gabi Mendes",b);
		mapa.put("Luan Mendes",c);
		mapa.put("Jonas Teixeira",d);
		
		System.out.println(mapa);
		System.out.println(mapa.get("Sidnei Mendes"));
		
		Collection<Aluno> alunos = mapa.values();
		for(Aluno e:alunos)
		{
			System.out.println(e);		}
		
	}

}
