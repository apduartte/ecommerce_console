package br.com.apduartte;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
     //   System.out.println( "Hello World!" );

 /*
  * Exercicio1
  Joao é um professor de matemática  e precisa de um prigra que faca a seguinte 
  expressão x: (x * 8 + y) - (x + y) / 100
  faça um progtra que resolva o problema da expressao que o joao precisa.
  Lembre-se: pense na usabilidade.
  */
    Scanner teclado = new Scanner(System.in);
    System.out.println("Digite o valor de x: ");
    int valorX = teclado.nextInt();
    System.out.println("Digite o valor de y: ");
    int valorY = teclado.nextInt();

    int resultado = ((valorX * 8) + valorY) - (valorX + valorY))/100;
    System.out.println("REsultado da Expressão é: " + resultado);

}
}