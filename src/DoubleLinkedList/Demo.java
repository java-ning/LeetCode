package DoubleLinkedList;

/**
 * @author Nwy-java
 */
public class Demo {
    public static void main(String[] args) {
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        doubleLinkedList.addLast("宁文语");
        doubleLinkedList.addLast("宁文语1");
        doubleLinkedList.addFirst("宁文语2");
        System.out.println(doubleLinkedList.toString());
        System.out.println(doubleLinkedList.reverseFormat());
        System.out.println(doubleLinkedList.elementsCount());
    }
}
