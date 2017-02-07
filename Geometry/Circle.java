public class Circle extends Shape {
  public Point origin;
  public Double radius;

  public Circle (Double x, Double y, Double radius){
    this.origin = new Point(x, y);
    this.radius = radius;
  }

  public String getName(){
    return "Circle";
  }

  public String toString(){
    return "Origin: " + this.point.toString() + " Radius: " + Double.toString(this.radius);
  }

  public Double getArea(){
    return Math.PI * Math.pow(this.radius, 2);
  }
}
