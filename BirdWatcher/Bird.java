public class Bird {
    
    // Private variables name, latin name, observation count
    private String name;
    private String latinName;
    private int observationCount;
    
    // Constructor which takes two arguments Name and Latin name, sets observations to 0
    public Bird (String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.observationCount = 0;
    }

    Bird() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String getName() {
        return this.name;
    }
    
    public void observeCount() {
        this.observationCount++;
    }
    
    public int getObservationCount() {
        return this.observationCount;
    }
    
    public String toString () {
        return this.name + " (" + this.latinName + "): " + this.observationCount + " observations";
    }
}