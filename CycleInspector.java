public class CycleInspector {
  //A simplified implementation of Brent's cycle detection algorithm
  //for finding the size of a loop in a singly linked list given the list's tail.
  public static int cycleSize(Node tortoise) {
    Node hare = tortoise;
    int steps = 0;
    int lim = 2;

    while(true) {
       hare = hare.getNext();
       steps++;
    
       if(tortoise.equals(hare))
         return steps;
    
       if(steps == lim) {
         steps = 0;
         lim *= 2;
         tortoise = hare;
       }
    }           
  }

  public static void main(String[] args) {
    //The last new vertex in the cycle
    Node cycleEnd = new Node();
    //The first vertex in the cycle
    Node cycleStart = new Node(new Node(new Node(new Node(new Node(cycleEnd)))));
    //The following closes the cycle
    cycleEnd.setNext(cycleStart);

    //The final linked list with the tail connected to the cycle
    Node tail = new Node(new Node(new Node(new Node(new Node(cycleStart)))));

    //Expect the algorithm to return 6, the number of edges in the graph
    //between the cycleStart and the cycleEnd
    System.out.println(cycleSize(tail));

  }
}