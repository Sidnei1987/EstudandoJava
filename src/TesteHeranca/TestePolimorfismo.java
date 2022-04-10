package TesteHeranca;

public class TestePolimorfismo {
	public static void main (String args[])
	{
		PessoaFisica fisica = new PessoaFisica();
		fisica.setNome("Sidnei");
		fisica.setCpf(73807037304537L);
		
		PessoaJuridica juridica = new PessoaJuridica();
		juridica.setNome("Auto eletrico");
		juridica.setCnpj(3781027310837120L);
		
		Pessoa1 [] pessoas = new Pessoa1[2];
		pessoas[0] = fisica;
		pessoas[1] = juridica;
		
		for(Pessoa1 pessoa:pessoas)
		{
			System.out.println(pessoa.getNome());
		}
	}

}
