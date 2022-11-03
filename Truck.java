/*
* This class extends Vehicle.java with Truck fields and methods.
*
* @author  Aidan Lalonde-Novales
* @version 1.0
* @since   2022-11-01
*/

/**
 * Truck Class.
 */
public class Truck extends Vehicle {

    /**
     * Declare licensePlate field.
     */
    private String licensePlate = "";

    /**
     * Declare Air Pressure field.
     */
    private int airPressure;

    /**
     * Truck Constructor - allows main to implement values for variables.
     *
     * @param maxSpeed - max speed achievable.
     * @param color - color of the Truck.
     */
    public Truck(int maxSpeed, String color) {
        super(maxSpeed, color);
    }

    /**
     * Status() method - prints all current values.
     */
    public void status() {
        System.out.println("");
        System.out.println("    -> Speed: " + super.getSpeed());
        System.out.println("    -> Max Speed: " + super.getMaxSpeed());
        System.out.println("    -> Color: " + super.getColor());
        System.out.println("    -> License Plate: " + this.licensePlate);
        System.out.println("    -> Air Pressure: " + this.airPressure);
        System.out.println("");
    }

    /**
     * SetLicensePlate() method - changes the licensePlate value.
     *
     * @param licensePlateInput - input to replace licensePlate.
     */
    public void setLicensePlate(String licensePlateInput) {
        this.licensePlate = licensePlateInput;
    }

    /**
     * GetLicensePlate() method - returns the current licensePlate value.
     *
     * @return licensePlate
     */
    public String getLicensePlate() {
        return this.licensePlate;
    }

    /**
     * SetAirPressure() method - changes the airPressure value.
     *
     * @param airPressureInput - input to replace airPressure.
     */
    public void setAirPressure(int airPressureInput) {
        this.airPressure = airPressureInput;
    }

    /**
     * GetAirPressure() method - returns the current airPressure value.
     *
     * @return airPressure
     */
    public int getAirPressure() {
        return this.airPressure;
    }

    /**
     * Braking() method - uses brakePower, brakeTime, and airProvided
     * to reduce speed.
     *
     * @param brakePower - input that reduces speed based on power.
     * @param brakeTime - input that reduces speed based on time.
     */
    public void braking(int brakePower, int brakeTime) {
        super.setSpeed(
            super.getSpeed() - brakePower * brakeTime
            - this.airPressure * brakeTime);
        if (super.getSpeed() < 0) {
            super.setSpeed(0);
        }
    }
}
