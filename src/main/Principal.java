package main;
import java.util.ArrayList;
import java.util.List;

import dominio.*;
public class Principal {
    
    public static void main(String[] args) 
    {
        int n = 5;
        System.out.println("La suma de los números del 0 al " + n + " es: " + mates.suma(n));

        int numero = 5; 
        System.out.println("El factorial de " + numero + " es: " + mates.Factorial(numero));

        int base = 2; 
        int exponente = 3; 
        System.out.println(base + " elevado a la " + exponente + " es: " + mates.Potencia(base, exponente));

        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        System.out.println("La suma de los elementos de la lista es: " + mates.ListaRecursiva);

        List<Double> lista2 = new ArrayList<>();
        lista2.add(1.0);
        lista2.add(2.0);
        lista2.add(3.0);
        lista2.add(4.0);
        lista2.add(5.0);
        System.out.println("La media aritmética de la lista es: " + mates.MediaAritmetica);

        List<Double> lista3 = new ArrayList<>();
        lista3.add(1.0);
        lista3.add(2.0);
        lista3.add(3.0);
        lista3.add(4.0);
        lista3.add(5.0);
        System.out.println("La desviación típica de la lista es: " + mates.DesviacionTipica);

        int m = 9;
        System.out.println("La suma de los primeros números pares hasta " + m + " es: " + mates.Pares);

        List<Integer> lista4 = new ArrayList<>();
        lista4.add(1);
        lista4.add(2);
        lista4.add(3);
        lista4.add(4);
        System.out.println("La suma de los elementos pares de la lista es: " + mates.ParesLista);

        List<Integer> lista5 = List.of(1, 2, 3);
        List<Integer> lista6 = List.of(2, 4, 6);

        System.out.println("El producto escalar de las listas es: " + mates.calcularProductoEscalar);


        

        
    }

        
}



