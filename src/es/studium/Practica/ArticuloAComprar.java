package es.studium.Practica;

public class ArticuloAComprar {

	private String descripcion;
	private Double cantidad;
	private String unidad;

	//Constructor vacio
	public ArticuloAComprar()
	{
		descripcion = "";
		cantidad = 0.0;
		unidad = "";
	}
	//Constructor por parametros
	
	public ArticuloAComprar (String des, Double cant, String uni)
	{

		descripcion = des;
		cantidad = cant;
		unidad = uni;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Double getCantidad() {
		return cantidad;
	}
	public void setCantidad(Double cantidad) {
		this.cantidad = cantidad;
	}
	public String getUnidad() {
		return unidad;
	}
	public void setUnidad(String unidad) {
		this.unidad = unidad;
	}
}

