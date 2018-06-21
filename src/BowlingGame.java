public class BowlingGame {

    private int score;

    public int score() {
        return score;
    }
    
    int coupsParTour = 1;
    boolean spareBonus = false;
    int strikeBonus = 0;
    int scoreParTour = 0;
    int spearCompteur = 0;
    
    public void comptageDesPoints(int numberPins) {
    	
    	//Si le premier lancer n'est pas un strike
    	if(numberPins != 10) {
    		//Si le second lancer fait un spare
	    	if(coupsParTour == 1) {
	    		scoreParTour = numberPins;
	    		coupsParTour++;
	    	}
	    	else if (coupsParTour == 2) 
	    		{
	    		scoreParTour += numberPins;
	    		coupsParTour--;
	    			//Situation de spear
		    		if(scoreParTour == 10 && numberPins != 0) {
		    			spearCompteur = 2;
		    		}
		    		scoreParTour = 0;
	    		}
	    	} 
    	else
    	// Si c'est un strike
    	{
    		strikeBonus = 4;
    		coupsParTour++;
    	}
    	
    	// SpareBonus
    	// Si le spare ne compte pas lors du lancer
    	if(spearCompteur == 2) 
    	{
    		spearCompteur--;    	
    	} 
    	// Si le spare va compter au second tour
    	else if(spearCompteur == 1 ) 
    	{
    		numberPins = numberPins * 2;
    		spearCompteur--;
    	}
    	
    	// StrikeBonus
    	// Si strike, on applique un bonus au lancer d'après
    	if(strikeBonus == 4) {
    		strikeBonus--;
       	}
    	else if(strikeBonus == 3 || strikeBonus == 2 || strikeBonus == 1) 
    	{
    		numberPins = numberPins * 2;
    		strikeBonus--;
    	}
    	
    	score += numberPins;
        
    }
}
