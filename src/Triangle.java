public class Triangle {

    private Point topLeft;
    private int sideA , sideB;

    public static int counter = 0;
    public int counterforobject = 0;


    public Triangle(Point topLeft, int sideA) {
        this.topLeft = topLeft;
        setSideA(sideA);
        counter ++;
        counterforobject ++;
    }

    public Point getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        if (sideA < 0){
            throw new IllegalArgumentException("Side A can't be negative!!");
        }
        else {
            this.sideA = sideA;
        }
    }

    public int perimeter(){
        3 * sideA;
    }
    public int area(){
        return (sideA * topLeft) / 2;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "topLeft=" + topLeft +
                ", sideA=" + sideA +
                '}';
    }
}
