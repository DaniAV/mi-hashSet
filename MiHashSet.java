import java.util.Arrays;
/**
 * Write a description of class MiHashSet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MiHashSet
{
    // instance variables - replace the example below with your own
    private int lista[];

    /**
     * Constructor for objects of class MiHashSet
     */
    public MiHashSet()
    {
        // initialise instance variables
        lista = new int[0];
    }

    /**
     * añade el elemento al conjunto si no estaba. Devuelve verdadero en caso 
     * de que el elemento no estuviera presente en el conjunto y falso en caso contrario.
     */
    public boolean add(int valor) //arreglar errores
    {
        boolean exist = false;
        if(lista.length > 0)
        {
            int[] arrayNuevo = new int[lista.length + 1];
            for (int i=0; i < lista.length; i++)
            {
                arrayNuevo[i] = lista[i];
            } 
            arrayNuevo[arrayNuevo.length-1]= valor;
            lista = arrayNuevo;
            for(int i=0; i<lista.length;i++)
            {
                int temp = lista[i];
                if(temp != valor)
                {
                    exist = true;
                    lista[0] = valor;
                }
            }
        }
        else
        {
            lista = new int[lista.length+1];
            lista[0] = valor;
            exist = true;
        }
        return exist;
    }

    /**
     * vacía el conjunto.
     */
    public void clear()
    {
        lista = new int[0];
    }

    /**
     *  devuelve verdadero si el conjunto contiene el elemento, falso en caso contrario.
     */
    public boolean contains(int elemento)
    {
        boolean exist = false;
        for(int i=0; i<lista.length;i++)
        {
            int temp = lista[i];
            if(temp == elemento)
            {
                exist = true;
            }
        }
        return exist;
    }

    /**
     * devuelve verdadero si el conjunto no contiene elementos.
     */
    public boolean isEmpty()
    {
        boolean empty = true;
        if(lista.length >0)
        {
            empty = false;
        }
        return empty;

    }

    /**
     * elimina del conjunto el elemento dado. Si no existiera devuelve falso; 
     * si existía en el conjunto devuelve verdadero.
     */
    public boolean remove(int elemento)//falta hacer
    {
        boolean exist = false;

        return exist;
    }

    /**
     *  devuelve el número de elementos del conjunto.
     */
    public int size()
    {
        int numeroDeElementos = 0;
        for(int i=0; i<lista.length;i++)
        {
            numeroDeElementos++;
        }
        return numeroDeElementos;
    }

    /**
     * devuelve una cadena conteniendo todos los elementos del conjunto separados por comas 
     * y entre corchetes.
     */
    public String toString()
    {
        String cadena = "";
        for(int i=0; i<lista.length;i++)
        {
            cadena = "[" + cadena + lista[i] +"]" + ",";
        }

        return cadena;
    }

    /**
     * devuelve verdadero si el parámetro es igual al conjunto sobre el que se invoca y falso 
     * en otro caso.
     */
    public boolean equals(MiHashSet otroConjunto)
    {
        boolean exist = false;

        return exist;
    }
}
