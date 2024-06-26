class Rectangle {
    private int length;
    private int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getArea() {
        return length * breadth;
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(4, 5);
        Rectangle rectangle2 = new Rectangle(5, 8);

        int area1 = rectangle1.getArea();
        int area2 = rectangle2.getArea();

        System.out.println("Area of rectangle 1: " + area1);
        System.out.println("Area of rectangle 2: " + area2);
    }
}
