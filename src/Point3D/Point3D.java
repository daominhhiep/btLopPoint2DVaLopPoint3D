package Point3D;

import Poind2D.Point2D;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D() {

    }

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ() {
        super.getX();
        super.getY();
        this.z = z;
    }

    public float[] getXYZ() {
        float[] array = new float[3];
        array[0] = super.getX();
        array[1] = super.getY();
        array[2] = this.z;
        return array;
    }

    @Override
    public String toString() {
        return "(x,y,z)"
                + "("
                + super.getX()
                + ","
                + super.getY()
                + ","
                + this.getZ()
                + ")";
    }
}
