import java.util.Scanner;

public class BowlingConsole {

	public static void main(String... args) {
		
		Scanner scanner = new Scanner(System.in);
		
		BowlingGame bowlingGame = new BowlingGame();
		
		for(int i = 1; 1 <= 20 ; i++) {
			
			System.out.println("Lancé " + i);
			System.out.println("Combien de quilles vous avez fait tomber ?");
			String nbQuillesAsString = scanner.nextLine();
			int nbQuilles = Integer.parseInt(nbQuillesAsString);
			bowlingGame.comptageDesPoints(nbQuilles);
			int score = bowlingGame.score();
			System.out.println("Votre score est de " + score);
			System.out.println("--------------------------------");
					
			
			
		}
		
	}
	
	
}
