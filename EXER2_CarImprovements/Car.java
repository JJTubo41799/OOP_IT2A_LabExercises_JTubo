public class Car {
    private String color;
    private String model;
    private String yearModel;

    // Default constructor
    public Car() {
        this.color = "Unknown";
        this.model = "Unknown";
        this.yearModel = "Unknown";
    }

    // Parameterized constructor
    public Car(String color, String model, String yearModel) {
        this.color = color;
        this.model = model;
        this.yearModel = yearModel;
    }

    // Getters
    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public String getYearModel() {
        return yearModel;
    }

    // Setters
    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYearModel(String yearModel) {
        this.yearModel = yearModel;
    }
}