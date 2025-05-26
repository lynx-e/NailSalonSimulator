/**
 * This Driver holds the main, controls the loops and holds the hardcode for the service class
 */

package NailSalonSim;

public class Driver {
    public static void main(String[] args) {


        // start the day

        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        for (String day : daysOfWeek) {

            if (day.equals("Monday")) {
                System.out.println( "Day: " + day + " | You're off on this day");
            } else {
                // create new service objects
                Service manicure = new Service("Manicure", 30);
                Service gelMani = new Service("Gel Manicure", 40);
                Service pedicure = new Service("Pedicure", 35);
                Service gelPedi = new Service("Gel Pedicure", 55);

                // create new workday objects
                WorkDay workday = new WorkDay();

                // workday object gets the list to hold services (WorkDay class) and adds service objects above
                workday.getServices().add(manicure);
                workday.getServices().add(gelMani);
                workday.getServices().add(pedicure);
                workday.getServices().add(gelPedi);

                workday.calculateTotals();
                workday.countCustomers();
                workday.calculateTotals();
                workday.countCustomers();
                System.out.println("Day: " + day +
                        " | Total earnings: $" + workday.getTotalEarnings() +
                        " | Customer count: " + workday.getCustomerCount());
            }
        }
    }
}
