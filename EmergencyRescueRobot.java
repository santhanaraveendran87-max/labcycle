abstract class RescueRobot {

    protected String robotName;
    protected int batteryLevel;

    // Constructor
    RescueRobot(String robotName, int batteryLevel) {
        this.robotName = robotName;
        this.batteryLevel = batteryLevel;
    }

    // Concrete method
    void startRobot() {
        System.out.println(robotName + " has started.");
    }

    // Concrete method
    void showBattery() {
        System.out.println("Battery Level: " + batteryLevel + "%");
    }

    // Abstract method
    abstract void performMission();
}


// Flyable interface
interface Flyable {
    void fly();
}


// Swimmable interface
interface Swimmable {
    void swim();
}


// Climbable interface
interface Climbable {
    void climb();
}


// Flying Rescue Robot
class FlyingRobot extends RescueRobot
        implements Flyable {

    FlyingRobot(String name, int battery) {
        super(name, battery);
    }

    public void fly() {
        System.out.println(robotName + " is flying.");
    }

    @Override
    void performMission() {
        System.out.println(robotName +
                " is searching for victims from the air.");
    }
}


// Swimming Rescue Robot
class SwimmingRobot extends RescueRobot
        implements Swimmable {

    SwimmingRobot(String name, int battery) {
        super(name, battery);
    }

    public void swim() {
        System.out.println(robotName + " is swimming.");
    }

    @Override
    void performMission() {
        System.out.println(robotName +
                " is rescuing people from water.");
    }
}


// Climbing Rescue Robot
class ClimbingRobot extends RescueRobot
        implements Climbable {

    ClimbingRobot(String name, int battery) {
        super(name, battery);
    }

    public void climb() {
        System.out.println(robotName + " is climbing.");
    }

    @Override
    void performMission() {
        System.out.println(robotName +
                " is rescuing people from mountains.");
    }
}


// Multi-purpose Rescue Robot
class MultiPurposeRobot extends RescueRobot
        implements Flyable, Swimmable, Climbable {

    MultiPurposeRobot(String name, int battery) {
        super(name, battery);
    }

    public void fly() {
        System.out.println(robotName + " is flying.");
    }

    public void swim() {
        System.out.println(robotName + " is swimming.");
    }

    public void climb() {
        System.out.println(robotName + " is climbing.");
    }

    @Override
    void performMission() {
        System.out.println(robotName +
                " is performing a multi-terrain rescue mission.");
    }
}


// Main class
public class EmergencyRescueRobot {

    public static void main(String[] args) {

        // Abstract class references
        RescueRobot robot1 =
                new FlyingRobot("SkyRescue", 90);

        RescueRobot robot2 =
                new SwimmingRobot("AquaRescue", 85);

        RescueRobot robot3 =
                new ClimbingRobot("MountainRescue", 80);

        RescueRobot robot4 =
                new MultiPurposeRobot("AllTerrainRescue", 95);

        System.out.println("===== EMERGENCY RESCUE ROBOT SYSTEM =====");

        System.out.println("\n--- Flying Robot ---");
        robot1.startRobot();
        robot1.showBattery();
        robot1.performMission();

        Flyable flyingRobot = (Flyable) robot1;
        flyingRobot.fly();

        System.out.println("\n--- Swimming Robot ---");
        robot2.startRobot();
        robot2.showBattery();
        robot2.performMission();

        Swimmable swimmingRobot = (Swimmable) robot2;
        swimmingRobot.swim();

        System.out.println("\n--- Climbing Robot ---");
        robot3.startRobot();
        robot3.showBattery();
        robot3.performMission();

        Climbable climbingRobot = (Climbable) robot3;
        climbingRobot.climb();

        System.out.println("\n--- Multi-Purpose Robot ---");
        robot4.startRobot();
        robot4.showBattery();
        robot4.performMission();

        Flyable flyable = (Flyable) robot4;
        Swimmable swimmable = (Swimmable) robot4;
        Climbable climbable = (Climbable) robot4;

        flyable.fly();
        swimmable.swim();
        climbable.climb();
    }
}