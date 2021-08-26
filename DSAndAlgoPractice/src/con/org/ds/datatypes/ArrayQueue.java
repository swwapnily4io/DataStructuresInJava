
package con.org.ds.datatypes;

import java.util.NoSuchElementException;

public class ArrayQueue {

  private Employee[] queue;
  private int front;
  private int back;

  public ArrayQueue(int capacity) {
    queue = new Employee[capacity];
  }
  public void add(Employee e) {
    if (back == queue.length) {
      Employee[] newArray = new Employee[2 * queue.length];
      System.arraycopy(queue, 0, newArray, 0, queue.length);
      queue = newArray;
    }
    queue[back] = e;
    back++;
  }

  public Employee remove() throws NoSuchElementException {
    if (size() == 0) throw new NoSuchElementException("Queue is empty or No Such element in the queue");
    Employee e = queue[front];
    ;
    queue[front] = null;
    front++;
    if (size() == 0) {
      back = 0;
      front = 0;
    }
    return e;
  }

  public Employee peek() {
    if (size() == 0) throw new NoSuchElementException("Queue is empty or No Such element in the queue");
    return queue[front];
  }

  public void printQueue() {
    if (size() == 0) {
      System.out.println("Queue empty ");
      return;
    }
    
    System.out.println("Queue starts ");
    for (int i = front; i < back; i++) {
      System.out.println(queue[i]);
    }
  }

  public int size() {
    return back - front;
  }

}
