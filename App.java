package br.com.apduartte;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        /*
        mostre()
        leia()
         */

        BufferedReader ler = new BufferedReader(new InputStreamReader(System.in));

         int numero1 = 3;
         int numero2 = 5;

         int soma = numero1 + numero2;


        System.out.println("O resultado da operação é" + soma );
    }
}
