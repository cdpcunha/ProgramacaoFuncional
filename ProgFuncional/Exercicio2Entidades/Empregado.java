package Exercicio2Entidades;

public class Empregado implements Comparable<Empregado> {
	private String nome;
	private String email;
	private Double salario;

	public Empregado(String nome, String email, Double salario) {
		super();
		this.nome = nome;
		this.email = email;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Empregado [nome=" + nome + ", email=" + email + ", salario=" + salario + "]";
	}

	@Override
	public int compareTo(Empregado e) {
		if (e.getEmail().equals(this.getEmail())) {
			return 0;
		}
		return this.getEmail().toUpperCase().compareTo(e.getNome().toUpperCase());
	}
	
	public void comparaSalario (Double salario) {
		if(this.getSalario()>= salario) {
			System.out.println(this.getEmail());
		}
	}
	
	public double somaSalarioSe (String param) {
		if(this.getNome().charAt(0) == param.charAt(0)) {
			return this.getSalario();
		}
		else return 0;
	}
}
