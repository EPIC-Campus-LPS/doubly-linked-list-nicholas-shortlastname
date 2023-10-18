public class Main {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.add(13);
        System.out.println(list.toString());
        list.add("14");
        System.out.println(list.toString());

        System.out.println(list.toString());


        list.add(1, "Inbetween!");
        System.out.println(list.toString());

        list.add(13);
        list.add(15);
        list.add(17);
        list.add(19);
        list.add(11);
        System.out.println(list.toString());

        System.out.println(list.remove());
        System.out.println(list.remove(1));

        System.out.println(list.size());

        list.set(2, 21);

        System.out.println(list.toString());

    }
}
