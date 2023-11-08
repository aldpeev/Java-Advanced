package L08Workshop_02;

public class LinkedList {
    private static class Node {
        public int value;
        public Node next;

        public Node (int value){
            this.value = value;
        }
    }

    private Node head;
    private int size;

    public LinkedList (){
        this.size = 0;
    }

    public void addFirst(int element){
        Node newNode = new Node(element);
        if (!isEmpty()){
            newNode.next = head;
        }

        head = newNode;
        size++;
    }

    private boolean isEmpty (){
        return size == 0;
    }


}
