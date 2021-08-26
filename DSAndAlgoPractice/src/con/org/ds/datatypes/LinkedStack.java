package con.org.ds.datatypes;

import java.util.LinkedList;

public class LinkedStack {

  private LinkedList<Employee> stack;
  private LinkedList<String> stringStack;
  
  public LinkedStack() {
    stack = new LinkedList<Employee>();
    stringStack = new LinkedList<String>();
  }
  
  public void push(Employee e) {
    stack.push(e);
  }
  public void pushString(String e) {
    stringStack.push(e);
  }
  public Employee pop() {
    return stack.pop();
  }
  public String popString() {
    return stringStack.pop();
  }
  public Employee peek() {
    return stack.peek();
  }
  public String peekString() {
    return stringStack.peek();
  }
  public boolean isEmpty() {
    return stack.isEmpty();
  }
  public boolean isStringEmpty() {
    return stringStack.isEmpty();
  }
  
  public boolean isPalindrom() {
    if(stringStack.isEmpty()) return false;
    if(stringStack.size()==1) return true;
    boolean result = false;
    while(stringStack.size() >1) {
      System.out.println("palindrom check first "+stringStack.getFirst());
      System.out.println("palindrom check last "+stringStack.getLast());
      if(stringStack.getFirst().equalsIgnoreCase(stringStack.getLast())) {
        
        stringStack.pop();
        stringStack.remove(stringStack.getLast());
        System.out.println("palindrom check size "+stringStack.size());
        result = true;
      }else {
        return false;
        
      }
    }
    
    return result;
  }
  
  public void printStack() {
    for(Employee e:stack) {
      System.out.println(e);
    }
  }
  public void printStringStack() {
    for(String e:stringStack) {
      System.out.println(e);
    }
  }
}
