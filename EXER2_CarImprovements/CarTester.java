public class CarTester {
    public static void main(String[] args) {
        Car[] cars = new Car[10];
        cars[0] = new Car("Red", "Toyota", "2020");
        cars[1] = new Car("Blue", "Honda", "2019");        
        cars[2] = new Car("Black", "Ford", "2018");
        cars[3] = new Car("White", "Chevrolet", "2021");   
        cars[4] = new Car("Green", "Nissan", "2017");
        cars[5] = new Car("Yellow", "BMW", "2022");
        cars[6] = new Car("Silver", "Audi", "2016");
        cars[7] = new Car("Gray", "Mercedes", "2015");
        cars[8] = new Car("Orange", "Kia", "2023");
        cars[9] = new Car("Purple", "Hyundai", "2014");

        for (Car car : cars) {
            System.out.println("Car Model: " + car.getModel() + ", Color: " + car.getColor() + ", Year Model: " + car.getYearModel());
        }
    }
}