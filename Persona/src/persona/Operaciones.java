/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

/**
 *
 * @author Isaac Tabarez
 */
public class Operaciones extends Persona{

	public Operaciones(String nombre, int edad, String sexo, double peso, double altura) {
		super(nombre, edad, sexo, peso, altura);
		
		double imc = peso/(altura*altura);
		
		System.out.print("IMC: " );
		//Definir datos flotantes con la operacion modulo
		System.out.printf("%1.2f", imc);	
		//Si  el indice de masa es menor a 18.5 el usuario es bajo de peso
		if(imc< 18.5) {
			System.out.println("\nBajo de Peso");
		}
                //Pero Si  el indice de masa es mayor o igual a 18.5 el usuario tien peso ideal
		else if(imc>= 18.5 || imc<25) {
			System.out.println("\nPeso Ideal");
		}
                //Si el usuario no cumple con estas condiciones el usuario tendra 
		else {
			System.out.println("\nSobrepeso");
		}
		}

    String getAltura() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	
	

}
