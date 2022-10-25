package DataStructure.LinkedList;

public class LinkedList {
    private Node head=null;
    int count = 0;

    public void addToEnd(int data){
        Node node = new Node(data);
        if(head ==null){
            head = node;
        }else {
            Node current= head;
            while (current.getNext()!=null){
                current = current.getNext();
            }
            current.setNext(node);
        }
    }

    public Node removeFromEnd(){
        if(head == null){
            System.out.println("List is Empty");
        }
        else {
            Node current = head;
            while (current.getNext().getNext()!=null){
                current = current.getNext();
            }
            current.setNext(null);
        }
        return head;

    }

    public void addToFront(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
        }
        else {
            Node current =head;
            node =head;
            head.setNext(current);
        }
    }

    public Node removeFromFront(){
        if(head == null){
            System.out.println("List is Empty");
        }else {
            Node current = head;
            current = current.getNext();
            head = current;
        }
        return head;
    }

    public void addNth(int data,int position){
        Node node = new Node(data);
        //if head is null and position is 0
        if(head == null){
            if(position!= 0){
                return;
            }
            else {
                head = node;
            }
        }
        //if head is not null and position is 0
        if(head!=null && position==0){
            node.setNext(head);
            head = node;
            return;
        }
        //find the exact position
        Node current = head;
        Node previous = null;
        int i =0;
        if(position>size()){
            System.out.println("invalid Position");
        }else {
            while (i<position){
                previous = current;
                current = current.getNext();
                if (current == null){
                    break;
                }
                i++;
            }
            node.setNext(current);
            previous.setNext(node);
        }
    }
    public int size(){
        if (head == null){
            System.out.println("List is empty");
        }
        else {
            Node current = head;
            while (current!=null){
                count++;
                current = current.getNext();
            }
        }
        return count;
    }

    public void middleElement(){
        int length =0;
        Node current = head;
        if (head == null){
            System.out.println("List is empty");
        }
        else {
            while (current!=null){
                length++;
                current = current.getNext();
            }
        }
        if(head ==null || length == 0){
            System.out.println("Empty cannot determined middle element");
        }
        else {
            int l = length / 2;

            Node temp = head;
            while (l != 0) {
                temp = temp.getNext();
                l--;
            }
            System.out.println("Middle Element is " + temp.getData());
        }
    }

    public Node reverse(){
        Node current = head;
        Node prev = null;
        if(head == null){
            System.out.println("List is empty cannot reverse");
        }
        else {
            while(current!=null){
                Node temp = current.getNext();
                current.setNext(prev);
                prev = current;
                current = temp;
            }
            head =prev;
        }

        return head;
    }

    public void printNode(){
        if (head == null){
            System.out.println("Empty");
        }
        else {
            Node current =head;
            while (current!=null){
                System.out.println(current.getData());
                current = current.getNext();
            }
            System.out.println("null");
        }
    }
}
