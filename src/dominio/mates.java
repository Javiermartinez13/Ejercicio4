package dominio;

import java.util.List;

public class mates {
    
    public static final String ListaRecursiva = null;
    public static final String MediaAritmetica = null;
    public static final String DesviacionTipica = null;
    public static String suma;

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




}