abstract class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double calculateArea();
    public abstract double calculatePerimeter();

    public void display() {
        System.out.println("Shape: " + name);
    }
}
