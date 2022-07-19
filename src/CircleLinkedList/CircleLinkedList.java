package CircleLinkedList;

/**
 * @author Nwy-java
 */
public class CircleLinkedList {
    /**
     * 节点类
     */
    private static class Node{
        public Node(){
        }

        public Node(String item, Node next) {
            this.item = item;
            this.next = next;
        }

        /**
         * 节点值
         */
        private String item;
        /**
         * 下一个节点
         */
        private Node next;
    }

    /**
     * 起始节点
     */
    private Node first;

    public CircleLinkedList() {
        this.first = new Node();
    }

    public CircleLinkedList(Node first) {
        this.first = new Node();
    }

    /**
     * 判断链表是否为空
     * @return
     */
    public boolean isEmpty(){
        return this.first.next == this.first;
    }

    /**
     * 获取当前列表的最后一个节点。
     * @return
     */
    public Node getLastNode(){
        Node result;
        for(result = this.first;result.next!=this.first;result = result.next);
        return result;
    }

    public void add(String item){
        Node currentLastNode = this.getLastNode();
        Node newNode = new Node(item,this.first);
        currentLastNode.next = newNode;
    }

    @Override
    public String toString() {
        if(this.isEmpty()){
            return "[]";
        }
        StringBuilder result = new StringBuilder();
        result.append("[");
        for(Node currentNode = this.first.next; ;currentNode = currentNode.next){
            result.append(currentNode.item);
            if(currentNode.next == this.first)
                return result.append("]").toString();
            result.append(", ");
        }
    }
}
