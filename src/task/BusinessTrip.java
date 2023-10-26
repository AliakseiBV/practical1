package task;

public class BusinessTrip {
    private final static int DAILY_RATE = 2300;
    private String employeesAccount;
    private int transportationExpenses;
    private int numberOfDays;

    // no-args constructor
    public BusinessTrip(){
        this.employeesAccount = "Sub-Zero";
        this.transportationExpenses = 420;
        this.numberOfDays = 7;
    }

    // parametrized constructor
    public BusinessTrip(String employeesAccount, int transportationExpenses, int numberOfDays) {
        this.employeesAccount = employeesAccount;
        this.transportationExpenses = transportationExpenses;
        this.numberOfDays = numberOfDays;
    }

    // show-method
    public void show (){
        System.out.println("rate: " + centsToEuro(DAILY_RATE) + "\n" +
                "account: " + getEmployeesAccount() + "\n" +
                "transport: " + centsToEuro(getTransportationExpenses()) + "\n" +
                "days: " + getNumberOfDays() + "\n" +
                "total: " + centsToEuro(getTotal()) + "\n");
    }

    // overriding toString method
    public String toString(){
        return this.employeesAccount + ";" + centsToEuro(this.transportationExpenses) + ";"
                + this.numberOfDays + ";" + centsToEuro(getTotal());
    }

    //method 'Total'
    public int getTotal(){
        int total = DAILY_RATE * getNumberOfDays() + getTransportationExpenses();
        return total;
    }

    //Method to format Cents to Euro
    private static String centsToEuro(int amount) {
        return String.format("%d.%02d", amount / 100, amount % 100);
    }

    //Getters
    public String getEmployeesAccount() {
        return employeesAccount;
    }
    public int getNumberOfDays() {
        return numberOfDays;
    }
    public int getTransportationExpenses() {
        return transportationExpenses;
    }

    //Setters
   public void setTransportationExpenses(int transportationExpenses) {
        this.transportationExpenses = transportationExpenses;
    }

}
