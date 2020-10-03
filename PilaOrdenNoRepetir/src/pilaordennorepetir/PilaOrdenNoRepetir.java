
package pilaordennorepetir;

import java.util.Scanner;

public class PilaOrdenNoRepetir {
    public static void main(String[] args) {
        //Declarar la variable pilaOrden y tope
        char pilaOrden[] = new char[26];
        int tope = 0;

        Scanner teclado = new Scanner(System.in);
        //Hacemos un pequeño menu con las acciones que deseemos realizar 
        int elegir = 0;
        do {
            System.out.println("\n   *****MENU*****\n "
                    + " 1_Llenar la pila en orden aleatorio\n "
                    + " 2_Mostrar valores de la pila\n "
                    + " 3_Ordenar valores de la pila\n "
                    + " 4_Eliminar valores de la pila\n "
                    + " 5_Agregar valores de la pila\n "
                    + " 6_Salir de la pila\n ");

            switch (elegir = teclado.nextInt()) {
                //Caso 1 = Llenar datos de forma aleatoria con valores que no se repitan 
                case 1:
                    if(tope<26){
                    System.out.println("La pila se ha llenado con valores de A a Z sin repetir");
                    //La pila se llenara con valores de A a Z aleatorios
                    pilaOrden[tope]= (char)('A'+ Math.random()*26);
                    for(tope = 0 ; tope<26; tope++ ){
                    pilaOrden[tope]= (char)('A'+ Math.random()*26);
                    for(int x=0 ; x<tope; x++ ){
                    //Con este if no se repetiran los valores , eliminandolos por comppleto 
                    if (pilaOrden[tope]==pilaOrden[x]){
                         tope--;
                     }   
                     }
                    }
                    }else{
                        System.out.println(" La pila ya esta llena con los datos sin repetir ");
                    }
                    break;
                //Caso 2 = Mostrar los datos que contieen la pila 
                case 2:
                    System.out.println(" La pila contiende estos datos; ");
                    //Este for mostrara los datos que estan entre la posicion 0 hasta la 26
                    for (int i = tope - 1; i >= 0; i--) {
                        System.out.print(" " + pilaOrden[i]);

                    }
                    break;
                //Caso 3 = Ordenar loa datos correctamente
                case 3:
                    //Metodo Burbuja
                    int ordenar;
                    System.out.println(" La pila ya esta ordenada ");
                    for (int i = 0; i < 26; i++) {
                        for (int p = 0; p < i; p++) {
                            if (pilaOrden[i] < pilaOrden[p]) {
                                ordenar = pilaOrden[i];
                                pilaOrden[i] = pilaOrden[p];
                                pilaOrden[p] = (char) ordenar;

                            }
                        }
                    }
                    break;
                //Caso 4 = Eliminar un dato
                case 4:
                    //Tope se va a reducir una posicion 
                    tope--;
                    System.out.println(" Un dato ha sido eliminado ");
                    break;
                //Caso 5 = Ingresar un valor de cualquier tipo
                case 5:
                    if (tope < 26) {
                        //Ingresar un dato manual en la posicion tope
                        System.out.println(" Ingresa el dato que quieres agregar\n ");
                        pilaOrden[tope] = teclado.next().charAt(0);
                        tope++;
                    } else {
                    }
                    System.out.println(" Un dato ha sido Agregado ");
                    break;
            }
        //Salir del ciclo 
        } while (elegir != 6);
    }
}

   
    
    

