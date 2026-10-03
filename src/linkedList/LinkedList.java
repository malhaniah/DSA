package linkedList;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    class Node{
        int value;
        Node next;

        public Node (int value){
            this.value = value;
            this.next = null;
        }
    }

    public LinkedList (int value){
        Node node = new Node(value);
        head = node;
        tail = node;
        length = 1;
    }

    public void printList (){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

    public void getHead() {
        System.out.println("Head: " + head.value);
    }

    public void getTail() {
        System.out.println("Tail: " + tail.value);
    }

    public void append(int value){
        Node node = new Node(value);
        if (length == 0){
            head = node;
            tail = node;
        }else{
            tail.next = node;
            tail = node;
        }
        length = length + 1;
    }

    public void prepend(int value){
        Node node = new Node(value);
        if(length == 0) {
            head = node;
            tail = node;
        }else {
            node.next = head;
            head = node;
        }
        length++;
    }

    public Node removeLast(){
        if (length == 0) return null;
        Node temp = head;
        Node pre = head;
        while (temp.next != null){
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        if(length == 0){
            head = null;
            tail = null;
        }
        return temp;
    }

    public Node removeFirst(){
        if(length == 0) return null;
        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
        if (length == 0){
            tail = null;
        }
        return  temp;
    }

    public Node get (int index){
        if(index < 0 || index >= length){
            return null;
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }
}

