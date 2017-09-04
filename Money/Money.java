
import static java.lang.Math.abs;

public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money added) {
        Money money = new Money(added.euros() + this.euros(), added.cents() + this.cents());

        return money;
    }

    public boolean less(Money compared) {
        int a = this.euros();
        int b = compared.euros();
        
        if (this.euros() < 0) {
            a = 0;
        }
        if (compared.euros() < 0) {
            b = 0;
        }
        if(a == b){
            if(this.cents() < compared.cents())
                return true;
        }
        if (a < b) {
            return true;
        }
        return false;

        /* Money moneyDecremented1 = new Money(0, 0);
         Money moneyTest = new Money(this.euros, this.cents);
         if(moneyTest.minus(compared) == moneyDecremented1){
         return false;
         }
        

         return true;
         }*/
    }

    public Money minus(Money decremented) {
        int a = this.euros() - decremented.euros();
        int b = this.cents() - decremented.cents();
        if (b < 0) {
            a--;
            b = 100 - abs(b);

        }
        if (a < 0) {
            a = 0;
            b = 0;
        }

        Money moneyDecremented = new Money(a, b);
        return moneyDecremented;
    }

}
