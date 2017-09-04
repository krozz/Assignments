public class Reformatory {
    private int timesmeasured = 0;

    public int weight(Person person) {
        // return the weight of the person
        this.timesmeasured++;
        
        return person.getWeight();
    }
    public void feed(Person person){
        //increases the weight of the person by 1
        person.setWeight(person.getWeight() + 1);
        
    }
    public int totalWeightsMeasured(){
     return timesmeasured;
    }
    

}
