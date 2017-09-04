/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc user
 */
public class BoundedCounter {

    private int value;
    private int upperLimit;

    public BoundedCounter(int upperlimit) {
        this.upperLimit = upperlimit;
        
    }

    public void next() {
        this.value++;
        if (this.value > this.upperLimit) {
            this.value = 0;
        }
    }


    @Override
    public String toString() {

        return String.format("%02d", value);
    }

    public int getValue() {
        
        return this.value;
    }

    public void setValue(int value){
        if((value > 0) && (value <= upperLimit))
        this.value = value;
    }
}