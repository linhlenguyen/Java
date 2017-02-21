public class LinkedList<T extends Comparable<T>>{
  protected Node<T> head;

  public LinkedList(){
    this.head = null;
  }

  public void addItem(T v){
    if (this.head == null){
      this.head = new Node<T>(v);
    }
    else {
      Node<T> current = this.head;
      Node<T> next = current.getNext();
      while (true){
        if (next == null || (current.getValue().compareTo(v) <= 0 && next.getValue().compareTo(v) > 0)){
            Node<T> newNode = new Node<T>(v);
            current.setNext(newNode);
            newNode.setNext(next);
            break;
        }
        current = current.getNext();
        next = current.getNext();
      }
    }
  }

  public void remove(T v){
    if (this.head == null){
      return;
    }

    Node<T> current = this.head;
    Node<T> next;
    while(current != null){
      next = current.getNext();
      //Removal from head
      if (current == this.head && current.getValue() == v){
        this.head = current.getNext();
        current = this.head;
        continue;
      }

      if (next != null && next.getValue() == v){
        current.setNext(next.getNext());
      }
      current = current.getNext();
    }
  }

  public String printList(){
    if (this.head == null){
      return "[]";
    }

    String r = "[";
    Node<T> next = this.head;
    do {
      if (next.getNext() == null){
          r += next.toString() + "]";
          break;
      }
      r += next.toString() + ", ";
      next = next.getNext();
    } while (true);
    return r;
  }
}
