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
        int suma = 0;
        int numero = 1;
        while(numero<=10){
            suma = numero + suma;
            numero = numero + 1;
        }
        return suma;
    }
    
    /**
     * Método que recibe dos parámetros enteros a y b y devuelve la suma de los valores comprendidos entre dichos parámetros (ambos incluidos)
     */
    public int sumValuesInterval(int a, int b){
        if (a >= 0 && b >= 0){
            if(b < a){
            a = b;
            b = a;
           }
            else if (b == a){
            return a;
            }
           int suma = 0;
           while (a < b){
              suma = suma+a;
              a = a + 1;
           }
           return suma;
        }
        else{
            return -1;
        }
    }
    
    /**
     * Método que nos permite saber si un número es o no primo
     */
    public boolean isPrime(int n){
        int divisor = 2;
        int resultado = n/divisor;
        if (n > 1){
            while (divisor <= (n-1)){
                resultado = n/divisor;
                if (n % divisor != 0){
                    divisor = divisor + 1;
                    return true;
                }
            }
        }
        else{
            System.out.println("El parámetro establecido no es válido."); 
        }
        return false;
    }
}
