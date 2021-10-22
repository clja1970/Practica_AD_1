package es.studium.Practica;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ListaDeLaCompra {

	private String nombreDeLaLista;

	List<ArticuloAComprar> lista= new ArrayList <ArticuloAComprar>();

	// Constructor por defecto

	public ListaDeLaCompra(){
		this.nombreDeLaLista = ".\\listaDLC.txt";
	}

	//Constructor que recibe el nombre de la lista
	public ListaDeLaCompra (String nombreDeLaLista){
		this.nombreDeLaLista = ".\\" + nombreDeLaLista + ".txt";
	}
	//Método para crear la lista de la compra

	/*public void crearListaDeLaCompra(String nombreDeLaLista) {
		//Para crear el archivo
		try {

			FileWriter fl = new FileWriter (nombreDeLaLista, true);

			fl.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	 */
	/*public void escrituraDeLaLista (String nombreDeLaLista, String otra) {


		try {



			FileWriter fw = new FileWriter(nombreDeLaLista);

			BufferedWriter bw = new BufferedWriter(fw);

			bw.write(otra);

			bw.close();

			fw.close();


		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	 */

	public void agregarProductoAComprar(ArticuloAComprar articulo) {
		lista.add(articulo);

		try {

			FileWriter fw = new FileWriter (nombreDeLaLista);

			BufferedWriter bw = BufferedWriter (fw);

			bw.write("Quiero escribir");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	private BufferedWriter BufferedWriter(FileWriter fw) {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String lecturaLista = null;

		String segundaLectura = null;

		ListaDeLaCompra listaDeLaCompra = new ListaDeLaCompra("OtroDos");

		//listaDeLaCompra.crearListaDeLaCompra ("Otro");

		ArticuloAComprar articuloAComprar = new ArticuloAComprar("Tomate",1.10, "1 kilo");

		//segundaLectura = brDos.readLine();
		listaDeLaCompra.agregarProductoAComprar(articuloAComprar);

		System.out.println("Dime el nombre de la lista de la compra: ");

		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//System.out.println("Dime los artículos a guardar: ");

		//BufferedReader brDos = new BufferedReader(new InputStreamReader(System.in));





		//listaDeLaCompra.escrituraDeLaLista( lecturaLista, segundaLectura);

		System.out.println("Los artículos guardados son: " + segundaLectura + "\n");



	}

}
