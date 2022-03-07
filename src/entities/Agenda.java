package entities;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
	
	private String nome;
	private Integer idade;
	private Double altura;
	
	List<Agenda> list = new ArrayList<>();
		
	
	public Agenda() {
	}
	
	public Agenda(String nome, Integer idade, Double altura) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Integer getIdade() {
		return idade;
	}
	
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	public Double getAltura() {
		return altura;
	}
	
	public void setAltura(Double altura) {
		this.altura = altura;
	}
	
	public void armazenaPessoa(String nome, Integer idade, Double altura) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}
	
	public void removePessoa(String nome) {
		list.remove(nome);
	}
	
	public void imprimeAgenda() {
		
		for(Agenda lista : list) {
			System.out.println(lista);
		}
	}
	
	public String toString() {
		return nome + " " + idade + " anos " + altura;
	}

}
