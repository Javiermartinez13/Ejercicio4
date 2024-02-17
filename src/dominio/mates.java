package dominio;

import java.util.List;

public class mates {
    
    public static final String ListaRecursiva = null;
    public static final String MediaAritmetica = null;
    public static final String DesviacionTipica = null;
    public static final String Pares = null;
    public static final String ParesLista = null;
    public static String suma;
    public static String calcularProductoEscalar;

    public static int suma(int n) 
    {
        
        if (n == 0) 
        {
            return 0;
        }
        else 
        {
            return n + suma(n - 1);
        }
    }

    public static long Factorial(int n) 
    {

        if (n == 0) {
            return 1;
        } 
        else 
        {
            return n * Factorial(n - 1);
        }
    }

    public static long Potencia(int base, int exponente) 
    {
        if (exponente == 0) {
            return 1;
        } 
        else 
        {
            return base * Potencia(base, exponente - 1);
        }
    }

    public static int ListaRecursiva(List<Integer> lista) 
    {
        if (lista.isEmpty()) {
            return 0;
        }
         else 
        {
            
            return lista.get(0) + ListaRecursiva(lista.subList(1, lista.size()));
        }
    }

    public static double MediaAritmetica(List<Double> lista2) 
    {
        
        if (lista2.isEmpty()) 
        {
            return 0;
        }
         else 
        {
            return (lista2.get(0) + MediaAritmetica(lista2.subList(1, lista2.size()))) / lista2.size();
        }
    }  

    public static double DesviacionTipica(List<Double> lista3) 
    {

        if (lista3.isEmpty()) 
        {
            return 0.0;
        }

        double sumaCuadradosDiferencias = DesviacionTipica(lista3);

        return Math.sqrt(sumaCuadradosDiferencias / lista3.size());
    }

    public static int Pares(int n) 
    {
        if (n < 2) 
        {
            System.out.println("El valor de n debe ser mayor o igual a 2.");
            return 0;
        }

        if (n % 2 == 0) 
        {
            return n + Pares(n - 2);
        } 
        else 
        {
            return (n - 1) + Pares(n - 3);
        }
    }

    public static int ParesLista(List<Integer> numeros) 
    {
        int suma = 0;
        for (int numero : numeros) 
        {
        if (numero % 2 == 0) 
        {
            suma += numero;
        }
        }
        return suma;
    }

   

    public static int calcularProductoEscalar(List<Integer> lista5, List<Integer> lista6) 
    {

        if (lista5.size() != lista6.size() || lista5.isEmpty() || lista6.isEmpty()) 
        {
            System.out.println("Las listas deben tener el mismo tamaño y no estar vacías.");
            return 0; 
        }

        int resultado = 0;

        for (int i = 0; i < lista5.size(); i++) 
        {
            int elementoLista1 = lista5.get(i);
            int elementoLista2 = lista6.get(i);
            resultado += elementoLista1 * elementoLista2;
        }

        return resultado;
    }





}