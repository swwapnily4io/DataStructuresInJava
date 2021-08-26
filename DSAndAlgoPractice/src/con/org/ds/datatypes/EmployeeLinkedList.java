package con.org.ds.datatypes;

public class EmployeeLinkedList {
  
  private EmployeeNode head;
  private int size =0;
  
  public void addToFront(Employee employee) {
    EmployeeNode node = new EmployeeNode(employee);
    node.setNext(head);
    size++;
    head=node;
  }

  public void printList() {
    EmployeeNode current = head;
    System.out.println("HEAD ->");
    while(current!=null) {
      System.out.println(current+" ->");
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
    head = head.getNext();
    size--;
    removeNode.setNext(null);
    return head;
  }
}
