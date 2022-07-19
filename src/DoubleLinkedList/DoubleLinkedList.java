package DoubleLinkedList;

/**
 * @author Nwy-java
 */
public class DoubleLinkedList {
    public static void main(String[] args) {

    }

    /**
     * 双向链表节点
     */
    private static class Node{
        /**
         * 前驱节点地址
         */
        private Node prev;
        /**
         *  节点值
         */
        private String item;
        /**
         * 后置节点地址
         */
        private Node next;

        public Node() {
        }
        /**
         * @param prev 前驱节点地址
         * @param item 当前节点值
         * @param next 后置节点地址
         */
        public Node(Node prev, String item, Node next) {
            this.prev = prev;
            this.item = item;
            this.next = next;
        }
    }

    /**
     * 起始节点
     */
    private Node first;
    /**
     * 终止节点
     */
    private Node last;

    /**
     * 双向链表初始化
     */
    public DoubleLinkedList() {
        this.first = new Node();
        this.last = new Node(this.first,null,null);
        this.first.next = this.last;
    }

    /**
     * 判断是否为空
     * @return
     */
    public boolean isEmpty(){
        return this.first.next == this.last &&  this.last.prev == first;
    }

    public void addLast(String item){
        Node currentLastNode = this.last.prev;
        Node newNode = new Node(currentLastNode,item,this.last);
        //当前元素从后面节点指向newNode。
        currentLastNode.next = newNode;
        //最后节点的前一个变成newNode
        this.last.prev = newNode;
    }

    public void addFirst(String item){
        Node currentFirstNode = this.first.next;
        Node newNode = new Node(this.first,item,currentFirstNode);
        currentFirstNode.prev = newNode;
        this.first.next = newNode;
    }

    public  String reverseFormat(){
        if(this.isEmpty())
            return "[]";
        StringBuilder result = new StringBuilder();
        result.append("[");
        for(Node currentNode = this.last.prev; ;currentNode = currentNode.prev){
            result.append(currentNode.item);
            if(currentNode.prev == this.first){
                return result.append("]").toString();
            }
            result.append(", ");
        }
    }

    /**
     * 获取有效值的个数
     * @return
     */
    public int elementsCount(){
        int result = 0;
        for(Node currentNode = this.first;currentNode.next != this.last;currentNode = currentNode.next){
            result++;
        }
        return result;
    }


    private Node getIndexOfNode(int index){
        Node currentNode = this.first.next;
        for(int i = 0;i<index;i++){
            currentNode = currentNode.next;
        }
        return currentNode;
    }

    public String get(int index){
        Node targetNode = this.getIndexOfNode(index);
        String result = targetNode.item;

        targetNode.prev.next = targetNode.next;
        targetNode.next.prev = targetNode.prev;
        targetNode.prev = targetNode.next.prev;
        targetNode.next = null;
        targetNode.prev = null;
        return result;

    }

    @Override
    public String toString() {
        if(this.isEmpty())
            return "[]";
        StringBuilder result = new StringBuilder();
        result.append("[");
        for(Node currentNode = this.first.next; ;currentNode = currentNode.next){
            result.append(currentNode.item);
            if(currentNode.next == this.last){
                return result.append("]").toString();
            }
            result.append(", ");
        }
    }
}
