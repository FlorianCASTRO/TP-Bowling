import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class BowlingGameTest {

    BowlingGame game = new BowlingGame();

    @Test
    public void queDesGoutieres() {
        rollMany(20, 0);
        assertEquals(0, game.score());
    }

   
    @Test
    public void uneQuilleTombe(){
        game.comptageDesPoints(1);
        rollMany(19, 0);
        assertEquals(1, game.score());
    }

    @Test
    public void bonusDuSpare(){
        game.comptageDesPoints(8);
        game.comptageDesPoints(2);
        game.comptageDesPoints(1);
        rollMany(17, 0);
        assertEquals(12, game.score());
    }
    
    @Test
    public void bonusDuStrike(){
        game.comptageDesPoints(10);
        game.comptageDesPoints(0);
        game.comptageDesPoints(2);
        game.comptageDesPoints(1);
        rollMany(17, 0);
        assertEquals(16, game.score());
    }
    
    @Test
    public void testPartieStrikeEtSpears() {
    	game.comptageDesPoints(10);
    	game.comptageDesPoints(0);
    	
        game.comptageDesPoints(8); 
        game.comptageDesPoints(1); 
        
        game.comptageDesPoints(2); 
        game.comptageDesPoints(8); 
        
        game.comptageDesPoints(5); 
        game.comptageDesPoints(2); 
        
        game.comptageDesPoints(8);
        rollMany(12, 0);
        assertEquals(10+16+2+2+8+10+2+8, game.score());
    }
    
    private void rollMany(int number, int nombrePoints) {
        for (int i = 0; i < number; i++) {
            game.comptageDesPoints(nombrePoints);
        }
    }
}
