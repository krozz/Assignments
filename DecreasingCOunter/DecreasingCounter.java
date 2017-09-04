public class DecreasingCounter {
    private int value;  // instance variable that remembers the value of the counter
    private int initialvalue;

    
    public DecreasingCounter(int valueAtStart) {
        this.value = valueAtStart;
        this.initialvalue = valueAtStart;
    }

    public void printValue() {
        // do not touch this!
        System.out.println("value: " + this.value);
    }

    public void decrease() {
        if (value > 0){
        value--; //just decrements the number by 1
        }
    }
    public void reset(){
    this.value = 0;    
    }
    
    public void setInitial(){
        this.value = initialvalue;
    }
    

}
