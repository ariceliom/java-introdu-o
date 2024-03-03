package curso_games_danki;

public class Player {

	//variáveis
	public int vida = 10;
	public String nome = "Aricelio";
	
	//método
	public void perderVida() {
		vida--;
	}
	
	//método
	public void ganharVida() {
		vida++;
	}
}
