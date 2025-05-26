/**
 * This class holds the service class with params (name & service), I've provided getters & setters
 * as well as an actionable void method called performService()
 */

package NailSalonSim;

public class Service {

    // PRIVATE VARIABLES
    private String name;
    private int price;


    // DEFAULT CONSTUCTOR
    /**
     * Construct a new {@code Service} with default values
     * <ul>
     *     <li>Name: "No name"</li>
     *     <li>Service: 0</li>
     * </ul>
     */
    public Service() {
        this.name = "No name";
        this.price = 0;
    }
    // PARAMETERIZED CONTRUCTOR
    /**
     * Construct a new {@code Service} with specified values
     */
    public Service(String name, int price) {
        this.name = name;
        this.price = price;
    }

    // performService method
    public void performService() {
        System.out.println("Performing " + name + " for $" + price);
    }

    // GETTERS & SETTERS

    /**
     * Get name
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Set name
     * @param name the name of the service
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get price
     * @return price
     */
    public int getPrice() {
        return price;
    }

    /**
     * Set price
     * @param price the price of the service
     */
    public void setPrice(int price) {
        this.price = price;
    }
}
