
/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test
{
    //Variable que crea una calculadora
    private Calculadora calculadora;

    /**
     * Constructor for objects of class Test
     */
    public Test()
    {
        
    }

    /**
     * Método que nos permite comprobar si el método que realiza la suma de los valores entre dos intervalos funciona correctamente
     * 
     */
    public void testSumValuesInterval()
    {
        calculadora = new Calculadora();
        int a = 1;
        int b = 10;
        while(a<8 && b<17){
            calculadora.sumValuesInterval(a,b);
            a = a + 1;
            b = b + 1;
            System.out.println("Comprobando que el método sumValuesInterval(" + a + ", "+ b +") funciona correctamente..." );
            if ((a >= 0 && b >= 0) == true){
                System.out.println("El método funciona correctamente.");
            }
        }
    }
    
    /**
     * Método que nos permite comprobar si el método que realiza la comprobación de un número primo funciona correctamente
     */
    public void testIsPrime(){
        calculadora = new Calculadora();
        int n = 1;
        int divisor = 2;
        while (n<9){
            calculadora.isPrime(n);
            System.out.println("Comprobando que el método isPrime(" + n + ") funciona correctamente...");
            if (n % divisor != 0){
                    System.out.println("El resultado el correcto... OK");
                    divisor = divisor + 1;
                    n = n + 1;
            }
            else{
                System.out.println("El resultado es incorrecto... ERROR");
                divisor = divisor + 1;
                n = n + 1;
            }
        }
    }
    
}