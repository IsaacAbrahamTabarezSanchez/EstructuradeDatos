
package pilaalfa;

import java.util.Scanner;
/**
 *
 * @author Isaac Tabarez
 */

public class PilaAlfa {
public static void main(String[] args) {
       Scanner teclado= new Scanner(System.in);
       //Declaramos la variable tope,opt y var
       int tope=0,opt,var=0;
       char alf[]=new char[26];
       //Creamos un menu para cada accioj que queramos realizar 
       do{System.out.println("\n1- Llenar\n"
            + "2- Mostrar\n"
            + "3- Eliminar\n"
            + "4- Agregar\n"
            + "5- Salir\n");
       switch(opt=teclado.nextInt()){
           //Caso 1 
           case 1:
               //Se llenan los espacios de la pila con las letras del albafeto
               if(tope<=26){
               System.out.println("La pila se ha llenado\n");
               for (int i = 0; tope < 26 ; i++) {
               alf[tope]=(char)('a'+i);
               tope++;
               }
               }
                
               break;
           //Caso 2    
           case 2:
               //Imprime los elementos de la pila desde la cima de tope.
               System.out.println("Los elementos de la pila son:\n");
               for (int i = tope-1 ; i >= 0; i--) {
                   System.out.print("  "+alf[i]);
               }
               break;
           //Caso 3    
           case 3:
               //Elimina el ultimo dato
               if(tope>0)//Condicion de si esta vacio no elimina nada
               {
               System.out.println("Se elimino el ultimo dato...\n");
               tope--;
               }else{
                   System.out.println("La pila esta vacia");
               }
                  
               break;
           //Caso 4
           case 4:
               if(tope<26)//Esta condcion hace que no se desborde la memoria 
               {
               //Ingresar un dato manual en la posicion tope
               System.out.println("Agrega dato:\n");
               alf[tope]=teclado.next().charAt(0);
               tope++;
               }else{
                   System.out.println("La pila esta llena");
               }
               break;
          
       }
       //Para salir del bucle do-while    
       }while(opt !=5);
    }
    
}