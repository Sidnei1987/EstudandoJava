package teste;

public class MetodoSobrecarregado {
	public void testaMetodosSobrecarregados()
	{
		System.out.printf("Sal�rio em numero intero: %d \n", salario(1000));
		System.out.printf("Sal�rio em numero double: %f \n", salario(7.500));
	}
	public int salario(int valorInt)
	{
		System.out.printf("Sal�rio com argumento inteiro: %d \n", valorInt);
		return valorInt * valorInt;
	}
	public double salario(double vaoDouble)
	{
		System.out.printf("Sal�rio com argumento double: %f \n", vaoDouble);
		return vaoDouble * vaoDouble;
	}

}
