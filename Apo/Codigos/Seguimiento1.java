import java.util.Scanner;
public class Seguimiento1{
	public static void main(String[] args) {
		int Pedido;
		double precio, impuesto, total;
		System.out.println("Bienvenido a QueenPapa, ¿Cuantos pedidos desea ordenar?");
		Scanner entrada = new Scanner(System.in);
		Pedido=entrada.nextInt();

		precio= Pedido*65000;
		impuesto= precio*0.08;
		total= precio+impuesto;

		System.out.println(Pedido +" x Queen salchi........" + precio);
		System.out.println("Impuesto(8%)........" + impuesto);
		System.out.println("El total a pagar es......." + total);
		System.out.println("Gracias por su compra");
	}
} 