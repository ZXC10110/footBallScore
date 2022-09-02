/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package footballscore;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kanya
 */
public class getScore {
    private String score;
    private List<scoreObserver> observers = new ArrayList<scoreObserver>();
    
    //getter
    public String getFScore(){
        return score;
    }
    
    //setter 
    public void setFScore(String score){
        this.score = score;
        notifyAllObservers();
    }
    
    //notify
    public void notifyAllObservers(){
        //update
        for (scoreObserver observer : observers) {
            observer.updateScore();
        }
    } 
    
    //addScore
    public void addFScore(scoreObserver score){
        observers.add(score);
    }
    
}
