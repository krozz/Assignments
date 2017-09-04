
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }

    public boolean larger(Apartment otherApartment) {
        if (this.squareMeters > otherApartment.squareMeters) {
            return true;
        } else {
            return false;
        }
    }

    public int priceDifference(Apartment otherApartment) {
        int priceOne = this.pricePerSquareMeter * this.squareMeters;
        int priceTwo = otherApartment.pricePerSquareMeter * otherApartment.squareMeters;
        int difference = priceOne - priceTwo;
        return Math.abs(difference);
    }

    public boolean moreExpensiveThan(Apartment otherApartment) {
        int priceOne = this.pricePerSquareMeter * this.squareMeters;
        int priceTwo = otherApartment.pricePerSquareMeter * otherApartment.squareMeters;
        if (priceOne > priceTwo) {
            return true;
        } else {
            return false;
        }
    }
}
