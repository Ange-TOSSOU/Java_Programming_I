/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ange
 */
public class Timer {
    private ClockHand seconds;
    private ClockHand hundredthsOfSecond;
    
    public Timer() {
        seconds = new ClockHand(60);
        hundredthsOfSecond = new ClockHand(100);
    }
    
    public void advance() {
        hundredthsOfSecond.advance();
        if (hundredthsOfSecond.value() == 0) {
            seconds.advance();
        }
    }
    
    @Override
    public String toString() {
        return seconds + ":" + hundredthsOfSecond;
    }
}
