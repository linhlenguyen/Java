public class Cylinder extends Shape  {
  public Circle circle;
  public Double height;

  public Cylinder(Double x, Double y, Double radius, Double height){
    this.circle = new Circle(x, y, radius);
    this.height = height;
  }

  public String getName(){
    return "Cylinder";
  }

  public String toString(){
    return this.circle.toString() + " Height: " + Double.toString(this.height);
  }

  public Double getVolume(){
    return this.circle.getArea() * this.height;
  }
}
