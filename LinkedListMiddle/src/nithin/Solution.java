package nithin;


class Node {
        public int data;
        public Node next;

        public Node(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

public class Solution {

 
    Node head = null;
    Node tail = null;

    public void insertNode(int nodeData) {
            Node node = new Node(nodeData);

            if (head == null) {
                head = node;
            } else {
                tail.next = node;
            }

            tail = node;
        }
      public int getMiddle(){
        Node temp = head;
        int count = 0;
        while(temp.next != null)
        {
          count++;
          temp = temp.next;
        }
        if(temp != null)
         count++;

        temp = head;
        for(int i = 0; i < count / 2; i++)
          temp = temp.next;

        return temp.data;
      }
}