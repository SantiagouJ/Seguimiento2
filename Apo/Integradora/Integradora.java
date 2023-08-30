import java.util.Scanner;
import java.util.Random;  
public class Integradora{
	public static void main(String[] args) {
		System.out.println("Bienvenido a la calculadora de Genshin Impact \n (1). Calcular daño \n (2). Historial ultimos 10 \n (3). Salir"  );
		int menu, select, nivel, tiporeaccion, tipotransformativa;
		double maestriaelemental, probdañocrit, dañoporcent, dañobase, ataquepersonaje, bonoME, multitransformati, multiresistencia;
		Scanner entrada = new Scanner(System.in);
		menu= entrada.nextInt();
		if (menu==1) {
			System.out.println("Que quieres ingresar: \n(1). Un personaje \n(2). Un equipo");
			select= entrada.nextInt();
			if (select==1) {
				 System.out.println("Ingresa el nivel del personaje");
           	        nivel=entrada.nextInt();
           	     System.out.println("Ingresa el ataque del personaje");
           	        ataquepersonaje=entrada.nextInt();
           	     System.out.println("Ingresa la maestria elemental del personaje");
           	     	maestriaelemental=entrada.nextInt();
           	     System.out.println("Ingresa la probabilidad de daño critico");
           	     	probdañocrit=entrada.nextInt();
           	     System.out.println("Ingresa la cantidad porcental de daño");
           	     	dañoporcent=entrada.nextInt();
           	     dañobase=ataquepersonaje*(1+probdañocrit+dañoporcent);//Calculo 		
           	     System.out.println("El daño base del personaje es: " +dañobase);

           	     System.out.println("Tipo de reaccion");
           	        System.out.println("(1). Reaccion Transformativa");
           	        System.out.println("(2). Reaccion Amplificativa");
           	        System.out.println("(3). Reaccion Aditiva");
           	        tiporeaccion=entrada.nextInt();
           	      if (tiporeaccion==1) {

           	       	bonoME=16*(maestriaelemental)/(maestriaelemental+2000);

           	       	System.out.println("Elige el multiplicador transformativo \n(1). Quemadura \n(2). Superconductor \n(3). Torbellino \n(4). Electro cargado \n(5). Cristalizacion \n(6). Sobrecargado \n(7). Florecimiento \n(8). Sobreflorecimiento \n(9). Superquemadura");
           	       tipotransformativa=entrada.nextInt();
           	       switch(tipotransformativa){
           	       		case(1):
           	       			System.out.println("Elegiste Quemadura");
           	       			multitransformati=0.25;
           	       			break;
           	       		case(2):
           	       			System.out.println("Elegiste Superconductor");
           	       			multitransformati=0.50;
           	       			break;
           	       		case(3):
           	       			System.out.println("Elegiste Torbellino");
           	       			multitransformati=0.60;
           	       			break;
           	       		case(4):
           	       			System.out.println("Elegiste Electro cargado");
           	       			multitransformati=1.20;
           	       			break;
           	       		case(5):
           	       			System.out.println("Elegiste Cristalizacion");
           	       			multitransformati=1.50;
           	       			break;
           	       		case(6):
           	       			System.out.println("Elegiste Sobrecargado");
           	       			multitransformati=2.0;
           	       			break;
           	       		case(7):
           	       			System.out.println("Elegiste Florecimiento");
           	       			multitransformati=2.0;
           	       			break;
           	       		case(8):
           	       			System.out.println("Elegiste Sobreflorecimiento");
           	       			multitransformati=3.0;
           	       			break;
           	       		case(9):
           	       			System.out.println("Elegiste Superquemadura");
           	       			multitransformati=3.0;
           	       			break;
           	       		default:
           	       			System.out.println("Opcion invalida");	
           	       }	           	       	


           	       }else{
           	       	if (tiporeaccion==2) {
           	       		
           	       	}else{
           	       		if (tiporeaccion==3 ) {
           	       			
           	       		}
           	       	}
           	       }
			}
		}else{
			if (menu==2) {
				System.out.println("Aun no hay un historial de 10 personajes");
			}else{
				if (menu==3) {
					System.out.println("Gracias por ingresar");
					
				}
			}
		}
	}
}