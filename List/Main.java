import java.io.*;

public class Main{
  public static void main(String[] args){
    LinkedList<String> stringList = new LinkedList<String>();
    stringList.addItem("Hello");
    stringList.addItem("World");
    stringList.addItem("!");

    LinkedList<Integer> intList = new LinkedList<Integer>();
    intList.addItem(1);
    intList.addItem(14);
    intList.addItem(8);
    intList.addItem(51);
    intList.remove(1);
    intList.remove(14);

    LinkedList<Integer> emptyList = new LinkedList<Integer>();

    System.out.println(stringList.printList());
    System.out.println(intList.printList());
    System.out.println(emptyList.printList());
    return;
  }
}
