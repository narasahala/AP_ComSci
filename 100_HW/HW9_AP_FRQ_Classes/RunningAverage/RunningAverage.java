import java.util.*;

public class RunningAverage{
    /** The number of ratings included in the running average. */
    private int count;

    /** The average of the ratings that have been entered. */
    private double average;

    // There are no other instance variables.

    /** Creates a RunningAverage object.
    * Postcondition: count is initialized to 0 and average is
    * initialized to 0.0.
    */
    
    public RunningAverage(){
        /* implementation not shown */
    }

    /** Updates the running average to reflect the entry of a new
    * rating, as described in part (a).
    */
    public void updateAverage(double newVal){
        /* to be implemented in part (a) */
        double num1 = count * average;
        count++;
        (newVal + num1) / count = average;
    }


    /** Processes num new ratings by considering them for inclusion
    * in the running average and updating the running average as
    * necessary. Returns an integer that represents the number of
    * invalid ratings, as described in part (b).
    * Precondition: num > 0
    */
    public int processNewRatings(int num){
        /* to be implemented in part (b) */
        int total = 0;
        int num2 = 0;
        while(total < num){
        if(getNewRating() > 0){
            updateAverage(getNewRating());
            total++;}
        else{
            num2++;
            total++;}}
        return num2;}

    /** Returns a single numeric rating. */
    public double getNewRating(){
        /* implementation not shown */
    }
}
