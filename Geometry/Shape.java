public abstract class Shape{
  public String getName(){
      return "An abstract shape";
  }
  public String toString(){
      return "No descriptions";
  }

  public Double getArea(){
      return -1.0;
  }

  public String showArea(){
      if (getArea() < 0)
        return "Not applicable";
      else return Double.toString(getArea());
  }

  public Double getVolume(){
      return -1.0;
  }

  public String showVolume(){
    if (getVolume() < 0)
      return "Not applicable";
    else return Double.toString(getVolume());
  }
}
