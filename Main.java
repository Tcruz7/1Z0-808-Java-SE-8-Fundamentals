package com.thiago.java.holamundo;
import java.lang.Math;

public class Main {

    static int [] numeros = new int[5];
    static int [] items = {1,2,3,4,5,6,7,8,9,10};

    private static void inicializarGrupo() {
        for (i=0; i<5 ; i++){
            numeros[i] = 0;
        }
    }

    private static void printarItems() {
        for (i=0; i< items.length ; i++){
            System.out.println((items[i]));
        }
    }
    public static void main(String[] args) {
	// Declaracion de variables de tipo entero
       int x;
       int y;

       x = 5;
       y = 5;

        //System.out.println("El resultado de la Suma es: " + sumar(x, y));
        //System.out.println("El resultado de la resta es: " + restar(x, y));
        //System.out.println("El resultado de la multiplicacion es: " + multiplicar(x, y));
        //System.out.println("Mod: " + (x%y));
        System.out.println("posicion 0: " + numeros[0]);
        try {
            System.out.println("El resultado de la Division es: " + dividir( x, y));

        } catch (ArithmeticException e){
            System.out.println("Division por zero!!");

        } catch (Exception e) {
            System.out.println("Error general!!");
        }



        double resultadoPotencia;
        //resultadoPotencia = Math.pow(x,y);
        resultadoPotencia = calcularPotencia(x,y);

        /*if (resultadoPotencia == 0.0) {
            System.out.println("Imposible calcular numeros negativos");
        } else {
            System.out.println("Potencia: " + resultadoPotencia);
        }*/

        inicializarGrupo();
        printarItems();
    }
    /**
     * Funcfion que devulve la Potencia entre a y b.
     * @param a primer operando
     * @param b segundo operando
     * @return resultado de la potencia
     */
    public static double calcularPotencia(int a, int b){
        if (b < 0) return 0.0;
        return Math.pow(a,b);

    }

    /**
     * Funcfion que devulve la suma de a y b.
     * @param a primer operando
     * @param b segundo operando
     * @return resultado de la suma
     */
    public static int sumar(int a, int b ) {
        return a + b;
    }

    /**
     * Funcfion que devulve la resta de a y b.
     * @param a primer operando
     * @param b segundo operando
     * @return resultado de la resta
     */
    public static int restar(int a, int b) {
        //TODO: estudiar el valor a devolver cuando el valor sea 0.0
        //if (b < 0) return 0.0;
        return a - b;

    }

    /**
     * Funcfion que devulve la multiplicacion de a y b.
     * @param a primer operando
     * @param b segundo operando
     * @return resultado de la multiplicacion
     */
    public static int multiplicar(int a, int b) {
        return a * b;

    }

    /**
     * Funcfion que devulve la division de a y b.
     * @param a primer operando
     * @param b segundo operando
     * @return resultado de la division
     */
    public static int dividir(int a, int b) throws ArithmeticException, Exception {
        int resultado = 0;

        try {
            resultado = a / b;
            }catch (ArithmeticException e){
                throw e;
        }

        return resultado;

    }

}
