/**
 * This class will hold the loops for the work day events in their own methods:
 * calcuteTotals(): will return the sum of all the prices of the services performed in 1 day
 * countCustomers(): will return the total number of customers seen in 1 day
 */

package NailSalonSim;

import java.util.ArrayList;

public class WorkDay {

    // PRIVATE VARIABLES
    String day; // a variable to hold the current day
    private int totalEarnings; // a variable to hold the total earnings for the current day
    private int customerCount; // a variable to hold the total number of customers seen for the current day

    // create an ArrayList to hold the service and update +1 as each service is completed
    private ArrayList<Service> services = new ArrayList<>(); // // stays private so it cant be touched by other classes

    // // public getter so others can read but not write list content
    public ArrayList<Service> getServices() {
        return services;
    }


    // METHODS

    public void calculateTotals(){
        int total = 0; // running total for the day
        for (Service all: getServices()) { // (Object nickname : getObject()
            total += all.getPrice(); // total += (keep incrementing) nickname.specificPieceIWantIncremented()
        }
        setTotalEarnings(total); // set total earnings variable to the incremented value from my object
    }

    public void countCustomers(){
        int count = 0; // running count for customers seen in the day
        for (Service all: getServices()) { // (Object nickname : getObject()
            count ++; // keep incrementing the object count
        }
        setCustomerCount(count); // set the count to the incremented value from my object
    }

    // GETTERS AND SETTERS

    /**
     * Get day
     * @return day
     */
    public String getDay() {
        return day;
    }

    /**
     * Set day
     * @param day the current day
     */
    public void setDay(String day) {
        this.day = day;
    }

    /**
     * Get total earnings
     * @return totalEarnings
     */
    public int getTotalEarnings() {
        return totalEarnings;
    }

    /**
     * Set total earnings
     * @param totalEarnings the total amount earned in 1 day
     */
    public void setTotalEarnings(int totalEarnings) {
        this.totalEarnings = totalEarnings;
    }

    /**
     * Get customer count
     * @return customer count
     */
    public int getCustomerCount() {
        return customerCount;
    }

    /**
     * Set customer count
     * @param customerCount the total # of customers seen in 1 day
     */
    public void setCustomerCount(int customerCount) {
        this.customerCount = customerCount;
    }

}
