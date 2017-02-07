public class Point {
  private Double x;
  private Double y;

  public Point(Double x, Double y){
    this.x = x;
    this.y = y;
  }

  public String toString(){
    return "x: " + Double.toString(this.x) + " y: " + Double.toString(this.y);
  }
}
