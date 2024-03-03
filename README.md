![image](https://github.com/ariceliom/java-introdu-o/assets/89526853/4876a77d-52e4-403f-a465-d3fb0d6d66d1)


package curso_games_danki;

import java.util.ArrayList;

public class Game {
	
	public static void main(String[] args) {
	
		/**
		 * Variáveis
		 */
		//String fName = "Aricelio ";
		//String lName = "Moura";
		//String nameCompleto = fName + lName;
		//boolean cpf = true;
		//int idade = 31;
		//double peso = 103.4;
		//int contador = 0;
		
		/**
		 * Concatenação
		 */
		//System.out.println("Olá, meu nome é " + nameCompleto + ". " + "Tenho " + idade + " anos. " + "Peso " + peso);
		//System.out.println("CPF ativo: " + cpf);
		
		/**
		 * While
		 */
		//while(contador <= 10) {
		//	System.out.println("O número while é: " + contador);
			//incremento pode ser com ++ ou +=1
			//decremento pode ser com -- ou -=1
		//	contador++;
		//}
		
		/**
		 * For
		 */
		//for(int i = 2; i <= 10; i+=2) {
		//	System.out.println("O número for é: " + i);
		//}
		
		/**
		 * Atributos e métodos com orientação a objetos
		 */
		//Player player = new Player();
		
		//System.out.println(player.nome);
		
		//System.out.println(player.vida);
		
		//player.perderVida();
		//player.perderVida();
		
		//System.out.println(player.vida);
		
		//player.ganharVida();
		
		//System.out.println(player.vida);
		

		
		/**
		 * Heranças
		 */
		//Player player = new Player();
		//BanguelaInimigo banguela = new BanguelaInimigo(10);
		
		//banguela.tomarDano();
		
		//System.out.println(banguela.getVida());
		
		
		/**
		 * Array List
		 */
		Player player = new Player();
		//ArrayList importado no inicio do arquivo
		ArrayList<Inimigo> inimigos = new ArrayList<Inimigo>();
		
		inimigos.add(new BanguelaInimigo(100));
		inimigos.add(new BanguelaInimigo(100));
		inimigos.add(new BanguelaInimigo(100));
		inimigos.add(new BanguelaInimigo(100));
		inimigos.add(new BanguelaInimigo(100));
		inimigos.add(new BanguelaInimigo(100));
		
		inimigos.get(0).tomarDano();
		
		System.out.println(inimigos.get(0).vida);
		
		for(int i = 0; i < inimigos.size(); i++) {
			Inimigo inimigoLocal = inimigos.get(i);
			if(i == 1) {
				inimigoLocal.tomarDano();
				System.out.println(inimigoLocal.vida);
			}else {
				System.out.println(inimigoLocal.vida);
			}
		}
	}
	
}
