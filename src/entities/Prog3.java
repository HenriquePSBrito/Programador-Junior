package entities;

public class Prog3 {
	
	private String nome;
	private Integer idade;
	private Integer telefone;
	private String estado;
	
	public Prog3() {
	}
	
	public Prog3(String nome, Integer idade, Integer telefone, String estado) {
		this.nome = nome;
		this.idade = idade;
		this.telefone = telefone;
		this.estado = estado;
	}
	
		
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getTelefone() {
		return telefone;
	}

	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	public String toString() {
		return "Dados informados: \n" + nome + ", " + idade + " anos, " + telefone + " e " + estado;
		
	}
	
	
	
	

}
