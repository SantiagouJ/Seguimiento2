/* Descripcion:
 * Programa calculadora que permita realizar operaciones aritmeticas con numeros enteros que proporcione el usuario
 * Entradas:
 * Numeros que el usuario digite
 * Salidas: 
 * Resultado de suma, resta, multiplicacion, division y modulo
 * Ejemplo: 
 * "Ingresa un numero" 2
 * "Ingresa otro numero" 4
 * "La suma de los numeros es, la resta es..."
 */
import java.util.Scanner;
public class Calculadora
{
	public static void main(String[] args) {
	int Num1, Num2, suma_res, resta, multiplicacion, division, modulo, Opa;
		

	System.out.println("Que operacion necesitas \n 0 Para suma \n 1 Para resta \n 2 Para multiplicacion \n 3 Para division \n 4 Para modulo");

	Scanner entrada = new Scanner(System.in);

	Opa=entrada.nextInt();

	System.out.println("Ingresa un numero");


	Num1=entrada.nextInt();

	System.out.println("Ingresa otro numero");

	Num2=entrada.nextInt();

	if(Opa==0){
		suma_res=sumalito(Num1,Num2);
		System.out.println("El resultado de la suma es:");
		System.out.println(suma_res);
	}else{
		if (Opa==1) {
			resta=restaa(Num1,Num2);
			System.out.println("El resultado de la resta es:");
			System.out.println(resta);
		}else{
			if (Opa==2) {
				multiplicacion=multi(Num1,Num2);
				System.out.println("El resultado de la multiplicacion es:");
				System.out.println(multiplicacion);
			}else{
				if (Opa==3) {
					division=divi(Num1,Num2);
					System.out.println("El resultado de la division es:");
					System.out.println(division);

				}else{
					if (Opa==4) {
						modulo=modu(Num1,Num2);
						System.out.println("El resultado del modulo es:");
						System.out.println(modulo	);
					}
				}
			}
		}
	}

	
	}
	public static int sumalito(int num1, int num2){
		int res;
		res= num1+num2;
		return res;	
	}
	public static int restaa(int num1, int num2){
		int resu;
		resu= num1-num2;
		return resu;
	}
	public static int multi(int num1, int num2){
		int resul;
		resul= num1*num2;
		return resul;
	}
	public static int divi(int num1, int num2){
		int result;
		result=num1/num2;
		return result;
	}
	public static int modu(int num1, int num2){
		int resulta;
		resulta=num1%num2;
		return resulta;
	}

/**
*Descripcion: el metodo suma tiene como tarea sumar dos numeros enteros y retornar el resultado
*pre: El metodo suma recibe dos parametros y retorna el resultado; no afecta variables globales
* pos: Por lo anterior no modificavariables globales 
* @param n1 int Debe serr un numero entero cuya asignacion ya haya ocurrido
* @param n2 int Debe ser un numero entero cuta asignacion ya haya ocurrido
* @return res int El resultado de sumar n1 y n2
*/
public static int suma(int n1, int n2){
int res;
res=n1 + n2;
return res;
}
}