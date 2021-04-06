package PoolAreaCodingChallenge;

public class Cuboid extends Rectangle {
    private double height;

    public Cuboid(double height, double length, double width) {
        super(width, length);
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public double getHeight() {
        return this.height;
    }

    public double getVolume() {
        return getArea() * getHeight();
    }
}
