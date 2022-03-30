package PacoteJava;

public class LacoRepeticao {
       public static void main (String args [])
       {
    	   int x,soma=0;
    	   // o para na programação e o FOR sempre tem o incio o fim e a condição
    	   for(x=1;x<=10;x++)
    	   {
    		  System.out.printf("\n%d",x); 
    		  soma = soma +x; // o print  dentro do for fica mostrando a soma a cada contagem!
    		  //System.out.printf("\nSoma total: %d",soma);
    	   } 
    	   System.out.printf("\nSoma total: %d",soma);
       }
}
