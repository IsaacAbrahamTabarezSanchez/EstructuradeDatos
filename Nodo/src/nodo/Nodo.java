
package nodo;

import java.util.Scanner;

/**
 *
 * @author Isaac Tabarez
 */
public class Nodo {
 Scanner teclado = new Scanner(System.in);
    private String dato;
    private Object sig;
    
    static class Nododos {
        String dato;
        Nodo sig;
    }
    
    Nodo fin = null;
Nodo inicio=null;
    public void agregar() {
        Nodo temp;
        String msg;
        System.out.println(" Agrega un dato de tu preferencia ");
        if (fin == null) {
            fin = new Nodo();
            fin.dato = teclado.nextLine();
            fin.sig = null;
        } else {
            temp = new Nodo();
            temp.dato = teclado.nextLine();
            temp.sig = fin;
            fin = temp;
        }
    }

    public void mostrar() {
        Nodo actual = fin;
        actual = fin;
        if (fin != null) {
            while (actual != null) {
                System.out.print(" DATO " + "[" + actual.dato + "]");
                actual = (Nodo) actual.sig;
            }
        } else {
            System.out.println("\n El nodo no contien ningun valor \n");
        }
    }
    public void eliminarUlt(){
    if(fin!=null){
        System.out.println(" El ultimo dato se ha eliminado ");
        fin=(Nodo) fin.sig;
    }else{
        System.out.println(" No se encuentran datos para eliminar ");
    }
    
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opt = 0;
        String dato;
        Nodo n = new Nodo();
        do {
            System.out.println("\n"
                             + " 1_Agregar un dato \n"
                             + " 2_Mostrar los datos agregados \n"
                             + " 3_Borrar un dato \n"
                             + " 4_Salir del programa \n");
            System.out.println(" Selecciona la accion que deseas realizar ");
            switch (opt = sc.nextInt()) {
                case 1:
                    n.agregar();
                    break;

                case 2:
                    n.mostrar();
                    break;
                    
                case 3:
                    n.eliminarUlt();
            }
        } while (opt != 4);
    }
}    
