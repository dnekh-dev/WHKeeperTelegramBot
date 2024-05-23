package dnekh.telegabot.handlers;

public class HoursConverter {

    private int wage;
    private double rate;
    private double totalForThisDay;

    //TODO delete this constructor after project end <<<<
    // Constructor without parameters is not necessary unless you need it for specific purposes
    public HoursConverter() {
    }

    // Constructor with initial wage and rate
    public HoursConverter(int wage, double rate) {
        setWage(wage);
        setRate(rate);
        this.totalForThisDay = calculateTotalForThisDay();
    }

    // Private method to calculate total earnings for the day
    private double calculateTotalForThisDay() {
        return this.wage * this.rate;
    }

    // Getter for wage
    public int getWage() {
        return wage;
    }

    // Setter for wage with validation
    public void setWage(int wage) {
        if (wage <= 0) {
            throw new IllegalArgumentException("Wage must be greater than 0.");
        }
        this.wage = wage;
        this.totalForThisDay = calculateTotalForThisDay(); // Recalculate totalForThisDay whenever wage is updated
    }

    // Getter for rate
    public double getRate() {
        return rate;
    }

    // Setter for rate with validation
    public void setRate(double rate) {
        if (rate <= 0) {
            throw new IllegalArgumentException("Rate must be greater than 0.");
        }
        this.rate = rate;
        this.totalForThisDay = calculateTotalForThisDay(); // Recalculate totalForThisDay whenever rate is updated
    }

    // Getter for total earnings for the day
    public double getTotalForThisDay() {
        return totalForThisDay;
    }
}
