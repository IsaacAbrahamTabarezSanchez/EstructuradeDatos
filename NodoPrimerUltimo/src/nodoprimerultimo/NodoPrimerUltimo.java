
package nodoprimerultimo;

import java.util.Scanner;


public class NodoPrimerUltimo {

Scanner teclado = new Scanner (System.in);    
public class Nodo {
    
    public String dato;
    public Nodo sgt;
    public Nodo(String valor){
        this.dato=valor;
    }
    public Nodo(String valor,Nodo A){
        dato=valor;
        sgt=A;
    }
}

    protected Nodo primero,ultimo;
    public NodoPrimerUltimo(){
        primero = null;
        ultimo= null;
    }
public void agregar(String elemento){
   
    elemento=teclado.nextLine();
    primero=new Nodo(elemento, primero);
        if(ultimo==null){
            ultimo=primero;
        }
    }
    public void mostrar(){
        Nodo rec=primero;
        while(rec!=null){
            System.out.println(" DATO " + "[" + rec.dato + "]");
            rec=rec.sgt;
        }
        
    }
    public String eliminarPrimero(){
        String valor=primero.dato;
        if(primero==ultimo){
            primero=null;
            ultimo=null;
        }else{
           primero=primero.sgt;
        }
        return valor;
    }
    public String eliminarUltimo(){
        String valor=ultimo.dato;
        if (primero==ultimo) {
            primero=null;
            ultimo=null;
        }else{
            Nodo temp=primero;
            while(temp.sgt!=ultimo){
                temp=temp.sgt;
            }
            ultimo=temp;
            ultimo.sgt=null;
        }
        return valor;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        NodoPrimerUltimo n= new NodoPrimerUltimo();
        int opt;
        String D = null;
       do{           
               System.out.println("\n"
                                +  "1_Agregar un dato\n"
                                + "2_Mostrar los datos agregados\n"
                                + "3_Eliminar primero\n"
                                + "4_Eliminar ultimo\n"
                                + "5_Salir del programa");
                System.out.println(" Selecciona la accion que deseas realizar ");
               switch (opt=in.nextInt()){
                   case 1:
                           System.out.println("El dato ha ingresar es; ");
                           n.agregar(D);
                       break;
                       case 2:
                           System.out.println("El nodo contiene estos datos: ");
                           n.mostrar();
                           
                       break;
                       case 3:
                           System.out.println("Elimino el primer dato");
                           n.eliminarPrimero();
                           
                       break;
                       case 4:
                           System.out.println("Elimino el ultimo dato");
                          n.eliminarUltimo();
                           
                           break;
                        
               }
           
       }while(opt!=5);
    }
}
