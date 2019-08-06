package ExercicioEntidades;

public class Produto implements Comparable<Produto> {
	private String nome;
	private Double preco;

	public Produto(String nome, Double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}

	public boolean prodAcimaMedia(Double media) {
		if (this.getPreco() > media) {
			return true;
		} else
			return false;
	}

	public boolean prodAbaixoMedia(Double media) {
		if (this.getPreco() <= media) {
			return true;
		} else
			return false;
	}

	@Override
	public int compareTo(Produto p) {
		if(this.getNome().equals(p.getNome())){
			return 0;
		}
		return this.getNome().toUpperCase().compareTo(p.getNome().toUpperCase());
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Nome = " + nome + ", Preco = " + preco;
	}
}
