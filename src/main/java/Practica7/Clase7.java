/*
ESCRIBE UN PROGRAMA QUE PIENSE UN NUMERO AL AZAR ENTRE 0 Y 100. EL USUARIO DE-
BE ADIVINARLO Y TIENE PARA ELLO 5 OPPORTUNIDADES.DESPUES DE CADA INTENTO FALLIDO,
EL PROGRAMA DIRA CUANTAS OPORTUNIDADES QUEDAN Y SI EL NUMERO INTRODUCIDO ES 
MENOR O MAYOR QUE EL NUMERO SECRETO.
 */
package Practica7;

import java.util.*;

/**
 *
 * @author SebasTati
 */
public class Clase7 {

    public static void main(String[] args) {

        boolean acertado = false;
        int intentos = 5;
        short num, x;

        x = (short) (100 * Math.random() + 1);

        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("TIENES " + intentos + " intentos");
            System.out.println("INTRODUCE EL NUMERO A ADIVINAR: ");

            num = entrada.nextShort();

            intentos--;

            if (num == x) {
                acertado = true;
            } else if (x > num) {
                System.out.println("El numero a adivinar es mayor.");
            } else {
                System.out.println("El numero a adivinar es menor.");
            }
        } while (intentos > 0 && !acertado);

        if (acertado) {
            System.out.println("ENHORABUENA!!! HAS ACERTADO!!");
        } else {
            System.out.println("LO SIENTO, NO HAS ACERTADO. El numero era: " + x);
        }
    }

}
