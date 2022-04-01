package POO;
//private para so class pessoa usar 

public class Pessoa {
	private String primeiroNome;
	private String ultimoNome;
	private String nomeDoMeio;
	
	
	//para deixa publico para todas as classe, mas o new pode ser usado para alterar 
	public Pessoa(String primeiro,String meio,String ultimo)
	{
		primeiroNome=primeiro;
		ultimoNome = ultimo;
		nomeDoMeio = meio;
	}
	
	public String getNomeCompleto()
	{
		String nomeCompleto = primeiroNome+" "+nomeDoMeio+" "+ultimoNome;
		return nomeCompleto;
	}
}
