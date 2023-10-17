import java.util.NoSuchElementException;
/**
 * Linked List where every node also references the previous node
 *
 * @author Nicholas Un
 * @version 1.0, 10/13/23
 * @param <E> Elements referenced by Nodes inside the DoublyLinkedList
 */
public class DoublyLinkedList<E> {
    Node<E> head; Node<E> tail;

    /**
     * Adds Node referencing E(lement) element to the end of the DoublyLinkedList, therefore making it the new Tail
     *
     * @param element Element reference of new Node
     */
    public void add(E element){
        Node<E> newTail = new Node<E>(element, null, tail);
        tail.setNextNode(newTail);
        tail = newTail;
    }

    /**
     * Adds Node referencing E(lement) at index of the DoublyLinkedList
     * Configures the surrounding Nodes to reference the New node as Next and Previous respectively
     *
     * @param index Index where Node will be inserted
     * @param element Element reference of new Node
     */
    public void add(int index, E element) {
    if(index < 0){ // if invalid index, throw exception
        throw new IndexOutOfBoundsException("Illegal Index");
    } else if(head == null) { //if empty list, make a non-connected node that is both the head and tail
        Node<E> newElement = new Node<>(element, null, null);
         head = newElement; tail = head;
    } else if(index == size()){ //if adding to the end, run the program that already does that
            add(element);
        } else if(index == 0) { //if adding to the beginning, make a new node which becomes the new head
            Node<E> newElement = new Node<>(element, head, null);
            head = newElement;
        }else{
            Node<E> temp = getNode(index - 1);
            Node<E> newElement = new Node<E>(element, temp, temp.getNextNode());
            temp.setNextNode(newElement);
        }
    }
    public E remove() {
        if (head == null) {
            throw new IllegalStateException("Empty List");
        } else if(size() == 1){
            E value = head.getValue();
            head = null; tail = null;
            return value;
        } else if(size() == 2){
            E value = tail.getValue();
            head.setNextNode(null);
            tail = head;
            return value;
        }else{
            Node<E> temp = getNode(size() - 2);
            Node<E> oldTail = temp.getNextNode();
            E value = oldTail.getValue();
            temp.setNextNode(null);
            tail = temp;
            return value;
        }
    }
    public E remove(int index){
        if(index < 0){
            throw new IndexOutOfBoundsException("Illegal Index");
        } else if(head == null) {
            throw new IllegalStateException("Empty List");
        } else if(index == size()){
            return remove();
        } else if(index == 0) {
            Node<E> temp = head;
            head = head.getNextNode(); head.setPreviousNode(null);
            return temp.getValue();
        }else{
            Node<E> temp = getNode(index);
            Node<E> nextNode = temp.getNextNode(); Node<E> prevNode = temp.getPreviousNode();
            nextNode.setPreviousNode(prevNode); prevNode.setNextNode(nextNode);
            return temp.getValue();
        }
    }
    public int size(){
        if(head == null){
            return 0;
        }
        int counter = 1;
        Node<E> temp = head;
        while (temp.getNextNode() != null){
            counter += 1;
            temp = temp.getNextNode();
        }
        return counter;
    }
    private Node<E> getNode(int index){
        if(index < 0) {
            throw new IndexOutOfBoundsException("Illegal Index");
        }
        Node<E> temp = head;
        for (int i = 0; i < index; i++){
            temp = temp.getNextNode();
        }
        return temp;
    }
}
