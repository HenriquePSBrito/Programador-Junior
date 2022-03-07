package entities;

public class Jokenpo {
	
	private String jogador1, jogador2;
	private Integer p1, p2;
	
	public Jokenpo() {
	}
	
	public Jokenpo(String jogador1, String jogador2, Integer p1, Integer p2) {
		this.jogador1 = jogador1;
		this.jogador2 = jogador2;
		this.p1 = p1;
		this.p2 = p2;
		
	}
			
	public String getJogador1() {
		return jogador1;
	}

	public void setJogador1(String jogador1) {
		this.jogador1 = jogador1;
	}

	public String getJogador2() {
		return jogador2;
	}

	public void setJogador2(String jogador2) {
		this.jogador2 = jogador2;
	}

	public Integer getP1() {
		return p1;
	}

	public void setP1(Integer p1) {
		this.p1 = p1;
	}

	public Integer getP2() {
		return p2;
	}

	public void setP2(Integer p2) {
		this.p2 = p2;
	}

	public String toString() {
		return "";
	}

}
