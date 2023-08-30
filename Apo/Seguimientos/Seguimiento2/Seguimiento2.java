//Analisis
//Descripcion: Programa para los juegos olimpicos 2024 que permita ingresar una cantidad
//de boxeadores al igual que el peso de cada uno, segun el peso
//Datos entrada: cantidadboxeadores, peso boxeador;
//Datos salida: 
import java.util.Scanner;
public class Seguimiento2{
	public static void main(String[] args) {
	int i;
	double cantidadboxeadores;
	double pesoboxeador;
	i=1;//Contador
	System.out.println("Bienvenido a los juegos Olimpicos Francia 2024 \nIngresa la cantidad de boxeadores");	
	Scanner entrada = new Scanner(System.in);
	cantidadboxeadores=entrada.nextInt();

	while(i<cantidadboxeadores){
			System.out.println("Ingresa el peso del boxeador "+i);
			pesoboxeador=entrada.nextDouble();
			if (pesoboxeador<=48) {
				System.out.println("El boxeador pertenece al peso semimosca");
			}
			else{
				if (pesoboxeador>48 & pesoboxeador<=51) {
					System.out.println("El boxeador pertenece al peso mosca");	
				}
				else{
					if (pesoboxeador>51 & pesoboxeador<=54) {
						System.out.println("El boxeador pertenece al peso gallo");
					}else{
						if (pesoboxeador>54 & pesoboxeador<=57) {
							System.out.println("El boxeador pertenece al peso pluma");	
						}else{
							if (pesoboxeador>57 & pesoboxeador<=60) {
								System.out.println("El boxeador pertenece al peso ligero");				
							}else{
								if (pesoboxeador>60 & pesoboxeador<=64) {
									System.out.println("El boxeador pertenece al peso superligero");
								}else{
									if (pesoboxeador>64 & pesoboxeador<=69) {
										System.out.println("El boxeador pertenece al peso welter");
									}else{
										if (pesoboxeador>69 & pesoboxeador<=75) {
											System.out.println("El boxeador pertenece al peso medio");
										}else{
											if (pesoboxeador>75 & pesoboxeador<=81) {
												System.out.println("El boxeador pertenece al peso medipesado");
											}else{
												if (pesoboxeador>81 & pesoboxeador<=91) {
													System.out.println("El boxeador pertenece al peso pesado");
												}else{
													if (pesoboxeador>91) {
														System.out.println("El boxeador pertenece al peso superpesado");
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}





			i=i+1;


		}
	}
}