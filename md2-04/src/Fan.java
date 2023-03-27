public class Fan {
    static final int SLOW = 1;
    static final int MEDIUM = 2;
    static final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public Fan() {
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        String str = "";
        if (on) {
            str = "Color: " + color + "\nRadius: " + radius + "\nSpeed:" + speed + "\nFan is on";
        } else {
            str = "Color: " + color + "\nRadius: " + radius + "\nFan is off";
        }
        return str;
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan(Fan.SLOW, true, 10, "yellow");
        Fan fan2 = new Fan(Fan.MEDIUM, false, 5, "blue");
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
