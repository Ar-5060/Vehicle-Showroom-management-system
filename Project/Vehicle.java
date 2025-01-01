package Projects;

class Vehicle {
    private int vehicleId;
    private String brand;
    private String model;
    private double price;
    private boolean availability;

    public Vehicle(int vehicleId, String brand, String model, double price, boolean availability) {
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.availability = availability;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    @Override
    public String toString() {
        return "Vehicle ID: " + vehicleId + ", Brand: " + brand + ", Model: " + model +
                ", Price: " + price + ", Available: " + availability;
    }
}
