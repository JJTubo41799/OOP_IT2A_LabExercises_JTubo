abstract class Transportation {
    protected String name;
    protected int capacity;

    public Transportation(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public abstract void move();

    public void displayInfo() {
        System.out.println("Name: " + name + ", Capacity: " + capacity);
    }
}

abstract class AirTransport extends Transportation {
    public AirTransport(String name, int capacity) {
        super(name, capacity);
    }

    @Override
    public void move() {
        System.out.println(name + " is flying in the sky.");
    }
}

class Helicopter extends AirTransport {
    public Helicopter(int capacity) {
        super("Helicopter", capacity);
    }
}

class Airplane extends AirTransport {
    public Airplane(int capacity) {
        super("Airplane", capacity);
    }
}

class SpaceShuttle extends AirTransport {
    public SpaceShuttle(int capacity) {
        super("Space Shuttle", capacity);
    }
}

abstract class LandTransport extends Transportation {
    public LandTransport(String name, int capacity) {
        super(name, capacity);
    }

    @Override
    public void move() {
        System.out.println(name + " is driving on land.");
    }
}

class Truck extends LandTransport {
    public Truck(int capacity) {
        super("Truck", capacity);
    }
}

class SUV extends LandTransport {
    public SUV(int capacity) {
        super("SUV", capacity);
    }
}

class Tricycle extends LandTransport {
    public Tricycle(int capacity) {
        super("Tricycle", capacity);
    }
}

class Motorcycle extends LandTransport {
    public Motorcycle(int capacity) {
        super("Motorcycle", capacity);
    }
}

class Kariton extends LandTransport {
    public Kariton(int capacity) {
        super("Kariton", capacity);
    }
}

abstract class WaterTransport extends Transportation {
    public WaterTransport(String name, int capacity) {
        super(name, capacity);
    }

    @Override
    public void move() {
        System.out.println(name + " is sailing on water.");
    }
}

class FerryBoat extends WaterTransport {
    public FerryBoat(int capacity) {
        super("FerryBoat", capacity);
    }
}

class Yacht extends WaterTransport {
    public Yacht(int capacity) {
        super("Yacht", capacity);
    }
}

