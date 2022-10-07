import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public abstract class Invoice extends Object {

    private double amountBeforeTax ;
    private double taxRate ;
    // private int amountAfterTax ;
    private LocalTime timeOfTrasaction ;

    // CONSTRUCTEUR

    public Invoice (double amountBeforeTax,double taxRate) {
        this.amountBeforeTax=amountBeforeTax;
        this.taxRate=taxRate;
        timeOfTrasaction=LocalTime.now();

    }

    //setters and getters


    public double getAmountBeforeTax() {
        return amountBeforeTax;
    }

    public void setAmountBeforeTax(double amountBeforeTax) {
        this.amountBeforeTax = amountBeforeTax;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

    public LocalTime getTimeOfTrasaction() {
        return timeOfTrasaction;
    }

    public void setTimeOfTrasaction(LocalTime timeOfTrasaction) {
        this.timeOfTrasaction = timeOfTrasaction;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "amountBeforeTax=" + amountBeforeTax +
                ", taxRate=" + taxRate +
                ", time Of Trasaction=" + timeOfTrasaction.format(DateTimeFormatter.ofPattern("HH:mm:ss")) +
                '}';
    }
}
