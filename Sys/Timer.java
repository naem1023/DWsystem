package Sys;
import java.util.*;

/**
 * 
 */
public class Timer implements  Mode{

    /**
     * Default constructor
     */
    private boolean isActivated;


    public Timer() {
        isActivated=false;
    }




    /**
     * 
     */
    private LocalDateTime settingTimer;

    /**
     * 
     */
    private LocalDateTime timerTime;

    /**
     * 
     */
    private Boolean saveTimerFlag;

    /**
     * 
     */
    private Boolean pauseTimerFlag;




    /**
     * 
     */
    public void changeCursor() {
        // TODO implement here
    }

    /**
     * 
     */
    public void increaseData() {
        // TODO implement here
    }

    /**
     * 
     */
    public void decreaseData() {
        // TODO implement here
    }

    /**
     * 
     */
    public void saveTimer() {
        // TODO implement here
    }

    /**
     * 
     */
    private void decreaseTimer() {
        // TODO implement here
    }

    /**
     * 
     */
    public void startTimer() {
        // TODO implement here
    }

    /**
     * 
     */
    public void pauseTimer() {
        // TODO implement here
    }

    /**
     * 
     */
    public void resumeTimer() {
        // TODO implement here
    }

    /**
     * 
     */
    public void cancelTimer() {
        // TODO implement here
    }

}