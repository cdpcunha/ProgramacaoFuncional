package Entidades;

public class Produto {
	private String nomeProd;
	private Double precoProd;
	
	public Produto(String nomeProd, double precoProd) {
		super();
		this.nomeProd = nomeProd;
		this.precoProd = precoProd;
	}
	
	public boolean ProdutoPredicate() {
		return this.getPrecoProd() >= 400;
	}
	
	public boolean ProdutoPredicateSearch(String param) {
		return getNomeProd().charAt(0) == param.charAt(0);
	}
	
	public void ProdutoConsumer() {
		this.setPrecoProd(this.getPrecoProd()*1.1); 
	}
	
	public String ProdutoFunction() {
		return this.getNomeProd().toUpperCase();
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
