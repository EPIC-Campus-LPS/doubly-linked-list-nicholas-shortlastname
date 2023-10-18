import java.util.NoSuchElementException;

/**
 * Linked List where every node also references the previous node
 *
 * @param <E> Elements referenced by Nodes inside the DoublyLinkedList
 * @author Nicholas Un
 * @version 1.0, 10/13/23
 */
public class DoublyLinkedList<E> {
    Node<E> head;
    Node<E> tail;

    /**
     * Adds Node with element to the end of the DoublyLinkedList, therefore making it the new Tail
     *
     * @param element Element reference of new Node
     */
    public void add(E element) {
        if (head == null) {
            Node<E> onlyNode = new Node<E>(element, null, null);
            tail = onlyNode;
            head = tail;
        } else {
            Node<E> newTail = new Node<E>(element, null, tail);
            tail.setNextNode(newTail);
            tail = newTail;
        }
    }

    /**
     * Adds Node with element at index of the DoublyLinkedList
     * Configures the surrounding Nodes to reference the New node as Next and Previous respectively
     *
     * @param index   Index where Node will be inserted
     * @param element Element reference of new Node
     */
    public void add(int index, E element) {
        if (index < 0 || (index > size() && size() != 0)) { // if invalid index, throw exception
            throw new IndexOutOfBoundsException("Illegal Index");
        } else if (head == null) { //if empty list, make a non-connected node that is both the head and tail
            Node<E> newNode = new Node<>(element, null, null);
            head = newNode;
            tail = head;
        } else if (index == size()) { //if adding to the end, run the program that already does that
            add(element);
        } else if (index == 0) { //if adding to the beginning, make a new node which becomes the new head
            Node<E> newNode = new Node<>(element, head, null);
            head.setPreviousNode(newNode);
            head = newNode;
        } else { //
            Node<E> prevNode = getNode(index - 1);
            Node<E> nextNode = getNode(index);
            Node<E> newNode = new Node<E>(element, nextNode, prevNode);
            prevNode.setNextNode(newNode);
            nextNode.setPreviousNode(newNode);
        }
    }

    /**
     * Removes and returns tail Node, while reconfiguring tail to the new last Node
     *
     * @return Element of removed tail Node
     */
    public E remove() {
        if (head == null) {
            throw new IllegalStateException("Empty List");
        } else if (size() == 1) {
            Node<E> removed = head;
            head = null;
            tail = null;
            return removed.get();
        } else if (size() == 2) {
            Node<E> removed = tail;
            head.setNextNode(null);
            tail = head;
            return removed.get();
        } else {
            Node<E> newTail = getNode(size() - 2);
            Node<E> oldTail = newTail.getNextNode();
            E value = oldTail.get();
            newTail.setNextNode(null);
            tail = newTail;
            return oldTail.get();
        }
    }

    /**
     * Removes Node at index, and returns the Node's element
     * Reconfigures the previous and next Nodes to link with each other
     *
     * @param index Index where the Node will be removed
     * @return Element of removed Node
     */
    public E remove(int index) {
        if (index < 0 || (index > size() && size() != 0)) {
            throw new IndexOutOfBoundsException("Illegal Index");
        } else if (head == null) {
            throw new IllegalStateException("Empty List");
        } else if (index == size() - 1) {
            return remove();
        } else if (index == 0) {
            Node<E> removed = head;
            head = head.getNextNode();
            head.setPreviousNode(null);
            return removed.get();
        } else {
            Node<E> removed = getNode(index);
            Node<E> nextNode = removed.getNextNode();
            Node<E> prevNode = removed.getPreviousNode();
            nextNode.setPreviousNode(prevNode);
            prevNode.setNextNode(nextNode);
            return removed.get();
        }
    }

    /**
     * Sets the Node at index's Element to element
     * Returns what was replaced
     *
     * @param index   Index where the Node's Element will be replaced
     * @param element The new Element value
     * @return The old Element value
     */
    public E set(int index, E element) {
        if (index < 0 || (index > size() && size() != 0)) {
            throw new IndexOutOfBoundsException("Illegal Index");
        }else if(head == null){
            throw new IllegalStateException("Empty List");
        }else {
            Node<E> nodeChanged = getNode(index);
            E prevValue = nodeChanged.get();
            nodeChanged.set(element);
            return prevValue;
        }
    }

    /**
     * Turns the DoublyLinkedList Elements into a String
     *
     * @return String in List format of all Elements of DoublyLinkedList
     */
    public String toString() {
        String list = "[";
        Node<E> selectedNode = head;
        for (int i = 0; i < size() - 1; i++) {
            list += selectedNode.get().toString() + ", ";
            selectedNode = selectedNode.getNextNode();
        }
        list += selectedNode.get().toString() + "]";
        return list;
    }

    /**
     * Returns the size of the DoublyLinkedList
     *
     * @return Size of DoublyLinkedList
     */
    public int size() {
        if (head == null) {
            return 0;
        } else {
            int counter = 1;
            Node<E> temp = head;
            while (temp.getNextNode() != null) {
                counter += 1;
                temp = temp.getNextNode();
            }
            return counter;
        }
    }

    /**
     * Return the Node at index
     *
     * @param index The position of Node
     * @return Node at index
     */
    private Node<E> getNode(int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("Illegal Index");
        }
        Node<E> temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.getNextNode();
        }
        return temp;
    }
}
