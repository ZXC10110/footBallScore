/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package footballscore;

/**
 *
 * @author kanya
 */
public class observer01 extends scoreObserver{
    
    public observer01(getScore score){
        this.score = score;
        this.score.addFScore(this);
    }
    
    @Override
    public void updateScore(){
        System.out.println( "Live Result : " + score.getFScore()); 
    }
}
