package suma;

import java.util.Scanner;

public class SumaMain {

    public static void main(String[] args) {
        
        //Colocamos un scanner para ingresar datos por teclado
        Scanner entrada = new Scanner(System.in);

        //Pedimos el primer valor al usuario
        System.out.println("Dame el primer valor: ");
        int valorUno = entrada.nextInt();

        //Pedimos segundo valor al usuario
        System.out.println("Dame el segundo valor: ");
        int valorDos = entrada.nextInt();

        //Reaizamos suma
        Suma valores = new Suma(valorUno, valorDos);
        valores.Imprimir();
    }

}
