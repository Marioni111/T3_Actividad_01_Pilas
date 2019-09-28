import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		ImplementacionPilaEstatica obj1 = new ImplementacionPilaEstatica();
		ImplementacionPilaDinamica obj2 = new ImplementacionPilaDinamica();
		
		System.out.println("Selecciona: \n1)Pila estatica \n2)pila dinamica");
		int op = entrada.nextInt();
		int cont = 0;
		
		if(op==1){
			do{
				System.out.println("1)Cargar base de datos \n2)Rentar pelicula \n3)Devolver pelicula \n4)Mostar pelicula \n5)Salir \n-----------------------------");
				op = entrada.nextInt();
				switch(op) {
					
					case 1 :
						obj1.cargarBD();
						break;
					case 2 :
						obj1.rentaPeliculas();
						break;
					case 3 :
						obj1.devolverPelicula();
						break;
					case 4 :
						obj1.mostrarDisponibles();
						break;
					case 5 :
						System.out.println("Nos vemos!");
						cont++;
						break;
				}
			}while(cont<1);
		}
		else if(op==2){
			do{
				System.out.println("1)Cargar base de datos \n2)Rentar pelicula \n3)Devolver pelicula \n4)Mostar pelicula \n5)Salir \n---------------------------");
				op = entrada.nextInt();
				switch(op) {
				
					case 1 :
						obj2.cargarBD();
						break;
					case 2 :	
						obj2.rentaPeliculas();
						break;
					case 3 :
						obj2.devolverPelicula();
						break;
					case 4 :
						obj2.mostrarDisponibles();
						break;
					case 5 :
						System.out.println("Nos vemos!");
						cont++;
						break;
				}
			}while(cont<1);
		}
		else if(op==3){
			System.out.println("Salir");
		}
		
	}
}