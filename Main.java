/*
* This file runs alongside Vehicle.java in order to
* create a vehicle with appropriate characteristics
*
* @author  Aidan Lalonde-Novales
* @version 1.0
* @since   2022-11-01
*/

/**
 * This is a program that runs alongside Vehicle.java
*/

final class Main {
    /**
     * Prevent instantiation.
     * Throw an exception IllegalStateException.
     * if this ever is called
     *
     * @throws IllegalStateException
     *
     */
    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        // Avoid "Magic Number" errors.
        final int two = 2;
        final int five = 5;
        final int ten = 10;
        final int fifteen = 15;
        final int forty = 40;
        final int twoHundred = 200;

        // Create BMX bike.
        System.out.println("Created BMX Bike.");
        final Bike bmxBike = new Bike(forty, "Red");

        System.out.println("Bike Status:");
        bmxBike.status();

        System.out.println("Set the cadence to 10:");
        bmxBike.setCadence(ten);
        bmxBike.accelerate(0);
        bmxBike.status();

        System.out.println("Accelerate by 15:");
        bmxBike.accelerate(fifteen);
        bmxBike.status();

        System.out.println("Braking, 5 of power for 2 seconds:");
        bmxBike.braking(five, two);
        bmxBike.status();

        System.out.println("Ring Bell:");
        bmxBike.ringBell();
        System.out.println("");

        // Create Truck.
        System.out.println("Created Truck.");
        final Truck truckObj = new Truck(twoHundred, "Grey");
        truckObj.setLicensePlate("HGC-3456F");

        System.out.println("Truck Status:");
        truckObj.status();

        System.out.println("Accelerating, 10 of power for 10 seconds:");
        truckObj.accelerate(ten, ten);
        System.out.println("\nNew speed (1): " + truckObj.getSpeed());
        System.out.println("");

        System.out.println("Set tire Air Pressure to 5:");
        truckObj.setAirPressure(five);
        System.out.println("\nNew Air Pressure: " + truckObj.getAirPressure());
        System.out.println("");

        System.out.println("Breaking, 10 of power for 2 seconds:");
        truckObj.braking(ten, two);
        System.out.println("\nNew speed (2): " + truckObj.getSpeed());

        System.out.println("\nDone.");
    }
}
