package PaqueteCalculadora;

import java.util.Scanner;

public class CalculadoraDN {

	public static void main(String[] args) {
		
		double num1, num2;
        String suma = "+";
        String resta = "-";
        String multiplicacion = "*";
        String division = "/";
        String borrar = "c";
        String salir = "x";
        String operacion;
        double resultado = 0;
        
        //ingreasr primer numero:
        Scanner numeros= new Scanner (System.in);
        System.out.print("Ingresa el primer numero y presione ENTER para aceptar: ");
        num1= numeros.nextDouble();
        
        //ingresar operacion:
        System.out.println("Sleccione un operador, presione 'c' para limpiar pantalla o 'x' para salir, luego presione ENTER para aceptar");
        Scanner opciones= new Scanner(System.in);
        operacion = opciones.nextLine();
        if(operacion.equals(borrar)) {
        	CalculadoraDN.main(args);
        } else if(operacion.equals(salir)) {
        	System.exit(0);
        } else if(operacion.equals(suma)||operacion.equals(resta)||operacion.equals(multiplicacion)||operacion.equals(division)) {
        	
        	//ingresar segundo numero:
            System.out.print("Ingresa el segundo numero y presione ENTER para aceptar: ");
            num2= numeros.nextDouble();
            
            
            if(operacion.equals(suma)) {
            	resultado = num1+num2;
            	mostrar(operacion, num1, num2, resultado);
            } else if(operacion.equals(resta)) {
            	resultado = num1-num2;
            	mostrar(operacion, num1, num2, resultado);
            } else if(operacion.equals(multiplicacion)) {
            	resultado = num1*num2;
            	mostrar(operacion, num1, num2, resultado);
            } else if(operacion.equals(division)) {
            	resultado = num1/num2;
            	mostrar(operacion, num1, num2, resultado);
            }
        } else {
        	System.out.println("ERROR!");
        	CalculadoraDN.main(args);
        }
        
            
    }
	//metodo mostrar
	public static void mostrar (String operacion, double n1, double n2, double resultado) {
		
		System.out.println(n1+"  "+operacion+"  "+n2+" = "+resultado);
		
	}
}
