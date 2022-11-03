/*
* This file contains fields and methods to be applied to a Vehicle.
*
* @author  Aidan Lalonde-Novales
* @version 1.0
* @since   2022-11-01
*/

/**
 * Vehicle Class.
 */
public class Vehicle {

    /**
     * Declare vehicle speed.
     */
    private int speed;

    /**
     * Declare the max vehicle speed.
     */
    private int maxSpeed;

    /**
     * Declare vehicle color.
     */
    private String color;

    /**
     * Vehicle Constructor - allows main to implement values for variables.
     *
     * @param maxSpeed - max speed achievable.
     * @param color - color of the vehicle.
     */
    public Vehicle(
        int maxSpeed,
        String color) {
        this.maxSpeed = maxSpeed;
        this.color = color;
    }

    /**
     * GetColor() method - returns the current color value.
     *
     * @return color
     */
    public String getColor() {
        return this.color;
    }

    /**
     * SetColor() method - changes the color value.
     *
     * @param colorInput - input from Main to replace color
     */
    public void setColor(String colorInput) {
        this.color = colorInput;
    }

    /**
     * GetSpeed() method - returns the current speed value.
     *
     * @return speed
     */
    public int getSpeed() {
        return this.speed;
    }

    /**
     * SetSpeed() method - changes the speed value.
     *
     * @param speedInput - input to replace speed
     */
    public void setSpeed(int speedInput) {
        this.speed = speedInput;
    }

    /**
     * GetMaxSpeed() method - returns the current maxSpeed value.
     *
     * @return maxSpeed
     */
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    /**
     * Accelerate() method - increases the speed of the vehicle.
     *
     * @param accelPower - power of the acceleration
     * @param accelTime - time to accelerate for
     */
    public void accelerate(int accelPower, int accelTime) {
        this.speed += accelPower * accelTime;
        if (!(this.speed < this.maxSpeed)) {
            this.speed = this.maxSpeed;
        }
    }

    /**
     * Braking() method - decreases the speed of the vehicle.
     *
     * @param breakPower - power of the break
     * @param breakTime - time to break for
     */
    public void braking(int breakPower, int breakTime) {
        this.speed -= breakPower * breakTime;
        if (!(this.speed >= 0)) {
            this.speed = 0;
        }
    }
}
