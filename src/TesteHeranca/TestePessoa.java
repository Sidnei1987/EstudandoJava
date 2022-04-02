package TesteHeranca;

public class TestePessoa {
	public static void main (String args[]) 
	{
		Pessoa sidnei = new Pessoa ("Sidnei",546);
		Funcionario1 tedy = new Funcionario1 ("Tedy",222,"TI");
		Pessoa gabi = new Funcionario1 ("Gabi",1213,"Engenheira de Software");
		Pessoa luan = new Coordenador ("Luan",656,"Geral");
		System.out.println(sidnei.getMatricula());
		System.out.println(tedy.getDepartamento());
		System.out.println(gabi.getMatricula());
		System.out.println(luan.getNome());
	}

}
