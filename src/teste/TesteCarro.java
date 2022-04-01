package teste;

public class TesteCarro {
	public static void main (String []args) {
		
		Carro meuCarro = new Carro();
		meuCarro.cor = "Vermelho";
		meuCarro.modelo = "Prisma";
		meuCarro.velocidadeAtual = 0;
		meuCarro.velocidadeMaxima = 40;
		
		meuCarro.liga();
		
		meuCarro.acelera(20);
		System.out.println(meuCarro.velocidadeAtual);
	}

}
