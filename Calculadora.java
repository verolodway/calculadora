import java.util.ArrayList;
/**
 * Write a description of class Calculadora here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Calculadora
{

    /**
     * Constructor for objects of class Calculadora
     */
    public Calculadora()
    {
        
    }

    /**
     * An example of a method - replace this comment with your own
     */
    public void multiplesOfFive()
    {
        int numero = 10;
        int res = numero % 5;
        int limite = 15;
        while(res == 0 && numero<95){           
           if(numero>10 && numero<95){
            System.out.println(numero);
           }
           numero = numero + 5;
        }
    }
    
    /**
     * Método que nos permite sumar los números del 0 al 10
     */
    public int sumValues(){
        int numer = 0;
        int suma = numer+(numer+1);
        while(numer>=0 && numer<=10){
            System.out.println(suma);
            numer=numer++;
        }
        return suma;
    }
}
