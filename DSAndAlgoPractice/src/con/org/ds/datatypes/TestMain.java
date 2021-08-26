package con.org.ds.datatypes;

import java.util.LinkedList;

public class TestMain {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    Employee emp1 = new Employee("swwapnil","yadav",1);
    Employee emp2 = new Employee("snehal","yadav",1);
    Employee emp3 = new Employee("sanvie","yadav",1);
    Employee emp4 = new Employee("saie","yadav",1);
    Employee emp5 = new Employee("24","yadav",1);
    
    EmployeeLinkedList list = new EmployeeLinkedList();
    System.out.println(list.isEmpty());
    list.addToFront(emp1);
    list.addToFront(emp2);
    list.addToFront(emp3);
    list.addToFront(emp4);
    System.out.println(list.isEmpty());
    
    list.printList();
    System.out.println(list.getSize());
    list.removeNode();
    list.printList();
    System.out.println(list.getSize());
    
    
    EmployeeDoublyLinkedList Dlist = new EmployeeDoublyLinkedList();
    System.out.println(Dlist.isEmpty());
    Dlist.addToFront(emp1);
    Dlist.addToFront(emp2);
    Dlist.addToFront(emp3);
    Dlist.addToFront(emp4);
    System.out.println(Dlist.isEmpty());
    
    //Dlist.addToEnd(emp5);
    
    Dlist.printList();
   // Dlist.removeNode();
   // Dlist.printList();
   // Dlist.removeNodeFromEnd();
    //Dlist.printList();
    
    boolean result = Dlist.addBefore(emp1,emp5);
    System.out.println("add before "+result);
    Dlist.printList();
    
    LinkedList<Employee> lst = new LinkedList<>();
    lst.addLast(emp1);
    lst.addFirst(emp5);
    lst.addFirst(emp2);
    lst.addFirst(emp3);
    lst.addFirst(emp4);
    
    System.out.println("HEAD ->");
    for(Employee e: lst) {
      System.out.println(e);
      System.out.println("<=>");
    }
    System.out.println("null");
    
    lst.removeFirst();
    System.out.println("HEAD ->");
    for(Employee e: lst) {
      System.out.println(e);
      System.out.println("<=>");
    }
    System.out.println("null");
    
    lst.removeLast();
    System.out.println("HEAD ->");
    for(Employee e: lst) {
      System.out.println(e);
      System.out.println("<=>");
    }
    System.out.println("null");
    
    LinkedStack stack = new LinkedStack();
    stack.push(emp1);
    stack.push(emp2);
    stack.printStack();
    stack.pop();
    stack.printStack();
    stack.push(emp2);
    System.out.println("PEEK "+stack.peek());
    stack.printStack();
    
    LinkedStack stringStack = new LinkedStack();
    //stringStack.pushString("M");
    //stringStack.pushString("A");
    //stringStack.pushString("D");
    stringStack.pushString("A");
    stringStack.pushString("M");
    
    stringStack.printStringStack();
    System.out.println("Is Palindrom = "+stringStack.isPalindrom());
    
    ArrayQueue queue = new ArrayQueue(5);
    queue.add(emp1);
    queue.add(emp5);
    queue.remove();
    queue.add(emp2);
    queue.remove();
    queue.add(emp3);
    queue.remove();
    queue.add(emp4);
    
    System.out.println("PEEK - "+queue.peek());
    queue.printQueue();
   }

}
