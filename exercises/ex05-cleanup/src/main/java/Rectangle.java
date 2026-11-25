/**
 * Represent a rectangle with width and height.
 */

public class Rectangle {
  private double width;
  private double height;

  /**
   * Construct a rectangle with given width and height.
   *
   * @param w the width of the rectangle
   * @param h the height of the rectangle
   */

  public Rectangle(double w, double h) {
    this.width = w;
    this.height = h;
  }

  /**
   * Calculated the area of this rectangle.
   *
   * @return the area of this rectangle
   */

  public double area() {
    return width * height;
  }

  /**
   * Scales the rectangle.
   *
   * @param factor the scaling factor
   */
  public void scale(double factor) {
    width = width * factor;
    height = height * factor;
  }

  /**
   * Check whether this rectangle has a strictly larger area than another rectangle.
   *
   * @param other the other rectangle to compare
   * @return {@code true} if this rectangle is larger than {@code other}, {@code false} otherwise
   */

  public boolean isLargerThan(Rectangle other) {
    return area() > other.area();
  }
}

