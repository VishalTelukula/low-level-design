// 1️⃣ Strategy Interface: Defines driving behavior
interface DrivingMode {
    void drive();
}

// 2️⃣ Concrete Strategy: Sports Mode
class SportsMode implements DrivingMode {
    public void drive() {
        System.out.println("🚗 Driving in Sports Mode: Fast acceleration, high RPM!");
    }
}

// 3️⃣ Concrete Strategy: Off-Road Mode
class OffRoadMode implements DrivingMode {
    public void drive() {
        System.out.println("🚙 Driving in Off-Road Mode: Increased traction, lower speed!");
    }
}

// 4️⃣ Concrete Strategy: Eco Mode
class EcoMode implements DrivingMode {
    public void drive() {
        System.out.println("🌱 Driving in Eco Mode: Fuel-efficient, smooth driving!");
    }
}

// 5️⃣ Context Class: Vehicle (Uses Strategy)
class Vehicle {
    private DrivingMode drivingMode; // Strategy

    // Constructor to set initial mode
    public Vehicle(DrivingMode mode) {
        this.drivingMode = mode;
    }

    // Set driving mode dynamically
    public void setDrivingMode(DrivingMode mode) {
        this.drivingMode = mode;
    }

    // Perform driving action
    public void drive() {
        drivingMode.drive();
    }
}

// 6️⃣ Main Class: Test Strategy Pattern
public class StrategyPatternDemo {
    public static void main(String[] args) {
        // Create a Vehicle with Sports Mode
        Vehicle myCar = new Vehicle(new SportsMode());
        myCar.drive(); // 🚗 Sports Mode

        // Change to Off-Road Mode at runtime
        myCar.setDrivingMode(new OffRoadMode());
        myCar.drive(); // 🚙 Off-Road Mode

        // Change to Eco Mode at runtime
        myCar.setDrivingMode(new EcoMode());
        myCar.drive(); // 🌱 Eco Mode
    }
}
