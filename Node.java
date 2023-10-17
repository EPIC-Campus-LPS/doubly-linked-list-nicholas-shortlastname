/**
 * Basic Node class to be used with the DoublyLinkedList
 * Each node contains an element, the next node, and the previous node, and has methods to change each
 *
 * @author Nicholas Un
 * @version 1.0, 10/13/23
 * @param <E> Element referenced by the Node
 */
public class Node<E> {
    private E element;
    private Node<E> next; private Node<E> previous;

    /**
     * When a Node is made, adds the Element, Next Node, and Previous Node references
     *
     * @param element Element the Node References
     * @param next Next Node in the DoublyLinkedList that is referenced
     * @param previous Previous Node in the DoublyLinkedList that is referenced
     */
    public Node(E element, Node next, Node previous){
        this.element = element;
        this.next = next;
        this.previous = previous;
    }

    /**
     * Returns the Element that the Node references
     *
     * @return Node's Referenced Element
     */
    public E get(){
        return element;
    }
    /**
     * Changes the Element that the Node references
     *
     * @param element The new Element that the Node now references
     */
    public void set(E element){
        this.element = element;
    }
    /**
     * Returns the next Node in the DoublyLinkedList
     * If there's no next Node, returns null
     *
     * @return Next Node in the DoublyLinkedList, or null
     */
    public Node getNextNode(){
        return next;
    }
    /**
     * Returns the previous Node in the DoublyLinkedList
     * If there's no previous Node, returns null
     *
     * @return Previous Node in the DoublyLinkedList, or null
     */
    public Node getPreviousNode(){
        return previous;
    }
    /**
     * Changes the next Node referenced in the DoublyLinkedList
     *
     * @param next The new next Node that the Node now references
     */
    public void setNextNode(Node next){
        this.next =  next;
    }
    /**
     * Changes the next Node referenced in the DoublyLinkedList
     *
     * @param previous The new previous Node that the Node now references
     */
    public void setPreviousNode(Node previous){
        this.previous =  previous;
    }

    /**
     * Returns the Element referenced in the Node
     *
     * @return Element referenced by Node
     */
    public E getValue(){
        return element;
    }
}
