
package colas1.pkg1;

import java.util.Scanner;

/**
 *34
 * @author Isaac Tabarez
 */
public class COLAS11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int topep = 0, frente = 0, variable, aux, tam;
        char cola[] = new char[26];

        do {

            System.out.println("*** MENU ***");
            System.out.println("1-Cola Manual");
            System.out.println("2-Cola con el Abecedario");
            System.out.println("3-Cola con el Abecedario desordenado");
            System.out.println("4-Unir colas A y B");
            System.out.println("5-Cola con el Abecedario desordenado sin repetir");
            System.out.println("***Selecciona una Opcion***");

            switch (variable = sc.nextInt()) {

                case 1:

                    System.out.println("¿Cual sera el tamaño de la cola...");
                    char cola1[] = new char[tam = sc.nextInt()];

                    do {

                        System.out.println("*****Cola Manual*****");
                        System.out.println("1_Encolar un valor\n"
                                + "2_Mostrar los valores de la cola\n"
                                + "3_Desencola\n"
                                + "***Selecciona una opcion***\n");

                        switch (variable = sc.nextInt()) {
                            case 1:
                                if (topep < tam) {
                                    System.out.println("Ingresa el valor a la cola");
                                    cola1[topep] = sc.next().charAt(0);
                                    topep++;
                                } else {
                                    System.out.println("La cola ya esta llena");
                                }
                                break;
                            case 2:
                                if (topep > 0) {
                                    System.out.println("La cola contiene estos valores:\n");
                                    for (int i = frente; i < tam; i++) {
                                        System.out.print(" " + cola1[i]);

                                    }
                                    System.out.println("\n");
                                } else {
                                    System.out.println("La cola no tiene valores...");
                                }
                                break;
                            case 3:
                                if (topep > 0) {
                                    System.out.println("Se ha desencolado un valor\n");
                                    for (int i = frente; i < tam - 1; i++) {
                                        cola1[i] = cola1[i + 1];
                                    }
                                    topep--;
                                } else {
                                    System.out.println("la cola no tiene valores para eliminar");
                                }

                                break;
                        }
                    } while (variable != 4);
                    break;
                case 2:
                    do {
                        System.out.println("*****Cola con el Abecedario*****");
                        System.out.println("1_Llenar la cola con el abecedario\n"
                                + "2_Mostrar los valores de la cola\n"
                                + "3_Desencolar un valor\n"
                                + "4_Encolar un valor\n"
                                + "***Selecciona una opcion***\n");
                        switch (variable = sc.nextInt()) {
                            case 1:
                                if (topep <= 26) {
                                    System.out.println("Se ha agregado valores con el abecedario\n");
                                    for (int i = frente; topep < 26; i++) {
                                        cola[topep] = (char) ('a' + i);
                                        topep++;
                                    }
                                }
                                break;
                            case 2:
                                if (topep > 0) {
                                    System.out.println("La cola tiene estos valores:\n");
                                    for (int i = frente; i < topep; i++) {
                                        System.out.print(" " + cola[i]);
                                    }
                                    System.out.println("\n");
                                } else {
                                    System.out.println("La cola no tiene valores");
                                }

                                break;
                            case 3:
                                if (topep > 0) {
                                    System.out.println("El primer valor se ha eliminado\n");
                                    for (int i = frente; i < topep - 1; i++) {
                                        cola[i] = cola[i + 1];
                                    }
                                    topep--;
                                } else {
                                    System.out.println("La cola no tiene valores ");
                                }

                                break;
                            case 4:
                                if (topep <= 26) {
                                    System.out.println("Encolar un valor");
                                    cola[topep] = sc.next().charAt(0);
                                    topep++;
                                } else {
                                    System.out.println("La cola esta llena");
                                }

                                break;
                        }
                    } while (variable != 5);
                    break;
                case 3:
                    System.out.println("*****Cola con el Abecedario desordenado*****");
                    do {
                        System.out.println("1_Llenar la cola con el abecedario desordenado\n"
                                + "2_Mostrar los valores de la cola\n"
                                + "3_Desencolar un valor\n"
                                + "4_Encolar un valor\n"
                                + "5_Ordenar valores de la cola\n"
                                + "***Selecciona una opcion***\n");
                        switch (variable = sc.nextInt()) {
                            case 1:
                                if (topep <= 26) {
                                    System.out.println("\"Se ha agregado valores con el abecedario desordenado\n");
                                    for (int i = frente; topep < 26; i++) {
                                        cola[topep] = (char) ('a' + Math.random() * 26);
                                        topep++;
                                    }
                                }

                                break;
                            case 2:
                                if (topep > 0) {
                                    System.out.println("Los valores de la cola son:\n");
                                    for (int i = frente; i < topep; i++) {
                                        System.out.print(" " + cola[i]);
                                    }
                                    System.out.println("\n");
                                } else {
                                    System.out.println("La cola esta vacia");
                                }

                                break;
                            case 3:
                                if (topep > 0) {
                                    System.out.println("El primer valor se ha eliminado\n");
                                    for (int i = frente; i < topep - 1; i++) {
                                        cola[i] = cola[i + 1];
                                    }
                                    topep--;
                                } else {
                                    System.out.println("La cola esta vacia");
                                }

                                break;
                            case 4:
                                if (topep <= 26) {
                                    System.out.println("Encolar un valor");
                                    cola[topep] = sc.next().charAt(0);
                                    topep++;
                                } else {
                                    System.out.println("La cola esta llena");
                                }

                                break;
                            case 5:
                                System.out.println("La cola se ha ordenado alafabeticamente");
                                for (int i = 0; i < 26; i++) {
                                    for (int j = 0; j < i; j++) {
                                        if (cola[i] < cola[j]) {
                                            aux = cola[i];
                                            cola[i] = cola[j];
                                            cola[j] = (char) aux;
                                        }
                                    }
                                }

                                break;
                        }
                    } while (variable != 6);
                    break;
                case 4:
                    System.out.println("El tamaño de las colas sera de: ");
                    int tope1 = 0;
                    tam = sc.nextInt();
                    int Colax[] = new int[tam];
                    int Colay[] = new int[tam];
                    int Colaz[] = new int[tam];
                    int T = 0,
                     T2 = 0;
                    do {
                        System.out.println("*****Unir colas A y B*****");

                        System.out.println("1_LLenar colas A y B\n"
                                + "2_Unir colas A y B\n"
                                + "3_Mostrar valores de las colas A y B\n"
                                + "4_Desencolar valores de las colas\n"
                                + "5_Mostrar  valores de la Cola C\n"
                                + "***Selecciona una opcion***\n");
                        switch (variable = sc.nextInt()) {
                            case 1:
                                if ((topep & T) < tam) {

                                    System.out.println("Se han lleando las colas A y B\n");
                                    for (int i = frente; topep < tam; i++) {
                                        Colax[topep] = (int) (Math.random() * 100);
                                        topep++;
                                    }
                                    for (int i = frente; T < tam; i++) {
                                        Colay[T] = (int) (100 + Math.random() * 100);
                                        T++;
                                    }
                                }
                                System.out.println("\n");
                                break;
                            case 2:
                                if ((topep & T) > 0) {
                                    System.out.println("Las colas A y B se han unido");
                                    for (int i = 0; T2 < tam; i++) {
                                        Colaz[i] = (Colax[i] + Colay[i]);
                                        T2++;
                                    }
                                } else {
                                    System.out.println("No se encuentras colas para unir");
                                }
                                break;
                            case 3:
                                if ((topep & T) > 0) {
                                    System.out.println("Valores cola A:\n");
                                    for (int i = frente; i < topep; i++) {
                                        System.out.print(" " + Colax[i]);
                                    }
                                    System.out.println("\nValores Cola B: \n");
                                    for (int i = frente; i < T; i++) {
                                        System.out.print(" " + Colay[i]);
                                    }
                                } else {
                                    System.out.println("Las colas estan vacias");
                                }
                                System.out.println("\n");
                                break;
                            case 4:
                                System.out.println("Las colas se han vaciado");
                                topep = 0;
                                T = 0;
                                T2 = 0;
                                break;
                            case 5:
                                if (T2 > 0) {
                                    System.out.print("Valores de la cola C:\n");
                                    for (int i = frente; i < T2; i++) {
                                        System.out.print(" " + Colaz[i]);
                                    }
                                    System.out.print("\n");
                                } else {
                                    System.out.println("No hay Cola C");
                                }
                                System.out.print("\n");

                                break;
                        }
                    } while (variable != 6);
                    break;

                case 5:
                    do {
                        System.out.println("*****Cola con el Abecedario desordenado sin repetir******");
                        System.out.println("1_Llenar Cola con valores del Abecedario desordenado sin repetir\n"
                                + "2_Mostra valores de la cola\n"
                                + "3_Desencolar un valor\n"
                                + "4_Encolar un valor\n"
                                + "5_Ordenar valores de la cola Alfabeticamnete\n"
                                + "***Selecciona una opcion ***\n");
                        switch (variable = sc.nextInt()) {
                            case 1:
                                if (topep < 26) {
                                    System.out.println("Se ha llenado la cola");
                                    cola[topep] = (char) (Math.random() * 26 + 'a');
                                    for (topep = 0; topep < 26; topep++) {//a
                                        cola[topep] = (char) (Math.random() * 26 + 'a');
                                        for (int j = frente; j < topep; j++) {
                                            if (cola[topep] == cola[j]) {
                                                topep--;        //a
                                            }
                                        }
                                    }
                                } else {
                                    System.out.println("La cola ya esta llena");
                                }

                                break;
                            case 2:
                                if (topep > 0) {
                                    System.out.println("los valores de la cola son:\n");
                                    for (int i = frente; i < topep; i++) {
                                        System.out.print(" " + cola[i]);
                                    }
                                    System.out.println("\n");
                                } else {
                                    System.out.println("La cola esta vacia");
                                }

                                break;
                            case 3:
                                if (topep > 0) {
                                    System.out.println("Se ha desencolado el primer valor de la cola\n");
                                    for (int i = frente; i < topep - 1; i++) {
                                        cola[i] = cola[i + 1];
                                    }
                                    topep--;
                                } else {
                                    System.out.println("La cola esta vacia");
                                }

                                break;
                            case 4:
                                if (topep <= 26) {
                                    System.out.println("Encolar un valor");
                                    cola[topep] = sc.next().charAt(0);
                                    topep++;
                                } else {
                                    System.out.println("La cola esta llena ");
                                }
                                break;
                            case 5:
                                System.out.println("La cola se ha ordenado alfabeticamente");
                                for (int i = frente; i < topep; i++) {
                                    for (int j = frente; j < i; j++) {
                                        if (cola[i] < cola[j]) {
                                            aux = cola[i];
                                            cola[i] = cola[j];
                                            cola[j] = (char) aux;
                                        }
                                    }
                                }

                                break;
                        }
                    } while (variable != 6);
                    break;
            }

        } while (variable != 6);
    }

}
    
    

