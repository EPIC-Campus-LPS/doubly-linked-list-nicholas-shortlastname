import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoublyLinkedListTest {

    @Test
    @DisplayName("Add without index")
    void add() {
        DoublyLinkedList list1 = new DoublyLinkedList();
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        assertEquals("[3, 4, 5, 6]", list1.toString());
    }

    @Test
    @DisplayName("Add with index")
    void testAdd() {
        DoublyLinkedList list1 = new DoublyLinkedList();
        list1.add(0, 3);
        list1.add(4);
        list1.add(1, 5);
        list1.add(2, 6);
        list1.add(1, 7);
        list1.add(5, 8);
        list1.add(0, 2);
        assertAll(() -> assertEquals("[2, 3, 7, 5, 6, 4, 8]", list1.toString()),
                () -> assertThrows(IndexOutOfBoundsException.class, () -> list1.add(-1, 1)),
                () -> assertThrows(IndexOutOfBoundsException.class, () -> list1.add(99, 99)));
    }

    @Test
    @DisplayName("Remove without index")
    void remove() {
        DoublyLinkedList list1 = new DoublyLinkedList();
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        assertAll(() -> assertEquals(6, list1.remove()),
                () -> assertEquals(5, list1.remove()),
                () -> assertEquals(4, list1.remove()),
                () -> assertEquals(3, list1.remove()),
                () -> assertThrows(IllegalStateException.class, () -> list1.remove()));
    }

    @Test
    @DisplayName("Remove with index")
    void testRemove() {
        DoublyLinkedList list1 = new DoublyLinkedList();
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        assertAll(() -> assertThrows(IndexOutOfBoundsException.class, () -> list1.remove(-1)),
                () -> assertThrows(IndexOutOfBoundsException.class, () -> list1.remove(99)),
                () -> assertEquals(6, list1.remove(3)),
                () -> assertEquals(3, list1.remove(0)),
                () -> assertEquals(5, list1.remove(1)),
                () -> assertEquals(4, list1.remove(0)),
                () -> assertThrows(IllegalStateException.class, () -> list1.remove(0)));
    }

    @Test
    @DisplayName("Setting Elements")
    void set() {
        DoublyLinkedList list1 = new DoublyLinkedList();
        DoublyLinkedList list2 = new DoublyLinkedList();
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        assertAll(() -> assertThrows(IndexOutOfBoundsException.class, () -> list1.set(-1, 1)),
                () -> assertThrows(IndexOutOfBoundsException.class, () -> list1.set(99, 99)),
                () -> assertEquals(4, list1.set(1, 44)),
                () -> assertEquals(6, list1.set(3, 66)),
                () -> assertThrows(IllegalStateException.class, () -> list2.set(0, 0)));
    }

    @Test
    @DisplayName("Sizes")
    void size() {
        DoublyLinkedList list1 = new DoublyLinkedList();
        DoublyLinkedList list2 = new DoublyLinkedList();
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        assertAll(() -> assertEquals(4, list1.size()),
                () -> assertEquals(0, list2.size()));
    }
}