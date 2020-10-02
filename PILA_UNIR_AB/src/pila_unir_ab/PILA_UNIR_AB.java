
package pila_unir_ab;

import java.util.Scanner;

/**
 *
 * @author Isaac Tabarez
 */
public class PILA_UNIR_AB {

    public static void main(String[] args) {
        System.out.println(" ¿Cúal sera el tamaño de tus pilas? ");
        Scanner teclado = new Scanner(System.in);
        //Declaramos las variables de las pilas con su tamaño ingresado por el Usuario 
        int ta = teclado.nextInt();
        int pila1[] = new int[ta];
        int pila2[] = new int[ta];

        //Declaramos los topes de las pilas
        int tope1 = 0;
        int tope2 = 0;

        //Declarar variables auxiliares para crear la pila 3
        int aux1, aux2, total, subtotal;

        //Hacemos un pequeño menu con las acciones que deseemos realizar 
        int elegir = 0;
        do {
            System.out.println("\n   *****MENU*****\n "
                    + " 1_Llenar las pilas con datos aleatorios\n "
                    + " 2_Mostrar datos de las pilas\n "
                    + " 3_Vaciar datos de la pila1 y 2\n "
                    + " 4_Unir valores de la pila1 y pila2\n "
                    + " 5_Mostra la pila 3 \n "
                    + " 6_Salir de la pilas\n ");

            switch (elegir = teclado.nextInt()) {
                //llenar las pilas A y B
                case 1:
                    if (tope1 < ta) {
                        System.out.println(" Se han agregado datos a las pilas 1 y 2  ");
                        for (int i = 0; tope1 < ta; i++) {
                            //Metodo Random para datos del 0 al 100
                            pila1[tope1] = (int) (Math.random() * 100);
                            tope1++;
                        }
                    }
                    if (tope2 < ta) {
                        for (int i = 0; tope2 < ta; i++) {
                            //Metodo Random para datos del 100 al 200
                            pila2[tope2] = (int) (Math.random() * 100 + 100);
                            tope2++;
                        }
                    } 
                    
                    break;

                //Mostrar los datos de las pilas 1 y 2
                case 2:
                    System.out.println("\n La pila1 contiende estos datos del 0 al 100 ; ");

                    for (int i = tope1 - 1; i >= 0; i--) {
                        System.out.print(" " + pila1[i]);

                    }
                    System.out.println("\n La pila2 contiende estos datos del 100 al 200 ; ");
                    for (int i = tope2 - 1; i >= 0; i--) {
                        System.out.print(" " + pila2[i]);
                    }

                    break;
                //Vaciar las pilas 1 y 2 por completo 
                case 3:
                    for (int i = 0; i < ta; i++) {
                        tope1--;
                    }
                    for (int i = 0; i < ta; i++) {
                        tope2--;
                    }
                    System.out.println(" Las pilas 1 y 2 se han vaciado por completo ");
                    break;
                //Unir valores de las pilas 1 y 2 para dar como resultado la pila3
                case 4:
                    System.out.println(" Se ha creado la pila 3 con la datos de la pila 1 y 2 ");
                    for (int i = ta - 1; i >= 0; i--) {
                        aux1 = pila1[i];
                        aux2 = pila2[i];
                        subtotal = aux1 + aux2;
                        total = subtotal;
                    }
                    break;
                //Mostrar datos de la pila3
                case 5:
                    System.out.println(" La pila3 esta conforme por estos datos;  ");
                    for (int i = ta - 1; i >= 0; i--) {
                        aux1 = pila1[i];
                        aux2 = pila2[i];
                        subtotal = aux1 + aux2;
                        total = subtotal;
                        System.out.print(total + " ");
                    }
                    break;

            }
        } while (elegir != 6);
    }
}
