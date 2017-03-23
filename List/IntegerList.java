public class IntegerList {
  private LinkedList<Integer> dataSource;

  public IntegerList(){
    this.dataSource = new LinkedList<Integer>();
  }

  public void add(Integer item){
    this.dataSource.addItem(item);
  }

  public void remove(Integer item){
    this.dataSource.remove(item);
  }

  public String showList(){
    return this.dataSource.printList();
  }
}
