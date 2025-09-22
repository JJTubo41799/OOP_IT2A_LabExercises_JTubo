public class TransportationTester {
    public static void main(String[] args) {
        // Air
        Transportation heli = new Helicopter(5);
        Transportation plane = new Airplane(180);
        Transportation shuttle = new SpaceShuttle(7);

        // Land
        Transportation truck = new Truck(3);
        Transportation suv = new SUV(7);
        Transportation tricycle = new Tricycle(3);
        Transportation motor = new Motorcycle(2);
        Transportation kariton = new Kariton(1);

        // Water
        Transportation fboat = new FerryBoat(20);
        Transportation sub = new Yacht(50);       

        // Testing for all transportation types
        Transportation[] transports = {
            heli, plane, shuttle,
            truck, suv, tricycle, motor, kariton,
            fboat, sub 
        };

        for (Transportation t : transports) {
            t.displayInfo();
            t.move();
            System.out.println("------------------");
        }
    }
}