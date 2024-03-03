package curso_games_danki;

public class Inimigo {

	public int vida = 100;
	public String inimigoTipo = "Dragão";
	public int ataqueDano = 10;
	
	public Inimigo(int vida) {
		this.vida = vida;
	}

	//método
	public void tomarDano() {
		vida--;
	}
	
	//método
	public int getVida() {
		return vida;
	}
}
