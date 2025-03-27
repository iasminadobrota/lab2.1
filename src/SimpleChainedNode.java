public class SimpleChainedNode implements Node {
    private Node head;
    private int value;
    private SimpleChainedNode next;
    public SimpleChainedNode(int value) {
        this.head = head;
        this.value = value;
        this.next=null;
    }
    @Override
    public int getValue() {
        return value;
    }

    @Override
    public void setValue(int val) {
        this.value = val;
    }

    public SimpleChainedNode getNext() {
        return next;
    }
    public void setNextNode(SimpleChainedNode next) {
        this.next = next;
    }

    public SimpleChainedNode getNextNode() {
        return next;
    }
}
