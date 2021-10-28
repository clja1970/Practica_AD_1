package es.studium.Practica;

import java.io.IOException;
import java.util.List;

public class Principal {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		ArticuloAComprar acUno = new ArticuloAComprar ("Tomate", 1.0 , "kilo");
		ArticuloAComprar acDos = new ArticuloAComprar ("Limón", 1.0 , "kilo");
		ArticuloAComprar acTres = new ArticuloAComprar ("Papagorda", 1.0 , "kilo");
		
		ListaDeLaCompra merca = new  ListaDeLaCompra ("Mercadona");
		ListaDeLaCompra ldlc2 = new  ListaDeLaCompra ("Aldi");
		
		merca.agregarProductoAComprar(acUno);
		ldlc2.agregarProductoAComprar(acUno);
		ldlc2.agregarProductoAComprar(acDos);
		merca.agregarProductoAComprar(acTres);
		
		merca.eliminarArticulo("Papagorda");
		
		List <ArticuloAComprar> nLista = merca.getArticulos();
		
		for (ArticuloAComprar articulo : nLista) {
		 
		System.out.println(articulo.getDescripcion() + " - " + articulo.getCantidad() + " - " + articulo.getUnidad());
		}
List <ArticuloAComprar> nListaDos = ldlc2.getArticulos();
		
		for (ArticuloAComprar articulo : nListaDos) {
		 
		System.out.println(articulo.getDescripcion() + " - " + articulo.getCantidad() + " - " + articulo.getUnidad());
		}
		
		//for (int i=0; i < nListaDos.size(); i++) {
			
			System.out.println(nListaDos.get(1).getDescripcion());
		//}
	}
}
