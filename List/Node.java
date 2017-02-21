public class Node<T extends Comparable<T>>{
  private T value;
  private Node<T> next;

  public Node(T v){
    this.value = v;
    this.next = null;
  }

  public T getValue(){
    return this.value;
  }

  public Node<T> getNext(){
    return this.next;
  }

  public void setNext(Node<T> n){
    this.next = n;
  }

  public String toString(){
    return String.valueOf(value);
  }
}
