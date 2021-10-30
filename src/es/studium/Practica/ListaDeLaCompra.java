package es.studium.Practica;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



/**
 * @author clja1
 *
 */
public class ListaDeLaCompra {

	private String nombreDeLaLista;

	private List<ArticuloAComprar> listaArticulos = new ArrayList <ArticuloAComprar>();

	// Constructor por defecto

	public ListaDeLaCompra(){
		this.nombreDeLaLista = "";
	}

	//Constructor que recibe el nombre de la lista

	public ListaDeLaCompra (String nombreDeLaLista){
		this.nombreDeLaLista = nombreDeLaLista + ".txt";
	}

	public String getNombreDeLaLista() {
		return nombreDeLaLista;
	}

	public void setNombreDeLaLista(String nombreDeLaLista) {
		this.nombreDeLaLista = nombreDeLaLista;
	}
	public void agregarProductoAComprar(ArticuloAComprar articulo) throws IOException {

		listaArticulos.add(articulo);
		
		String nombreLista = this.getNombreDeLaLista();

		FileWriter fw = new FileWriter(nombreLista, true);

		BufferedWriter bw = new BufferedWriter(fw);

		bw.write(articulo.getDescripcion() + " - " + articulo.getCantidad() + " - " + articulo.getUnidad() + "\n");

		bw.close();

		fw.close();
	}

	public void eliminarArticulo (String descripcionArticulo) throws IOException {

		//borrar de  la lista con un remove

		for (int i = 0; i<listaArticulos.size(); i++)
			
		{
			
			if (listaArticulos.get(i).getDescripcion().equalsIgnoreCase(descripcionArticulo)) {
				
				listaArticulos.remove(i);
			}
		}

		String nombreLista = this.getNombreDeLaLista();

		FileWriter fw = new FileWriter(nombreLista, false);

		BufferedWriter bw = new BufferedWriter(fw);

		for (ArticuloAComprar articulo: listaArticulos )
		{
			bw.write(articulo.getDescripcion() + " - " + articulo.getCantidad() + " - " + articulo.getUnidad() + "\n");
		}
		bw.close();

		fw.close();
	}
	public List<ArticuloAComprar> getArticulos(){
		
				
		return listaArticulos;
	}

}



