/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;


import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Hacer que el usuario ingrese su nombre
		System.out.println("Ingresa tu Nombre");		
		String nombre = sc.next();
                //Hacer que el usuario ingrese su edad
		System.out.println("Ingresa tu edad");
		int edad = sc.nextInt();
                 //Hacer que el usuario ingrese su sexo
		System.out.println("Ingresa sexo");
		String sexo = sc.next();
                 //Hacer que el usuario ingrese su peso(Kg)
		System.out.println("Ingresa tu peso (Kg)");
		double peso = sc.nextDouble();
                 //Hacer que el usuario ingrese su estatura
		System.out.println("Ingresa tu estatura (mts) ");
		double altura = sc.nextDouble();
		
		System.out.println("\n ******************** \n");
				
		Operaciones o = new Operaciones(nombre, edad, sexo, peso, altura);
		//Imprimir todos los datos que el usuario ingreso
		System.out.println("Nombre: " + o.getNombre());
		System.out.println("Edad: " + o.getEdad());
		System.out.println("Sexo: " + o.getSexo());
		System.out.println("Peso: " + o.getPeso());
		System.out.println("Estatura: " + o.getAltura());
		
		System.out.println(o.toString());
		
		
		
	}

}
