package mid2.collections.set.test;

import java.util.Objects;

public class Rectangle {

//    rectangle = Rectangle{width=10, height=10}
//    rectangle = Rectangle{width=20, height=20}
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

//    rectangle = Rectangle{width=10, height=10}
//    rectangle = Rectangle{width=20, height=20}


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return width == rectangle.width && height == rectangle.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
