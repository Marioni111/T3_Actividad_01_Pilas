
public class ImplementacionPilaEstatica implements RentaPeliculas{
	
	private int cima = 4;
	private int tamañoPila = 5;
	private String peliculas[][] = new String [2][5];
	
	public void cargarBD(){
		peliculas[0][0]="1) Tokyo Goul"; peliculas[1][0]="Terror";
		peliculas[0][1]="2) Shingeki no Kyojin"; peliculas[1][1]="Accion";
		peliculas[0][2]="3) Mirai Nikki"; peliculas[1][2]="Sobrenatural";
		peliculas[0][3]="4) Sword Art Online"; peliculas[1][3]="cienciaficcion";
		peliculas[0][4]="5) Gantz"; peliculas[1][4]="Terror";
		System.out.println("La base de datos esta activa");
	}
	public void rentaPeliculas(){
		if(pilaVacia()){
			System.out.println("No hay mas peliculas para rentar");
		}else{
			System.out.println("Has rentado la pelicula " + peliculas[0][cima] +" del genero " + peliculas[1][cima]);
			cima--;
		}
	}
	public boolean pilaLlena(){
		return (cima == tamañoPila-1) ? true : false;
	}
	public boolean pilaVacia(){
		
		return (cima == -1) ? true : false;
	}
	public void devolverPelicula(){
		if(pilaLlena()){
			System.out.println("No hay peliculas para devolver");
		}else{
			cima++;
			System.out.println("Se a devuelto la pelicula " + peliculas[0][cima] +" del genero " + peliculas[1][cima]);
		}
	}
	public void mostrarDisponibles(){
		System.out.println("Peliculas disponibles: ");
		for(int i = 0; i<=cima; i++) {
				System.out.println(peliculas[0][i] +" del genero " + peliculas[1][i]);
		}
		System.out.println("Total de peliculas: " + (cima+1));
	}
}
