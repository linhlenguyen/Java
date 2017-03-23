public class StringList {
  private LinkedList<String> dataSource;

  public StringList(){
    this.dataSource = new LinkedList<String>();
  }

  public void add(String item){
    this.dataSource.addItem(item);
  }

  public void remove(String item){
    this.dataSource.remove(item);
  }

  public String showList(){
    return this.dataSource.printList();
  }
}
