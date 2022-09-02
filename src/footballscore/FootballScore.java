package footballscore;

/**
 *
 * @author kanya
 */

import java.util.*;

public class FootballScore {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean enter = true;
        
        getScore get = new getScore();
        new observer01(get);   
        new observer02(get); 
        
        while (enter){
            System.out.print("ENTER SCORE : ");
            String score = sc.nextLine();
            if (score.equals("")) {
                enter = false;
                get.setFScore("End Match");
            } else {
                get.setFScore(score);
            }
        }
    }
}
