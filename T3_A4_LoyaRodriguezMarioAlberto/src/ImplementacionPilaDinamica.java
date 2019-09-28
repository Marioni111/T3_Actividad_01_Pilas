import java.util.Stack;

public class ImplementacionPilaDinamica implements RentaPeliculas{

	Stack<Pelicula> mS = new Stack<>();
	
	private int cima = 4;
	private int tamañoPila = 5;
	Pelicula peliculas[] = new Pelicula[5];
	
	public void cargarBD(){
		mS.push(new Pelicula("1) Tokyo Goul", "Terror"));
		mS.push(new Pelicula("2) Shingeki mo Kyojin", "Accion"));
		mS.push(new Pelicula("3) Mirai Nikki", "Sobrenatural"));
		mS.push(new Pelicula("4) Sword Art Online", "cienciaficcion"));
		mS.push(new Pelicula("5) Gantz", "Terror"));
		System.out.println("La base de datos esta activa");
	}
	public void rentaPeliculas(){
		if(pilaVacia()){
			System.out.println("No hay mas peliculas para rentar");
		}else{
			peliculas[cima]=mS.peek();
			System.out.println("Has rentado la pelicula " + peliculas[cima].getTitulo() + " del genero " + peliculas[cima].getGenero());
			cima--;
			mS.pop();
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
			mS.push(peliculas[cima]);
			cima++;
			System.out.println("Se a devuelto la pelicula " + peliculas[cima].getTitulo() + " del genero " + peliculas[cima].getGenero());
		}
	}
	public void mostrarDisponibles(){
		System.out.println("Total de peliculas: " + mS.size());
	}
}