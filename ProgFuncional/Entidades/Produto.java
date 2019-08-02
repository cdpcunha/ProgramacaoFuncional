package Entidades;

public class Produto {
	private String nomeProd;
	private Double precoProd;
	
	public Produto(String nomeProd, double precoProd) {
		super();
		this.nomeProd = nomeProd;
		this.precoProd = precoProd;
	}
	public String getNomeProd() {
		return nomeProd;
	}
	public void setNomeProd(String nomeProd) {
		this.nomeProd = nomeProd;
	}
	public Double getPrecoProd() {
		return precoProd;
	}
	public void setPrecoProd(double precoProd) {
		this.precoProd = precoProd;
	}
	@Override
	public String toString() {
		return "Produto [nomeProd=" + nomeProd + ", precoProd=" + String.format("%.2f",precoProd) + "]";
	}
	
}
