package pl.jwrabel;

/**
 * Created by jakubwrabel on 24.04.2017.
 */
public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(String text) { // "100,2"
        String[] splitted = text.split(",");
        // splitted -> { "100", "2" }


    }

    public static void main(String[] args) {
        Point point1 = new Point(100, 200);
        System.out.println(point1);

        System.out.println("-- PO DODANIU metodą add(int x, int y) ---");
        point1.add(50, 30);
        System.out.println(point1);

        // reset
        point1 = new Point(100, 200);
        System.out.println("-- po resecie --");
        System.out.println(point1);


        Point point2 = new Point(100, 300);
        System.out.println("-- punkt2 -- ");
        System.out.println(point2);

        point1.add(point2);
        System.out.println("-- po dodaniu metodą add(Point point)");
        System.out.println(point1);
    }

    public void add(int x, int y) {
        this.x += x;
        this.y += y;
    }

    public void add(Point point) {
        int x2 = point.getX();
        int y2 = point.getY();

        this.x += x2;
        this.y += y2;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Point point = (Point) o;

        if (x != point.x) return false;
        return y == point.y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
