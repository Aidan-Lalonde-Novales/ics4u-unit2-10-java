/*
* This class extends Vehicle.java with Bike fields and methods.
*
* @author  Aidan Lalonde-Novales
* @version 1.0
* @since   2022-11-01
*/

/**
 * Bike Class.
 */
public class Bike extends Vehicle {

    /**
     * Declare cadence field.
     */
    private int cadence;

    /**
     * Bike Constructor - allows main to implement values for variables.
     *
     * @param maxSpeed - max speed achievable.
     * @param color - color of the bike.
     */
    public Bike(int maxSpeed, String color) {
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
        System.out.println("    -> Cadence: " + this.cadence);
        System.out.println("");
    }

    /**
     * GetCadence() method - returns the current cadence value.
     *
     * @return cadence
     */
    public int getCadence() {
        return this.cadence;
    }

    /**
     * SetCadence() method - changes the cadence value.
     *
     * @param cadenceInput - input to replace cadence.
     */
    public void setCadence(int cadenceInput) {
        this.cadence = cadenceInput;
    }

    /**
     * Accelerate() method - polymorphism of super.accelerate() using cadence.
     *
     * @param appliedPower - power of the acceleration.
     */
    public void accelerate(int appliedPower) {
        this.cadence += appliedPower;
        super.setSpeed(this.cadence * 2);
        if (super.getSpeed() > super.getMaxSpeed()) {
            super.setSpeed(super.getMaxSpeed());
        }
    }

    /**
     * RingBell() method - prints "Ding Ding!".
     */
    public void ringBell() {
        System.out.println("Ding Ding!");
    }
}
