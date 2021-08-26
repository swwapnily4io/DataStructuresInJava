package con.org.ds.datatypes;

public class EmployeeDoublyLinkedList {
  
  private EmployeeNode head;
  private EmployeeNode tail;
  private int size =0;
  
  public void addToFront(Employee employee) {
    EmployeeNode node = new EmployeeNode(employee);
    
    if(null == head)
      tail = node;
    else {
      head.setPrevious(node);
      node.setNext(head);
    }
    size++;
    head=node;
  }
  public boolean addBefore(Employee existing,Employee newemployee) {
    if(head==null) return false;
    boolean exist= false;
    EmployeeNode current = head;
    EmployeeNode replace = new EmployeeNode(newemployee);
    while(current!=null) {
      if(current.getEmployee().equals(existing)) {
        System.out.println("Found Match");
        current.getPrevious().setNext(replace);
        replace.setNext(current);
        exist = true;
        
      }
      current = current.getNext();
    }
    return exist;
  }
  public void addToEnd(Employee employee) {
    EmployeeNode node = new EmployeeNode(employee);
    if(null == tail)
      head = node;
    else {
      tail.setNext(node);
      node.setPrevious(tail);
      }
    size++;
    tail=node;
  }

  public void printList() {
    EmployeeNode current = head;
    System.out.println("HEAD ->");
    while(current!=null) {
      System.out.println(current+" <=>");
      current = current.getNext();
    }
    System.out.println("NULL");
  }
  public int getSize() {
    return size;
  }
  public boolean isEmpty() {
    return head==null;
  }
  
  public EmployeeNode removeNode() {
    if(isEmpty()) return null;
    EmployeeNode removeNode = head;
    if(head.getNext()==null) {
      tail =null;
    }else {
      head.getNext().setPrevious(null);
    }
   
    head = head.getNext();
    size--;
    removeNode.setNext(null);
    return head;
  }
  
  public EmployeeNode removeNodeFromEnd() {
    if(isEmpty()) return null;
    EmployeeNode removeNode = tail;
    
    if(tail.getPrevious()==null) {
      head =null;
    }else {
      tail.getPrevious().setNext(null);
    }
   
    tail = tail.getPrevious();
    size--;
    removeNode.setPrevious(null);
    return head;
  }
}
