package Projects;

import java.util.ArrayList;
import java.util.List;

class ShowroomManagement {
    private List<Vehicle> vehicles = new ArrayList<>();

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
        System.out.println("Vehicle added successfully!");
    }

    public void displayVehicles() {
        if (vehicles.isEmpty()) {
            System.out.println("No vehicles available.");
            return;
        }
        for (Vehicle v : vehicles) {
            System.out.println(v);
        }
    }

    public void searchVehicle(String model) {
        boolean found = false;
        for (Vehicle v : vehicles) {
            if (v.getModel().equalsIgnoreCase(model)) {
                System.out.println(v);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No vehicle found with model: " + model);
        }
    }
}
